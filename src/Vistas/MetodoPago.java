/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;


import javax.swing.JOptionPane;

/**
 *
 * @author Eduard
 */
public class MetodoPago extends javax.swing.JFrame {

    /**
     * Creates new form MetodoPago
     */
    public MetodoPago() {
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
        jLabel1 = new javax.swing.JLabel();
        jButtonPagar = new javax.swing.JButton();
        jTextTitular = new javax.swing.JTextField();
        jTextTarjeta = new javax.swing.JTextField();
        jTextCVC = new javax.swing.JTextField();
        jTextAño = new javax.swing.JTextField();
        jTextMes = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingresar metodo de pago");

        jButtonPagar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonPagar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagar.setText("Pagar");
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jTextTitular.setBackground(new java.awt.Color(153, 153, 153));
        jTextTitular.setForeground(new java.awt.Color(204, 204, 204));
        jTextTitular.setText("Titular *");
        jTextTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitularActionPerformed(evt);
            }
        });

        jTextTarjeta.setBackground(new java.awt.Color(153, 153, 153));
        jTextTarjeta.setText("Tarjeta *");

        jTextCVC.setBackground(new java.awt.Color(153, 153, 153));
        jTextCVC.setText("CVC *");

        jTextAño.setBackground(new java.awt.Color(153, 153, 153));
        jTextAño.setText("Año *");
        jTextAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAñoActionPerformed(evt);
            }
        });

        jTextMes.setBackground(new java.awt.Color(153, 153, 153));
        jTextMes.setText("Mes *");
        jTextMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMesActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("estoy de acuerdo en aceptar cargos recurrentes de acuerdo a las especificaciones  del plan seleccionado"); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCVC))
                    .addComponent(jTextTitular)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextAño, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jTextMes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jButtonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        // TODO add your handling code here:
        
    // Recolectar los datos de los JTextFields
    String numeroTarjeta = jTextTarjeta.getText();
    String fechaVencimiento = jTextMes.getText() + "/" + jTextAño.getText();  // Combinar mes y año
    String cvv = jTextCVC.getText();
    String nombreTitular = jTextTitular.getText();

    // Validar que los campos no estén vacíos
    if (numeroTarjeta.isEmpty() || fechaVencimiento.isEmpty() || cvv.isEmpty() || nombreTitular.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos de la tarjeta.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar número de tarjeta (16 dígitos)
    if (!numeroTarjeta.matches("\\d{16}")) {
        JOptionPane.showMessageDialog(this, "El número de la tarjeta debe tener 16 dígitos.", "Número de tarjeta inválido", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar fecha de vencimiento (MM/AA)
    if (!fechaVencimiento.matches("\\d{2}/\\d{2}")) {
        JOptionPane.showMessageDialog(this, "El formato de la fecha de vencimiento debe ser MM/AA.", "Fecha inválida", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar CVV (3 dígitos)
    if (!cvv.matches("\\d{3}")) {
        JOptionPane.showMessageDialog(this, "El CVV debe tener 3 dígitos.", "CVV inválido", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar nombre del titular (no debe estar vacío)
    if (nombreTitular.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El nombre del titular no puede estar vacío.", "Nombre inválido", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Si todas las validaciones pasan, mostramos el mensaje de pago exitoso
    JOptionPane.showMessageDialog(this, "Pago exitoso", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    
    
    // Regresar a la interfaz MenuTrabajador
    MenuTrabajador menu = new MenuTrabajador();
    menu.setVisible(true);
    this.dispose();  // Cerrar la ventana actual
        
    }//GEN-LAST:event_jButtonPagarActionPerformed

    private void jTextTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTitularActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAñoActionPerformed

    private void jTextMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMesActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAño;
    private javax.swing.JTextField jTextCVC;
    private javax.swing.JTextField jTextMes;
    private javax.swing.JTextField jTextTarjeta;
    private javax.swing.JTextField jTextTitular;
    // End of variables declaration//GEN-END:variables
}
