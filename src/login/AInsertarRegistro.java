/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import com.devazt.networking.HttpClient;
import com.devazt.networking.OnHttpRequestComplete;
import com.devazt.networking.Response;
/**
 *
 * @author cliente
 */
public class AInsertarRegistro extends javax.swing.JFrame 
{
    /**
     * Creates new form TercerMenu
     */
    public AInsertarRegistro() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        PFondo = new javax.swing.JPanel();
        LTitulo = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        TID = new javax.swing.JTextField();
        LID = new javax.swing.JLabel();
        LResultado = new javax.swing.JLabel();
        TResultado = new javax.swing.JTextField();
        BSalir = new javax.swing.JButton();
        LMarca = new javax.swing.JLabel();
        LPresentacion = new javax.swing.JLabel();
        LNombre = new javax.swing.JLabel();
        LPrecio = new javax.swing.JLabel();
        TMarca = new javax.swing.JTextField();
        TNombre = new javax.swing.JTextField();
        TPrecio = new javax.swing.JTextField();
        TPresentacion = new javax.swing.JTextField();
        BLimpiar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PFondo.setBackground(new java.awt.Color(0, 153, 153));

        LTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LTitulo.setText("MENU DE REGISTRO");

        B1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        B1.setText("Registrar...");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        LID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LID.setForeground(new java.awt.Color(255, 255, 255));
        LID.setText("Ingrese un ID para el producto:");

        LResultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LResultado.setForeground(new java.awt.Color(255, 255, 255));

        TResultado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        LMarca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LMarca.setForeground(new java.awt.Color(255, 255, 255));
        LMarca.setText("Ingrese la marca del producto:");

        LPresentacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        LPresentacion.setText("Ingrese la presentacion del producto:");

        LNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LNombre.setForeground(new java.awt.Color(255, 255, 255));
        LNombre.setText("Ingrese el nombre producto:");

        LPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LPrecio.setText("Ingrese el precio del producto:");

        TNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreActionPerformed(evt);
            }
        });

        BLimpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BLimpiar.setText("Limpiar");
        BLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFondoLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(LTitulo))
                    .addGroup(PFondoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(B1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PFondoLayout.createSequentialGroup()
                                    .addComponent(LMarca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PFondoLayout.createSequentialGroup()
                                    .addComponent(LID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PFondoLayout.createSequentialGroup()
                                    .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LNombre)
                                        .addComponent(LPresentacion)
                                        .addComponent(LPrecio))
                                    .addGap(53, 53, 53)
                                    .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(BLimpiar)
                            .addComponent(BSalir))
                        .addComponent(LResultado)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(LResultado)
                .addGap(433, 433, 433))
            .addGroup(PFondoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(LTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPresentacion))
                .addGap(18, 18, 18)
                .addComponent(B1)
                .addGap(18, 18, 18)
                .addComponent(TResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BLimpiar)
                .addGap(18, 18, 18)
                .addComponent(BSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        try
        {
            HttpClient cliente=new HttpClient (new OnHttpRequestComplete() 
            {
                @Override
                public void onComplete(Response status) 
                {
                    if(status.isSuccess())
                    {
                        TResultado.setText(status.getResult());
                    }
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
            String id = TID.getText();
            String marca = TMarca.getText();
            String nom = TNombre.getText();
            String precio = TPrecio.getText();
            String pre = TPresentacion.getText();
            
            cliente.excecute("http://127.0.0.1/Api/r_productosR.php?&id_producto="+id+"&marca="+marca+"&nombre="+nom+"&precio="+precio+"&presentacion="+pre);
        }
        catch(UnsupportedOperationException e){}
    }//GEN-LAST:event_B1ActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        Administracion ventana=new Administracion();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BSalirActionPerformed

    private void TNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreActionPerformed
    }//GEN-LAST:event_TNombreActionPerformed

    private void BLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BLimpiarMouseClicked
        TID.setText(null);
        TMarca.setText(null);
        TNombre.setText(null);
        TPrecio.setText(null);
        TPresentacion.setText(null);
        TResultado.setText(null);
    }//GEN-LAST:event_BLimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(AInsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AInsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AInsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AInsertarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AInsertarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton BLimpiar;
    private javax.swing.JButton BSalir;
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LPrecio;
    private javax.swing.JLabel LPresentacion;
    private javax.swing.JLabel LResultado;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JPanel PFondo;
    private javax.swing.JTextField TID;
    private javax.swing.JTextField TMarca;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TPrecio;
    private javax.swing.JTextField TPresentacion;
    private javax.swing.JTextField TResultado;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
