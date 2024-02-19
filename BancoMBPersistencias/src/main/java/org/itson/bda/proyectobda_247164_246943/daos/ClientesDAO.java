package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.ClienteNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz IClientesDAO y se encarga de realizar
 * operaciones de acceso a datos para la entidad Clientes en la base de datos.
 */
public class ClientesDAO implements IClientesDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    /**
     * Constructor de la clase que recibe una instancia de IConexion.
     *
     * @param conexion Instancia de IConexion para manejar la conexión a la base
     * de datos.
     */
    public ClientesDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }
    
    /**
     * Método para consultar todos los clientes almacenados en la base de datos.
     *
     * @return Lista de objetos Clientes con la información de los clientes
     * consultados.
     * @throws PersistenciaException Si ocurre un error durante la consulta a la
     * base de datos.
     */
    @Override
    public List<Clientes> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT id, correo,clave,fecha_nacimiento, nombre, apellido_paterno,apellido_materno
                              FROM clientes;
                              """;
        List<Clientes> listaClientes = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer id = resultados.getInt("id");
                String correo = resultados.getString("Correo");
                Integer clave = resultados.getInt("clave");
                Date fechaNacimiento = resultados.getDate("fechaNacimiento");
                String nombre = resultados.getString("nombre");
                String apellidoPaterno = resultados.getString("apellidoPaterno");
                String apellidoMaterno = resultados.getString("apellidoMaterno");
                Clientes cliente = new Clientes(id, correo, fechaNacimiento, nombre, apellidoMaterno, apellidoPaterno);
                listaClientes.add(cliente);
            }
            logger.log(Level.INFO, "Se consultaron {0} clientes", listaClientes.size());
            return listaClientes;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los clientes.", e);
            throw new PersistenciaException("No se pudieron consultar los clientes.", e);
        }
    }

    /**
     * Método para agregar un nuevo cliente a la base de datos.
     *
     * @param clienteNuevo Objeto ClienteNuevoDTO con la información del nuevo
     * cliente.
     * @return Objeto Clientes con la información del cliente agregado.
     * @throws PersistenciaException Si ocurre un error durante la inserción en
     * la base de datos.
     */
    @Override
    public Clientes agregar(ClienteNuevoDTO clienteNuevo) throws PersistenciaException {
        String sentenciaSQL = """
                              INSERT INTO clientes(correo,clave,fecha_nacimeinto,nombre,apellido_paterno, apellido_materno) 
                              VALUES(?, ?, ?,?,?);
                              """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ) {
            
            comando.setString(1, clienteNuevo.getCorreoElectronico());
             comando.setInt(2, clienteNuevo.getClave());
             comando.setDate(3, clienteNuevo.getFechaNacimiento());           
            comando.setString(4, clienteNuevo.getNombre());
            comando.setString(5, clienteNuevo.getApellidoPaterno());
            comando.setString(6, clienteNuevo.getApellidoMaterno());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} clientes", numeroRegistrosInsertados);
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            return new Clientes(idsGenerados.getInt(1),clienteNuevo.getClave(),clienteNuevo.getCorreoElectronico(),clienteNuevo.getFechaNacimiento() ,clienteNuevo.getNombre(), clienteNuevo.getApellidoPaterno(), clienteNuevo.getApellidoMaterno());
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar el cliente.", e);
            throw new PersistenciaException("No se pudo guardar el cliente.", e);
        }
    }

   
}
