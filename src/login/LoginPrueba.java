
package login;

public class LoginPrueba extends javax.swing.JFrame {
    String contra = "";
    String nom = "";

    public LoginPrueba() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonSalir = new javax.swing.JButton();
        LabelNombre = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        LabelCredencial = new javax.swing.JLabel();
        TextFieldNom = new javax.swing.JTextField();
        TextFieldContra = new javax.swing.JTextField();
        LabelAcceder = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ButtonSalir.setText("Salir");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 70, 30));

        LabelNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("Nombre");
        getContentPane().add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 20));

        LabelContraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LabelContraseña.setText("Contraseña");
        getContentPane().add(LabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 20));

        LabelCredencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/credencial-inicio.png"))); // NOI18N
        getContentPane().add(LabelCredencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, 90));

        TextFieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 202, 120, 30));

        TextFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldContraActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 120, 30));

        LabelAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acceder-inicio..png"))); // NOI18N
        LabelAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelAccederMouseClicked(evt);
            }
        });
        getContentPane().add(LabelAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 110, 100));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-inicio2.jpg"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void TextFieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomActionPerformed

    private void TextFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldContraActionPerformed

    private void LabelAccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelAccederMouseClicked
        // TODO add your handling code here:
        Menu ventana=new Menu();
        if (TextFieldNom.getText().equals(nom) && TextFieldContra.getText().equals(contra))
        {
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_LabelAccederMouseClicked

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
            java.util.logging.Logger.getLogger(LoginPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel LabelAcceder;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelCredencial;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTextField TextFieldContra;
    private javax.swing.JTextField TextFieldNom;
    // End of variables declaration//GEN-END:variables
}
