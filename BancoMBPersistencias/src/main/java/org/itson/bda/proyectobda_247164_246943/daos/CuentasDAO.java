package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz ICuentasDAO y se encarga de realizar
 * operaciones de acceso a datos para la entidad Cuentas en la base de datos.
 */
public class CuentasDAO implements ICuentasDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public CuentasDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    /**
     * Método para consultar todas las cuentas almacenadas en la base de datos.
     *
     * @return Lista de objetos Cuentas con la información de las cuentas
     * consultadas.
     * @throws PersistenciaException Si ocurre un error durante la consulta a la
     * base de datos.
     */
    @Override
    public List<Cuentas> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT numero_cuenta, fecha_apertura, saldo, id_cliente
                              FROM cuentas;
                              """;
        List<Cuentas> listaClientes = new LinkedList<>();
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer numero_cuenta = resultados.getInt("numero_cuenta");
                Date fecha_apertura = resultados.getDate("fecha_apertura");
                double saldo = resultados.getDouble("saldo");
                Integer idCliente = resultados.getInt("id_cliente");
                Clientes cliente = new Clientes();
                cliente.setId(idCliente);
                Cuentas cuenta = new Cuentas(numero_cuenta, fecha_apertura, saldo, cliente);
                listaClientes.add(cuenta);
            }
            logger.log(Level.INFO, "Se consultaron {0} cuentas", listaClientes.size());
            return listaClientes;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los cuentas.", e);
            throw new PersistenciaException("No se pudieron consultar los cuentas.", e);
        }
    }

    /**
     * Método para agregar una nueva cuenta a la base de datos.
     *
     * @param cuentaNueva Objeto CuentaNuevaDTO con la información de la nueva
     * cuenta.
     * @return Objeto Cuentas con la información de la cuenta agregada.
     * @throws PersistenciaException Si ocurre un error durante la inserción en
     * la base de datos.
     */
    @Override
    public Cuentas agregar(CuentaNuevaDTO cuentaNueva, Integer idCliente) throws PersistenciaException {
        String sentenciaSQL = """
                          INSERT INTO cuentas(fecha_apertura, saldo, id_cliente)
                          VALUES(?, ?, ?);
                          """;
    try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
    ) {
        comando.setDate(1, cuentaNueva.getFechaApertura());
        comando.setDouble(2, cuentaNueva.getSaldo());
        comando.setInt(3, idCliente);

        int numeroRegistrosInsertados = comando.executeUpdate();
        logger.log(Level.INFO, "Se agregaron {0} cuentas", numeroRegistrosInsertados);
        
        ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
        numeroCuentasGeneradas.next();
        
        return new Cuentas(
            numeroCuentasGeneradas.getInt(1),
            cuentaNueva.getFechaApertura(),
            cuentaNueva.getSaldo(),
            cuentaNueva.getIdCliente()
        );
    } catch (SQLException e) {
        logger.log(Level.SEVERE, "No se pudo guardar la cuenta.", e);
        throw new PersistenciaException("No se pudo guardar la cuenta.", e);
    }

}
}

