package org.itson.bda.BancoMB.bancoMB.dlg;

import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.bda.proyectobda_247164_246943.daos.ITransferenciaDAO;
import org.itson.bda.proyectobda_247164_246943.daos.TransferenciaDAO;
import org.itson.bda.proyectobda_247164_246943.dtos.TransferenciaNuevaDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

public class Transferir extends javax.swing.JFrame {

    private ITransferenciaDAO transferenciaDAO;

    public Transferir(TransferenciaDAO transferenciaDAO) {
        initComponents();
        this.transferenciaDAO = transferenciaDAO;
    }

    public Transferir() throws HeadlessException {
        initComponents();
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
        lblCuentaDeOrigen = new javax.swing.JLabel();
        lblDestinatario = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        txtCuentaOrigen = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMotivoDePago = new javax.swing.JLabel();
        txtImorte = new javax.swing.JTextField();
        txtMotivoDePago = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transferencia Destinatario");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        lblCuentaDeOrigen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCuentaDeOrigen.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentaDeOrigen.setText("CUENTA DE ORIGEN");

        lblDestinatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDestinatario.setText("DESTINATARIO");

        txtDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDestinatario)
                    .addComponent(lblCuentaDeOrigen)
                    .addComponent(txtDestinatario)
                    .addComponent(txtCuentaOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCuentaDeOrigen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuentaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDestinatario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("IMPORTE");

        lblMotivoDePago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMotivoDePago.setText("MOTIVO DE PAGO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtImorte)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotivoDePago)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMotivoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblMotivoDePago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotivoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnConfirmar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        SesionIniciada sesionIniciada = new SesionIniciada();
        sesionIniciada.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            String cuentaOrigenStr = txtCuentaOrigen.getText().trim();
            String destinatarioStr = txtDestinatario.getText().trim();
            String importeStr = txtImorte.getText().trim();
            String motivoDePago = txtMotivoDePago.getText().trim();

            if (cuentaOrigenStr.isBlank() || destinatarioStr.isBlank() || importeStr.isBlank()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos obligatorios.", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Integer cuentaDeOrigen = Integer.parseInt(cuentaOrigenStr);
            Integer destinatario = Integer.parseInt(destinatarioStr);
            Double importe = Double.parseDouble(importeStr);

            if (cuentaDeOrigen <= 0 || destinatario <= 0 || importe <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos y mayores que cero para el origen, destinatario e importe.", "Valores inválidos", JOptionPane.ERROR_MESSAGE);
                return;
            }

            TransferenciaNuevaDTO transferenciaNueva = new TransferenciaNuevaDTO();
            transferenciaNueva.setNumeroCuentaOrigen(cuentaDeOrigen);
            transferenciaNueva.setNumeroCuentaReceptor(destinatario);
            transferenciaNueva.setMonto(importe);
            transferenciaNueva.setMotivoPago(motivoDePago);

            transferenciaDAO.agregar(transferenciaNueva);

            TransferirSegundaPantalla transferirSegundaPantalla = new TransferirSegundaPantalla();
            transferirSegundaPantalla.setVisible(true);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para el origen, destinatario e importe.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Transferir.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al agregar la transferencia a la base de datos.", "Error de persistencia", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinatarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuentaDeOrigen;
    private javax.swing.JLabel lblDestinatario;
    private javax.swing.JLabel lblMotivoDePago;
    private javax.swing.JTextField txtCuentaOrigen;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtImorte;
    private javax.swing.JTextField txtMotivoDePago;
    // End of variables declaration//GEN-END:variables
}
