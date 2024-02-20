package org.itson.bda.BancoMB.bancoMB.dlg;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Cuentas;
import org.itson.bda.proyectobda_247164_246943.daos.ICuentasDAO;
import org.itson.bda.proyectobda_247164_246943.dtos.CuentaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

public class MensajeMontoCuenta extends javax.swing.JFrame {

    private final ICuentasDAO cuentasDAO;
    private Integer idCliente;

    public MensajeMontoCuenta(ICuentasDAO cuentasDAO, Integer idCliente) {
        initComponents();
        this.cuentasDAO = cuentasDAO;
        int numeroCuenta = generarNumeroCuenta();
        this.idCliente = idCliente;
        lblNumeroCuenta.setText("" + numeroCuenta);
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
        btnCrear = new javax.swing.JButton();
        lblNumeroCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monto de la cuenta");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        lblMonto.setForeground(new java.awt.Color(255, 255, 255));
        lblMonto.setText("Monto");

        lblTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Por favor, ingrese la cuenta y el monto.");

        lblCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblCuenta.setText("Cuenta");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblNumeroCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroCuenta.setText("numero Cuenta");

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCuenta)
                        .addComponent(lblNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTexto)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addGap(168, 168, 168))))
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
                .addComponent(lblNumeroCuenta)
                .addGap(33, 33, 33)
                .addComponent(btnCrear)
                .addContainerGap(32, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            crearCuenta();
        } catch (PersistenciaException ex) {
            Logger.getLogger(MensajeMontoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        SesionIniciada sesionIniciada = new SesionIniciada();
        sesionIniciada.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void crearCuenta() throws PersistenciaException {
        String monto = txtMonto.getText();
        double dinero = 0.0;

        try {
            dinero = Double.parseDouble(monto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un monto válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        CuentaNuevaDTO cuentaNueva = new CuentaNuevaDTO();
        cuentaNueva.setFechaApertura(Date.valueOf(LocalDate.now()));
        cuentaNueva.setSaldo(dinero);
        cuentaNueva.setNumeroCuenta(generarNumeroCuenta());

        try {
            Cuentas cuentaRegistrada = this.cuentasDAO.agregar(cuentaNueva, idCliente);
            cuentaNueva.setNumeroCuenta(cuentaRegistrada.getNumeroCuenta());

        } catch (Exception ex) {
            Logger.getLogger(MensajeMontoCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Integer generarNumeroCuenta() {
        Random random = new Random();
        int numeroCuenta;
        Set<Integer> numerosDeCuentaGenerados = new HashSet<>();

        do {
            numeroCuenta = 100000000 + random.nextInt(900000000);
        } while (numerosDeCuentaGenerados.contains(numeroCuenta));

        numerosDeCuentaGenerados.add(numeroCuenta);
        return numeroCuenta;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
