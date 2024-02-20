
package org.itson.bda.proyectobda_247164_246943.conexiones;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Representa la interfaz para obtener la conección a la base de datos.
 * @author Usuario
 */
public interface IConexion {
    /**
     * @return una coneccion al objeto representando la conección establecida a la base de datos.
     * @throws SQLException si un error de acceso a la base de datos sucede.
     */
        Connection obtenerConexion() throws SQLException;

}
