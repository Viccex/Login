/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

/**
 *
 * @author cliente
 */
public class Bodega extends javax.swing.JFrame {

    /**
     * Creates new form MenuBodega
     */
    public Bodega() {
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
        MRegistro1 = new javax.swing.JMenu();
        RBuscar1 = new javax.swing.JMenu();
        MInventario = new javax.swing.JMenu();
        IBuscar = new javax.swing.JMenu();
        MActualizar = new javax.swing.JMenu();
        ABuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PFondo.setBackground(new java.awt.Color(0, 153, 153));
        PFondo.setForeground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(44, 44, 44))
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(35, 35, 35))
        );

        MRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/registro.png"))); // NOI18N
        MRegistro1.setText("R. Productos.");
        MRegistro1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        RBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        RBuscar1.setText("Buscar registro");
        RBuscar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBuscar1MouseClicked(evt);
            }
        });
        MRegistro1.add(RBuscar1);

        MInicial.add(MRegistro1);

        MInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/inventario.png"))); // NOI18N
        MInventario.setText("I. Productos.");
        MInventario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        IBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        IBuscar.setText("Buscar inventario");
        IBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IBuscarMouseClicked(evt);
            }
        });
        MInventario.add(IBuscar);

        MInicial.add(MInventario);

        MActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/actualizar.png"))); // NOI18N
        MActualizar.setText("A. Inventario.");
        MActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        ABuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMenu/buscar.png"))); // NOI18N
        ABuscar.setText("Buscar actualización");
        ABuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ABuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ABuscarMouseClicked(evt);
            }
        });
        MActualizar.add(ABuscar);

        MInicial.add(MActualizar);

        setJMenuBar(MInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        Inicio ventana=new Inicio();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BSalirActionPerformed

    private void RBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBuscar1MouseClicked
        BBuscarRegistro ventana=new BBuscarRegistro();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RBuscar1MouseClicked

    private void IBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IBuscarMouseClicked
        BBuscarInventario ventana=new BBuscarInventario();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IBuscarMouseClicked

    private void ABuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ABuscarMouseClicked
        BBuscarActualizacion ventana=new BBuscarActualizacion();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ABuscarMouseClicked

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
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bodega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ABuscar;
    private javax.swing.JButton BSalir;
    private javax.swing.JMenu IBuscar;
    private javax.swing.JMenu MActualizar;
    private javax.swing.JMenuBar MInicial;
    private javax.swing.JMenu MInventario;
    private javax.swing.JMenu MRegistro1;
    private javax.swing.JPanel PFondo;
    private javax.swing.JMenu RBuscar1;
    // End of variables declaration//GEN-END:variables
}
