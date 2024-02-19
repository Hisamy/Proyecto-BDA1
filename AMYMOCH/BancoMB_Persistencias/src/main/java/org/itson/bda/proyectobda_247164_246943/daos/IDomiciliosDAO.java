
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Domicilio;
import org.itson.bda.proyectobda_247164_246943.dtos.DomicilioNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;




public interface IDomiciliosDAO {
    List<Domicilio> consultar() throws PersistenciaException;

    Domicilio agregar(DomicilioNuevoDTO domicilioNuevo) throws PersistenciaException;
}
