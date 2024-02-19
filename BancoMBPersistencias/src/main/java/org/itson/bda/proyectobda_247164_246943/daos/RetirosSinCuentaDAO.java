package org.itson.bda.proyectobda_247164_246943.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.bancoMB.RetirosSinCuenta;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

public class RetirosSinCuentaDAO implements IRetiroSinCuentaDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public RetirosSinCuentaDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    @Override
    public List<RetirosSinCuenta> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT folio, fechaHora, contrasenia ,monto
                              FROM retiros_sin_cuenta;
                              """;
        List<RetirosSinCuenta> listaRetirosSinCuentas = new LinkedList<>();
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer folio = resultados.getInt("folio");
                Date fechaHora = resultados.getDate("fechaHora");
                int contrasenia = resultados.getInt("Contraseña");
                float monto = resultados.getFloat("Monto");
                RetirosSinCuenta retirosSinCuenta = new RetirosSinCuenta(fechaHora, contrasenia, folio, monto);
                listaRetirosSinCuentas.add(retirosSinCuenta);
            }
            logger.log(Level.INFO, "Se consultaron {0} Retiros Sin Cuenta", listaRetirosSinCuentas.size());
            return listaRetirosSinCuentas;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar los Retiros Sin Cuenta.", e);
            throw new PersistenciaException("No se pudieron consultar los Retiros Sin Cuenta", e);
        }
    }

    @Override
    public RetirosSinCuenta agregar(RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo) throws PersistenciaException {
        String sentenciaSQL = """
                          INSERT INTO retiros_sin_cuenta(folio, fechaHora, contrasenia, monto) 
                          VALUES (?, ?, ?, ?);
                          """;
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, retiroSinCuentaNuevo.getFolio());
            comando.setTimestamp(2, Timestamp.valueOf(retiroSinCuentaNuevo.getFechaGenerada()));
            comando.setFloat(3, retiroSinCuentaNuevo.getMonto());
            comando.setInt(4, retiroSinCuentaNuevo.getContrasenia());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} Retiros Sin Cuenta", numeroRegistrosInsertados);
            ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
            numeroCuentasGeneradas.next();
            
            // Convierte LocalDateTime a Timestamp y luego a Date
            Timestamp timestamp = Timestamp.valueOf(retiroSinCuentaNuevo.getFechaGenerada());
            Date fechaHora = new Date(timestamp.getTime());

            // Crea y devuelve un objeto RetirosSinCuenta usando la fechaHora convertida
            return new RetirosSinCuenta(
                    fechaHora,
                    retiroSinCuentaNuevo.getContrasenia(),
                    retiroSinCuentaNuevo.getFolio(),
                    retiroSinCuentaNuevo.getMonto()
            );
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar la Retiros Sin Cuenta.", e);
            throw new PersistenciaException("No se pudo guardar el Retiros Sin Cuenta.", e);
        }
    }

}