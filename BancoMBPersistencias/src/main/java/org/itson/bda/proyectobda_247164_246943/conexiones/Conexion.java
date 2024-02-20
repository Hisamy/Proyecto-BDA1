
package org.itson.bda.proyectobda_247164_246943.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Representa la class para establecer una conección a la base de datos.
 * Implementa una interfaz IConexion. 
 * @author Usuario
 */
public class Conexion implements IConexion{
    
    final String cadenaConexion;
    final String usuario;
    final String password;
    static final Logger logger = Logger.getLogger(Conexion.class.getName());
    /**
     * Implementa el metodo obtenerConexion de la interfaz IConexion. 
     * @param cadenaConexion Regresa una cadena conexion con el url.
     * @param usuario Regresa el usuario de la base de datos.
     * @param password Regresa la contraseña de la base de datos.
     */
    public Conexion(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }
    /**
     * @return una conexion al objeto estableciendo una conección a la base de datos.
     * @throws SQLException  si un error al acceso de la base de datos sucede.
     */
    @Override
    public Connection obtenerConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        logger.log(Level.INFO, "Conexion establecida {0}", cadenaConexion);
        return conexion;
    }
}
