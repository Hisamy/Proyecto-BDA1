package org.itson.bda.proyectobda_247164_246943.daos;




import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.dtos.ClienteNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

/**
 * Interfaz para el objeto de acceso a datos (DAO) relacionado con clientes.
 * @author Usuario
 */
public interface IClientesDAO {
    /**
     * 
     * @return
     * @throws PersistenciaException 
     */
    List<Clientes> consultar() throws PersistenciaException;
/**
 * 
 * @param clienteNuevo
 * @return
 * @throws PersistenciaException 
 */
    Clientes agregar(ClienteNuevoDTO clienteNuevo) throws PersistenciaException;
}
