/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaG08;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rogger Mendo
 */
public class TrapecioForm extends javax.swing.JFrame {

    /**
     * Creates new form TrapecioForm
     */
    Trapecio tra=new Trapecio();
    
    public TrapecioForm() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
      int height = pantalla.height;
      int width = pantalla.width;
      setSize(width/2, height/2);		
 
      setLocationRelativeTo(null);		
      setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_bmay = new javax.swing.JTextField();
        txt_bmen = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_resultado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Base Mayor: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(55, 75, 80, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Base Menor: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 131, 80, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Altura: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(55, 191, 70, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("AREA DEL TRAPECIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 28, 189, 22);

        txt_bmay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bmayActionPerformed(evt);
            }
        });
        getContentPane().add(txt_bmay);
        txt_bmay.setBounds(150, 70, 110, 30);
        getContentPane().add(txt_bmen);
        txt_bmen.setBounds(150, 130, 110, 30);
        getContentPane().add(txt_altura);
        txt_altura.setBounds(150, 190, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Resultado: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(55, 247, 70, 14);

        btn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-calculator-64.png"))); // NOI18N
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular);
        btn_calcular.setBounds(390, 270, 70, 60);

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-broom-50.png"))); // NOI18N
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar);
        btn_limpiar.setBounds(270, 270, 70, 59);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-exit-64.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 270, 70, 60);

        txt_resultado.setEditable(false);
        getContentPane().add(txt_resultado);
        txt_resultado.setBounds(150, 240, 100, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 40, 350, 210);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 670, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
       double B=Double.parseDouble(txt_bmay.getText());
       tra.setBmayor(B);
       double b=Double.parseDouble(txt_bmen.getText());
       tra.setBmenor(b);
       double h=Double.parseDouble(txt_altura.getText());
       tra.setH(b);
       txt_resultado.setText(String.valueOf(tra.CalcularArea()));
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_altura.setText("");
        txt_bmay.setText("");
        txt_bmen.setText("");
        txt_resultado.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_bmayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bmayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bmayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrapecioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrapecioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrapecioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrapecioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrapecioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_bmay;
    private javax.swing.JTextField txt_bmen;
    private javax.swing.JTextField txt_resultado;
    // End of variables declaration//GEN-END:variables
}