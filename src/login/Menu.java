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
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() 
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

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuEliminar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        MenuActu = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        MenuInse = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        MenuPV = new javax.swing.JMenu();
        MenuBuscar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/Eliminar.png"))); // NOI18N
        MenuEliminar.setText("Eliminar");
        MenuEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem1.setText("Eliminar usuario");
        MenuEliminar.add(jMenuItem1);

        jMenuItem10.setText("Eliminar producto");
        MenuEliminar.add(jMenuItem10);

        jMenuItem11.setText("Eliminar venta");
        MenuEliminar.add(jMenuItem11);

        jMenuBar1.add(MenuEliminar);

        MenuActu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/actualizar.png"))); // NOI18N
        MenuActu.setText("Actualizar");
        MenuActu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem7.setText("Actualizar usuario");
        MenuActu.add(jMenuItem7);

        jMenuItem8.setText("Actualizar producto");
        MenuActu.add(jMenuItem8);

        jMenuItem9.setText("Actualizar venta");
        MenuActu.add(jMenuItem9);

        jMenuBar1.add(MenuActu);

        MenuInse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/insertar.png"))); // NOI18N
        MenuInse.setText("Insertar");
        MenuInse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem5.setText("Insertar usuario");
        MenuInse.add(jMenuItem5);

        jMenuItem6.setText("Insertar producto");
        MenuInse.add(jMenuItem6);

        jMenuBar1.add(MenuInse);

        MenuPV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/tienda.png"))); // NOI18N
        MenuPV.setText("Punto de venta");
        MenuPV.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(MenuPV);

        MenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        MenuBuscar.setText("Buscar");
        MenuBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem2.setText("Usuario");
        MenuBuscar.add(jMenuItem2);

        jMenuItem3.setText("Producto");
        MenuBuscar.add(jMenuItem3);

        jMenuItem4.setText("Ventas");
        MenuBuscar.add(jMenuItem4);

        jMenuBar1.add(MenuBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuActu;
    private javax.swing.JMenu MenuBuscar;
    private javax.swing.JMenu MenuEliminar;
    private javax.swing.JMenu MenuInse;
    private javax.swing.JMenu MenuPV;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}