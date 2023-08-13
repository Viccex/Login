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
public class Caja extends javax.swing.JFrame 
{
    /**
     * Creates new form Menu
     */
    public Caja() 
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
        BSalir = new javax.swing.JButton();
        MInicial = new javax.swing.JMenuBar();
        MRegistro2 = new javax.swing.JMenu();
        RBuscar2 = new javax.swing.JMenu();
        MVentas = new javax.swing.JMenu();
        VBuscar = new javax.swing.JMenu();
        VInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        PFondo.setBackground(new java.awt.Color(0, 153, 153));

        BSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(42, 42, 42))
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(31, 31, 31))
        );

        MRegistro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/registro.png"))); // NOI18N
        MRegistro2.setText("R. Productos.");
        MRegistro2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        RBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        RBuscar2.setText("Buscar registro");
        RBuscar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBuscar2MouseClicked(evt);
            }
        });
        MRegistro2.add(RBuscar2);

        MInicial.add(MRegistro2);

        MVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/ventas.png"))); // NOI18N
        MVentas.setText("V. Productos.");
        MVentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        VBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        VBuscar.setText("Buscar venta");
        VBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        VBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VBuscarMouseClicked(evt);
            }
        });
        MVentas.add(VBuscar);

        VInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/insertar.png"))); // NOI18N
        VInsertar.setText("Insertar venta");
        VInsertar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        VInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VInsertarMouseClicked(evt);
            }
        });
        MVentas.add(VInsertar);

        MInicial.add(MVentas);

        setJMenuBar(MInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        Inicio ventana=new Inicio();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BSalirActionPerformed

    private void RBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBuscar2MouseClicked
        CBuscarRegistro ventana=new CBuscarRegistro();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RBuscar2MouseClicked

    private void VBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VBuscarMouseClicked
        CBuscarVenta ventana=new CBuscarVenta();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VBuscarMouseClicked

    private void VInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VInsertarMouseClicked
        CInsertarVenta ventana=new CInsertarVenta();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VInsertarMouseClicked

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
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSalir;
    private javax.swing.JMenuBar MInicial;
    private javax.swing.JMenu MRegistro2;
    private javax.swing.JMenu MVentas;
    private javax.swing.JPanel PFondo;
    private javax.swing.JMenu RBuscar2;
    private javax.swing.JMenu VBuscar;
    private javax.swing.JMenu VInsertar;
    // End of variables declaration//GEN-END:variables
}
