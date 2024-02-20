package org.itson.bda.BancoMB.bancoMB.dlg;

import java.awt.HeadlessException;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import org.itson.bda.BancoMB.bancoMB.BancoMB;
import org.itson.bda.proyectobda_247164_246943.conexiones.Conexion;
import org.itson.bda.proyectobda_247164_246943.daos.CuentasDAO;
import org.itson.bda.proyectobda_247164_246943.daos.ICuentasDAO;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;

public class MensajeMontoCuenta extends javax.swing.JFrame {

    private ICuentasDAO cuentasDAO;

    public MensajeMontoCuenta(ICuentasDAO cuentasDAO) {
        initComponents();
        this.cuentasDAO = cuentasDAO;
    }

    public MensajeMontoCuenta() throws HeadlessException {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        numeroCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monto de la cuenta");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        lblMonto.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto.setText("Monto");

        lblTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Por favor, ingrese la cuenta y el monto.");

        lblCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCuenta.setText("Cuenta");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        numeroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        numeroCuenta.setText("numero Cuenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMonto)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCuenta)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegresar)
                            .addGap(63, 63, 63)
                            .addComponent(btnCrear))
                        .addComponent(numeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(lblTexto)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTexto)
                .addGap(26, 26, 26)
                .addComponent(lblMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnCrear))
                .addGap(27, 27, 27))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Banco MB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        SesionIniciada sesionIniciada = new SesionIniciada();
        sesionIniciada.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        BancoMB.registroCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void crearCuenta() {
        String monto = txtMonto.getText();       
        Double dinero = null;
        try {
            dinero = Double.parseDouble(monto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dirección inválida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        CuentasDAO cuentaDAO = new CuentasDAO(new Conexion("jdbc:mysql://localhost/banco_mb", "root", "cinco123"));
        CuentaNuevaDTO cuentaNueva = new CuentaNuevaDTO ();
        
        cuentaNueva.setFechaApertura(Date.valueOf(LocalDate.now()));
        cuentaNueva.setSaldo(dinero);
        if (cuentaDAO.agregar(cuentaNueva)) {
            JOptionPane.showMessageDialog(rootPane,
                    "Cuenta creada exitosamente",
                    "Crear cuenta",
                    JOptionPane.INFORMATION_MESSAGE);
            // Additional logic if needed
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Error al crear la cuenta",
                    "Crear cuenta",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel numeroCuenta;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
