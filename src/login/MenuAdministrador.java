/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
/**
 *
 * @author LPG
 */
public class MenuAdministrador extends javax.swing.JFrame 
{
    /**
     * Creates new form Menu
     */
    public MenuAdministrador() 
    {
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
        MInicial = new javax.swing.JMenuBar();
        MRegistro = new javax.swing.JMenu();
        RBuscar = new javax.swing.JMenu();
        MInventario = new javax.swing.JMenu();
        MActualizar = new javax.swing.JMenu();
        MVentas = new javax.swing.JMenu();
        MUsuarios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        PFondo.setBackground(new java.awt.Color(0, 153, 153));
        PFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        MRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/registro.png"))); // NOI18N
        MRegistro.setText("Registro productos.");
        MRegistro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        RBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        RBuscar.setText("Buscar producto");
        RBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBuscarMouseClicked(evt);
            }
        });
        MRegistro.add(RBuscar);

        MInicial.add(MRegistro);

        MInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/inventario.png"))); // NOI18N
        MInventario.setText("Inventario productos.");
        MInventario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MInicial.add(MInventario);

        MActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/actualizar.png"))); // NOI18N
        MActualizar.setText("Actualizacion inventario.");
        MActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MInicial.add(MActualizar);

        MVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ventas.png"))); // NOI18N
        MVentas.setText("Ventas productos.");
        MVentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MInicial.add(MVentas);

        MUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/usuarios.png"))); // NOI18N
        MUsuarios.setText("Acceso usuarios");
        MUsuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MInicial.add(MUsuarios);

        setJMenuBar(MInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBuscarMouseClicked
        MenuBuscar ventana=new MenuBuscar();
        {
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_RBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MActualizar;
    private javax.swing.JMenuBar MInicial;
    private javax.swing.JMenu MInventario;
    private javax.swing.JMenu MRegistro;
    private javax.swing.JMenu MUsuarios;
    private javax.swing.JMenu MVentas;
    private javax.swing.JPanel PFondo;
    private javax.swing.JMenu RBuscar;
    // End of variables declaration//GEN-END:variables
}