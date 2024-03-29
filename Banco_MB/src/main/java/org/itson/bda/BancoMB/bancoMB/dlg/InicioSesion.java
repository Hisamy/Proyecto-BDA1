package org.itson.bda.BancoMB.bancoMB.dlg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.itson.bda.BancoMB.bancoMB.BancoMB;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;

public class InicioSesion extends javax.swing.JFrame {

    private Acciones opcion;
    private static final Logger LOGGER = Logger.getLogger(InicioSesion.class.getName());
    final IConexion conexionBD;

    public InicioSesion(IConexion conexion) {
        initComponents();
        this.conexionBD = conexion;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        lblCorreoElectronico = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblBancoMB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));

        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Bienvenido");

        lblCorreoElectronico.setForeground(new java.awt.Color(204, 204, 255));
        lblCorreoElectronico.setText("Correo eléctronico");

        txtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoActionPerformed(evt);
            }
        });

        lblClave.setForeground(new java.awt.Color(204, 204, 255));
        lblClave.setText("Clave");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCorreoElectronico)
                    .addComponent(lblClave)
                    .addComponent(txtClave)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciarSesion))
                    .addComponent(txtCorreoElectronico))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblBienvenido)
                .addGap(18, 18, 18)
                .addComponent(lblCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnRegresar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblBancoMB.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        lblBancoMB.setForeground(new java.awt.Color(0, 51, 102));
        lblBancoMB.setText("Banco MB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBancoMB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBancoMB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        BancoMB.menuInicio.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            String correoElectronico = txtCorreoElectronico.getText();
            String clave = txtClave.getText();
            Integer claves = Integer.parseInt(clave);

            if (validarCorreo(correoElectronico) && validarClave(claves)) {
                try {
                    if (verificarInicioSesion(correoElectronico, claves)) {
                        LOGGER.info("Inicio de sesión exitoso para el usuario");
                        JOptionPane.showMessageDialog(rootPane,
                                "Inicio de sesión exitoso",
                                "Iniciar sesión",
                                JOptionPane.INFORMATION_MESSAGE);
                        SesionIniciada sesionIniciada = new SesionIniciada();
                        sesionIniciada.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane,
                                "Inicio de sesión fallido",
                                "Iniciar sesión",
                                JOptionPane.ERROR_MESSAGE);
                        LOGGER.warning("Inicio de sesión fallido para el usuario");
                    }
                } catch (SQLException ex) {
                    // Handle SQLException when calling verificarInicioSesion
                    JOptionPane.showMessageDialog(rootPane,
                            "Error en la verificación de inicio de sesión",
                            "Error de base de datos",
                            JOptionPane.ERROR_MESSAGE);
                    LOGGER.warning("Error de base de datos al verificar inicio de sesión: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Llene correctamente los campos",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                LOGGER.warning("Correo o Clave inválida");
            }
        } catch (NumberFormatException ex) {
            // Handle the case where clave is not a valid Integer
            JOptionPane.showMessageDialog(rootPane,
                    "La clave debe ser un número válido",
                    "Error de formato",
                    JOptionPane.ERROR_MESSAGE);
            LOGGER.warning("Error de formato en la clave: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private boolean verificarInicioSesion(String correoElectronico, Integer clave) throws SQLException {     
            String sentenciaSQL = """
                                  SELECT correo, clave FROM clientes 
                                  WHERE correo = ? 
                                  AND clave = ?
                                  ;""";
            try (Connection connection = this.conexionBD.obtenerConexion(); PreparedStatement statement = connection.prepareStatement(sentenciaSQL)) {

                statement.setString(1, txtCorreoElectronico.getText());
                statement.setInt(2, Integer.parseInt(txtClave.getText()));

                try (ResultSet resultados = statement.executeQuery()) {
                    if (resultados.next()) {
                        String correo = resultados.getString("correo");
                        Integer contrasenia = resultados.getInt("clave");
                        return true;
                    }
                }
            } catch (SQLException e) {
                return false;
            } 
        return false;

    }   
    

    private void txtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed
    private boolean validarCorreo(String correoElectronico) {
        // Regular expression for a valid email address
        String email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(correoElectronico);
        return matcher.matches();
    }

    private boolean validarClave(Integer clave) {
        if (clave == null) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBancoMB;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblCorreoElectronico;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtCorreoElectronico;
    // End of variables declaration//GEN-END:variables
}
