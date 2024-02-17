

package com.mycompany.bancomb;


public class BancoMB {

    public static void main(String[] args) {
      String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "cinco123";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        IClientesDAO clientesDAO = new ClientesDAO(conexion);
        IRetiroSinCuentaDAO retirosSinCuentaDAO = new RetirosSinCuentaDAO(conexion);
        RetiroSinCuentaForm clientesForm = new RetiroSinCuentaForm(clientesDAO);
        clientesForm.setVisible(true);
    }
}
