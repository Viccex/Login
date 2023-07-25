/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

/**
 *
 * @author cliente
 */
public class Login extends javax.swing.JFrame {
    String usuario = "";
    String clave = "";

    /**
     * Creates new form app
     */
    public Login() {
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

        PFondo = new javax.swing.JPanel();
        BSalir = new javax.swing.JButton();
        LImagen = new javax.swing.JLabel();
        LUsuario = new javax.swing.JLabel();
        LClave = new javax.swing.JLabel();
        TUsuario = new javax.swing.JTextField();
        TClave = new javax.swing.JTextField();
        LAcceso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PFondo.setBackground(new java.awt.Color(0, 153, 153));
        PFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        BSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        LImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/credenciales.png"))); // NOI18N

        LUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LUsuario.setText("Usuario");

        LClave.setBackground(new java.awt.Color(0, 0, 0));
        LClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LClave.setForeground(new java.awt.Color(255, 255, 255));
        LClave.setText("Clave de acceso");

        LAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acceder.png"))); // NOI18N
        LAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LAccesoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(LImagen)
                .addGap(36, 36, 36)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LClave)
                    .addComponent(LUsuario))
                .addGap(54, 54, 54)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TClave, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(TUsuario))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                        .addComponent(BSalir)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                        .addComponent(LAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(BSalir)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PFondoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PFondoLayout.createSequentialGroup()
                                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LUsuario))
                                .addGap(26, 26, 26)
                                .addComponent(LClave))
                            .addComponent(TClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(LAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BSalirActionPerformed

    private void LAccesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LAccesoMouseClicked
        MenuAdministrador ventana=new MenuAdministrador();
        if (TUsuario.getText().equals(usuario) && TClave.getText().equals(clave))
        {
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_LAccesoMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSalir;
    private javax.swing.JLabel LAcceso;
    private javax.swing.JLabel LClave;
    private javax.swing.JLabel LImagen;
    private javax.swing.JLabel LUsuario;
    private javax.swing.JPanel PFondo;
    private javax.swing.JTextField TClave;
    private javax.swing.JTextField TUsuario;
    // End of variables declaration//GEN-END:variables
}
