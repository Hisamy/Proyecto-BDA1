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
import org.itson.bda.proyectobda_247164_246943.bancoMB.Transferencia;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.dtos.TransferenciaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
 * Clase que implementa la interfaz ITransferenciaDAO y se encarga de realizar
 * operaciones de acceso a datos para la entidad Transferencia en la base de
 * datos.
 */
public class TransferenciaDAO implements ITransferenciaDAO {

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    /**
     * Constructor de la clase que recibe una instancia de IConexion.
     *
     * @param conexion Instancia de IConexion para manejar la conexión a la base
     * de datos.
     */
    public TransferenciaDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    /**
     * Método para consultar todas las transferencias almacenadas en la base de
     * datos.
     *
     * @return Lista de objetos Transferencia con la información de las
     * transferencias consultadas.
     * @throws PersistenciaException Si ocurre un error durante la consulta a la
     * base de datos.
     */
    @Override
    public List<Transferencia> consultar() throws PersistenciaException {
        String sentenciaSQL = """
                              SELECT folio,
                                cuenta_origen ,
                                num_cuenta_receptor ,
                                monto,
                                motivo_pago,
                              FROM transferencias;
                              """;
        List<Transferencia> listaTransferencias = new LinkedList<>();
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);) {
            ResultSet resultados = comando.executeQuery();
            while (resultados.next()) {
                Integer folio = resultados.getInt("folio");
                Integer cuentaOrigen = resultados.getInt("cuenta_origen");
                Integer numCuentaReceptor = resultados.getInt("num_cuenta_receptor");
                Float monto = resultados.getFloat("Monto");
                String motivoPago = resultados.getString("motivo_pago");
                Transferencia transferencia = new Transferencia(folio, cuentaOrigen, numCuentaReceptor, monto, motivoPago);
                listaTransferencias.add(transferencia);
            }
            logger.log(Level.INFO, "Se consultaron {0} Transferencias", listaTransferencias.size());
            return listaTransferencias;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar las transferencias.", e);
            throw new PersistenciaException("No se pudieron consultar las transferencias", e);
        }
    }

    /**
     * Método para agregar una nueva transferencia a la base de datos.
     *
     *
     * @param transferenciaNueva Objeto TransferenciaNuevaDTO con la información
     * de la nueva transferencia.
     * @return Objeto Transferencia con la información de la transferencia
     * agregada.
     * @throws PersistenciaException Si ocurre un error durante la inserción en
     * la base de datos.
     */
    @Override
    public Transferencia agregar(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException {
        String sentenciaSQL = """
                              INSERT INTO Transferencia(folio,
                                                              cuenta_origen ,
                                                              num_cuenta_receptor ,
                                                              monto,
                                                              motivo_pago, ) 
                              VALUES(?, ?, ?, ?,?);
                              """;
        try (
                Connection conexion = this.conexionBD.obtenerConexion(); PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, transferenciaNueva.getFolio());
            comando.setInt(2, transferenciaNueva.getNumeroCuentaOrigen());
            comando.setInt(3, transferenciaNueva.getNumeroCuentaReceptor());
            comando.setDouble(4, transferenciaNueva.getMonto());
            comando.setString(5, transferenciaNueva.getMotivoPago());
            int numeroRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregaron {0} cuentas", numeroRegistrosInsertados);
            ResultSet numeroCuentasGeneradas = comando.getGeneratedKeys();
            numeroCuentasGeneradas.next();
            return new Transferencia(transferenciaNueva.getFolio(), transferenciaNueva.getNumeroCuentaOrigen(), transferenciaNueva.getNumeroCuentaReceptor(), transferenciaNueva.getMonto(), transferenciaNueva.getMotivoPago());
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo guardar la transferencia.", e);
            throw new PersistenciaException("No se pudo guardar el transferencia.", e);
        }
    }

}
