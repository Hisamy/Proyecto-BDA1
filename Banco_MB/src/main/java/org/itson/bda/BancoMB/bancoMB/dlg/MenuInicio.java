/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.bda.BancoMB.bancoMB.dlg;

/**
 *
 * @author Usuario
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
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

        PnlFondoAzul = new javax.swing.JPanel();
        BtnIniciarSesion = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        LblBancoMB = new javax.swing.JLabel();
        PnlFondoAzulAbajo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtnRetirarSinCuenta = new javax.swing.JButton();
        LblDecoracion1 = new javax.swing.JLabel();
        LblDeocracion2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlFondoAzul.setBackground(new java.awt.Color(0, 102, 153));

        BtnIniciarSesion.setText("Iniciar sesión");
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });

        BtnRegistrarse.setText("Registrarse");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });

        LblBancoMB.setFont(new java.awt.Font("Yu Gothic Medium", 3, 14)); // NOI18N
        LblBancoMB.setForeground(new java.awt.Color(255, 255, 255));
        LblBancoMB.setText("Banco MB");

        javax.swing.GroupLayout PnlFondoAzulLayout = new javax.swing.GroupLayout(PnlFondoAzul);
        PnlFondoAzul.setLayout(PnlFondoAzulLayout);
        PnlFondoAzulLayout.setHorizontalGroup(
            PnlFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblBancoMB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(BtnRegistrarse)
                .addContainerGap())
        );
        PnlFondoAzulLayout.setVerticalGroup(
            PnlFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIniciarSesion)
                    .addComponent(BtnRegistrarse)
                    .addComponent(LblBancoMB))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        PnlFondoAzulAbajo.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout PnlFondoAzulAbajoLayout = new javax.swing.GroupLayout(PnlFondoAzulAbajo);
        PnlFondoAzulAbajo.setLayout(PnlFondoAzulAbajoLayout);
        PnlFondoAzulAbajoLayout.setHorizontalGroup(
            PnlFondoAzulAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnlFondoAzulAbajoLayout.setVerticalGroup(
            PnlFondoAzulAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BtnRetirarSinCuenta.setForeground(new java.awt.Color(0, 51, 102));
        BtnRetirarSinCuenta.setText("Retirar sin cuenta");
        BtnRetirarSinCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetirarSinCuentaActionPerformed(evt);
            }
        });

        LblDecoracion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblDecoracion1.setForeground(new java.awt.Color(0, 51, 102));
        LblDecoracion1.setText("Registrate en la app");

        LblDeocracion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblDeocracion2.setForeground(new java.awt.Color(0, 51, 102));
        LblDeocracion2.setText("y sácale todo el partido!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlFondoAzulAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(LblDecoracion1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LblDeocracion2)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnRetirarSinCuenta)
                                .addGap(45, 45, 45))))))
            .addComponent(PnlFondoAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlFondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(LblDecoracion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblDeocracion2)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRetirarSinCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)))
                .addComponent(PnlFondoAzulAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
        // TODO add your handling code here:
        inicioSesion inicio = new inicioSesion();
        setVisible inicio(true);
        dispose();
        
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    private void BtnRetirarSinCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetirarSinCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRetirarSinCuentaActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuInicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JButton BtnRetirarSinCuenta;
    private javax.swing.JLabel LblBancoMB;
    private javax.swing.JLabel LblDecoracion1;
    private javax.swing.JLabel LblDeocracion2;
    private javax.swing.JPanel PnlFondoAzul;
    private javax.swing.JPanel PnlFondoAzulAbajo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
