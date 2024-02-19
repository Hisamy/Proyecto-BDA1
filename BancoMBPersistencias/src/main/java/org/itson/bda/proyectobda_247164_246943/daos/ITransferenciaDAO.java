
package org.itson.bda.proyectobda_247164_246943.daos;

import java.util.List;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Transferencia;
import org.itson.bda.proyectobda_247164_246943.dtos.TransferenciaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;


public interface ITransferenciaDAO {
     List<Transferencia> consultar() throws PersistenciaException;

    Transferencia agregar(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException;
}

