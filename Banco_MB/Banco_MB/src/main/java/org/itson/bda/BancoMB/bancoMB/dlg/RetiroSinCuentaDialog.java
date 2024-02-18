
package org.itson.bda.BancoMB.bancoMB.dlg;

import java.util.Random;
import org.itson.bda.proyectobda_247164_246943.daos.IClientesDAO;


public class RetiroSinCuentaDialog extends javax.swing.JFrame {

     private final IClientesDAO clientesDAO;
 
    public RetiroSinCuentaDialog(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
  
    }
    
    public void setConcepto(String concepto) {
       if(concepto.isBlank()){
           lblConcepto.setText("");
           lblConcepto2.setVisible(false);
       }
       else{
         lblConcepto.setText(concepto);
       } 
    }

    public void setMonto(String monto) {
        lblMonto.setText(monto);
    }
    public void setContrasenia() {
        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);
        int digito3 = random.nextInt(10);
        int digito4 = random.nextInt(10);

        String contrasenia = String.format("%d%d%d%d", digito1, digito2, digito3, digito4);

        lblContrasenia.setText(contrasenia);
    }
    
    public void setFolio() {
        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);
        int digito3 = random.nextInt(10);
        int digito4 = random.nextInt(10);
        int digito5 = random.nextInt(10);
        int digito6 = random.nextInt(10);
        int digito7 = random.nextInt(10);
        int digito8 = random.nextInt(10);

        String folio = String.format("%d%d%d%d%d%d%d%d", digito1, digito2, digito3, digito4,digito5,digito6,digito7,digito8);

        lblFolio.setText(folio);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblConcepto2 = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        lblFolio = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("RETIRO DISPONIBLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setText("Vence en 10 minutos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 380, 10));

        jLabel3.setText("Monto:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel5.setText("Folio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        lblConcepto2.setText("Concepto:");
        jPanel1.add(lblConcepto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        lblMonto.setText("Monto");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 110, -1));

        lblConcepto.setText("Concepto");
        jPanel1.add(lblConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, -1));

        lblContrasenia.setText("Contrasenia");
        jPanel1.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 120, -1));

        lblFolio.setText("Folio");
        jPanel1.add(lblFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblConcepto2;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblFolio;
    private javax.swing.JLabel lblMonto;
    // End of variables declaration//GEN-END:variables
}
