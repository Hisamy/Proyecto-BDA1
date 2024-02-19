

package org.itson.bda.BancoMB.bancoMB;

import org.itson.bda.BancoMB.bancoMB.dlg.MenuInicio;
import org.itson.bda.BancoMB.bancoMB.dlg.RetiroSinCuentaForm;
import org.itson.bda.proyectobda_247164_246943.conexiones.Conexion;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.daos.ClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.DomiciliosDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IDomiciliosDAO;
import org.itson.bda.proyectobda_247164_246943.daos.IRetiroSinCuentaDAO;
import org.itson.bda.proyectobda_247164_246943.daos.RetirosSinCuentaDAO;

public class BancoMB {

    public static MenuInicio menuInicio;
    
    public static void main(String[] args) {
      String cadenaConexion = "jdbc:mysql://localhost/banco_mb";
        String usuario = "root";
        String password = "1234";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        IClientesDAO clientesDAO = new ClientesDAO(conexion);
        IDomiciliosDAO domiciliosDAO = new DomiciliosDAO(conexion);
        IRetiroSinCuentaDAO retirosSinCuentaDAO = new RetirosSinCuentaDAO(conexion);
        RetiroSinCuentaForm retiroSinCuentaForm = new RetiroSinCuentaForm(retirosSinCuentaDAO);
        menuInicio = new MenuInicio(clientesDAO, domiciliosDAO);
        menuInicio.setVisible(true);
        
    }
}
