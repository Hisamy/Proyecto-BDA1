package org.itson.bda.BancoMB.bancoMB.dlg;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.bda.proyectobda_247164_246943.conexiones.Conexion;
import org.itson.bda.proyectobda_247164_246943.conexiones.IConexion;
import org.itson.bda.proyectobda_247164_246943.daos.IRetiroSinCuentaDAO;
import org.itson.bda.proyectobda_247164_246943.daos.RetirosSinCuentaDAO;
import org.itson.bda.proyectobda_247164_246943.dtos.RetiroSinCuentaNuevoDTO;
import org.itson.bda.proyectobda_247164_246943.excepciones.PersistenciaException;

public class RetiroSinCuentaForm extends javax.swing.JFrame {

    public float monto;
    public String concepto;
    private Acciones opcion;
     String cadenaConexion = "jdbc:mysql://localhost/banco";
     String usuario = "root";
     String password = "cinco123";
    IConexion conexion = new Conexion(cadenaConexion, usuario, password);

    private  IRetiroSinCuentaDAO retiroSinCuentaDAO;
    private List<RetiroSinCuentaNuevoDTO> listaRetiros = new ArrayList<>();

    

    public RetiroSinCuentaForm(IRetiroSinCuentaDAO retiroSinCuentaDAO) {
        initComponents();
        this.retiroSinCuentaDAO = retiroSinCuentaDAO;

        if (opcion == Acciones.CANCELAR) {
            btnCancelar.setText("Cancelar");

        } else if (opcion == Acciones.ACEPTAR) {
            btnAceptar.setText("Aceptar");
            btnAceptar.setText(txtConcepto.getText());
            btnAceptar.setText(txtOtraCifra.getText());
        }
    }
    public RetiroSinCuentaForm(){
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
        LblImporte = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOtraCifra = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Importe de retiro sin cuenta");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        LblImporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblImporte.setForeground(new java.awt.Color(255, 255, 255));
        LblImporte.setText("Importe");

        txtConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConceptoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Solo múltiplos de 100");

        txtOtraCifra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtraCifraActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cifra:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Concepto(opcional):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(LblImporte))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtOtraCifra, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnCancelar)
                .addGap(44, 44, 44)
                .addComponent(btnAceptar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LblImporte)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtOtraCifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConceptoActionPerformed
        txtConcepto.getText();
    
    }//GEN-LAST:event_txtConceptoActionPerformed

    private void txtOtraCifraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtraCifraActionPerformed
        txtOtraCifra.getText();
    }//GEN-LAST:event_txtOtraCifraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
     String concepto = txtConcepto.getText();
     String otraCifra = txtOtraCifra.getText();
     RetiroSinCuentaDialog claveFrame = new RetiroSinCuentaDialog(retiroSinCuentaDAO);
  
     
    try {
        float monto = Float.parseFloat(otraCifra);
        
        if (monto % 100 == 0) {
        RetiroSinCuentaNuevoDTO retiroSinCuentaNuevo = new RetiroSinCuentaNuevoDTO();
        retiroSinCuentaNuevo.setMonto(monto);

        agregarRetiro(retiroSinCuentaNuevo);

         claveFrame.setConcepto(concepto);  
        
        claveFrame.setMonto(String.valueOf(monto));

        retiroSinCuentaDAO.agregar(retiroSinCuentaNuevo);
        
        claveFrame.setVisible(true);
         dispose();
        
        }else {
            // Muestra un mensaje de error si el monto no es un múltiplo de 100
            JOptionPane.showMessageDialog(this, "El monto debe ser un múltiplo de 100", "No es múltiplo", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // La entrada no es un número, muestra un mensaje de error 
        JOptionPane.showMessageDialog(this, "ERROR: La cifra ingresada no es válida.", "Cifra inválida", JOptionPane.ERROR_MESSAGE);
    }   catch (PersistenciaException ex) {
            Logger.getLogger(RetiroSinCuentaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
           
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        SesionIniciada sesionIniciada = new SesionIniciada();
        sesionIniciada.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
private void agregarRetiro(RetiroSinCuentaNuevoDTO retiro) {
        listaRetiros.add(retiro);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImporte;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtOtraCifra;
    // End of variables declaration//GEN-END:variables
}
