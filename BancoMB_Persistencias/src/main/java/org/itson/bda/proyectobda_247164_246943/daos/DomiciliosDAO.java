
package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Domicilio;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import static org.itson.bda.proyectobda_247164_246943.daos.CuentasDAO.logger;
import org.itson.bda.proyectobda_247164_246943.dtos.DomicilioNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


public class DomiciliosDAO implements IDomiciliosDAO{
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public DomiciliosDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    @Override
    public List<Domicilio> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT numero_domicilio, calle, colonia, codigo_postal
                              FROM Domicilio;
                              """;
        List<Domicilio> listaDomicilio = new LinkedList<>();
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer numero_domicilio = resultados.getInt("numeroDomicilio");
                String calle = resultados.getString("calle");
                String colonia = resultados.getString("colonia");
                Integer codigo_postal = resultados.getInt("codigoPostal");
                Domicilio domicilio = new Domicilio(numero_domicilio, calle, colonia, codigo_postal);
                listaDomicilio.add(domicilio);
            }
            logger.log(Level.INFO, "Se consultaron {0} domicilios", listaDomicilio.size());
            return listaDomicilio;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los domicilios.", e);
            throw new PersistenciaException("No se pudieron consultar los domicilios.", e);
        }
    }

    @Override
    public Domicilio agregar(DomicilioNuevoDTO domicilioNuevo) throws PersistenciaException {
        String sentenciaSQL = """
                              INSERT INTO domicilio(numero_domicilio, calle, colonia, codigo_postal) 
                              VALUES(?, ?, ?, ?);
                              """;
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, domicilioNuevo.getCP());
            comando.setString(2, domicilioNuevo.getCalle());
             comando.setString(2, domicilioNuevo.getColonia());
            comando.setInt(3, domicilioNuevo.getNumeroDomicilio());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} domicilios", numeroRegistrosInsertados);
            ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
            numeroCuentasGeneradas.next();
            return new Domicilio(domicilioNuevo.getNumeroDomicilio(), domicilioNuevo.getCalle(), domicilioNuevo.getColonia(), domicilioNuevo.getCP());
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar la cuenta.", e);
            throw new PersistenciaException("No se pudo guardar el cuenta.", e);
        }
    }

}
