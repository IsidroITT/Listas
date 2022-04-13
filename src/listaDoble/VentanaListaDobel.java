/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package listaDoble;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author isidro
 */
public class VentanaListaDobel extends javax.swing.JFrame {
    ListaDoble listaDoble = new ListaDoble();
    /**
     * Creates new form VentanaListaDobel
     */
    public VentanaListaDobel() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostar = new javax.swing.JButton();
        txtNodo = new javax.swing.JTextField();
        lblNodo = new javax.swing.JLabel();
        btnInsertarFIN = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrarFIN = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnInsertatINI = new javax.swing.JButton();
        btnBorrarINI = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PaneMostrar = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMostar.setText("MOSTRAR");

        lblNodo.setText("Escriba nodo: ");

        btnInsertarFIN.setText("INSERTAR FIN");
        btnInsertarFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFINActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrarFIN.setText("BORRAR FIN");
        btnBorrarFIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFINActionPerformed(evt);
            }
        });

        lblValor.setText("Escriba valor: ");

        btnInsertatINI.setText("INSERTAR INI");
        btnInsertatINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertatINIActionPerformed(evt);
            }
        });

        btnBorrarINI.setText("BORRAR INI");
        btnBorrarINI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarINIActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(PaneMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostar)
                        .addGap(26, 26, 26)
                        .addComponent(btnModificar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNodo)
                                .addGap(28, 28, 28)
                                .addComponent(txtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGap(28, 28, 28)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertatINI)
                            .addComponent(btnInsertarFIN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarFIN)
                            .addComponent(btnBorrarINI))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsertatINI)
                        .addComponent(btnBorrarINI))
                    .addComponent(lblValor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsertarFIN)
                        .addComponent(btnBorrarFIN))
                    .addComponent(lblNodo))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostar)
                    .addComponent(btnModificar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFINActionPerformed
        char valor = txtValor.getText().toUpperCase().charAt(0);
        boolean respuesta = listaDoble.insertarFIN(valor);
        mostrarINSER(respuesta);
    }//GEN-LAST:event_btnInsertarFINActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        char nuevoValor = txtValor.getText().toUpperCase().charAt(0);
        char nodoBusca = txtNodo.getText().toUpperCase().charAt(0);
        boolean respuesta = listaDoble.modificarNodo(nodoBusca, nuevoValor);
        mostrarINSER(respuesta);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarFINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFINActionPerformed
        boolean respuesta = listaDoble.eliminarFIN();
        mostrarELIMI(respuesta);
    }//GEN-LAST:event_btnBorrarFINActionPerformed

    private void btnInsertatINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertatINIActionPerformed
        char valor = txtValor.getText().toUpperCase().charAt(0);
        boolean respuesta = listaDoble.insertarINI(valor);
        mostrarINSER(respuesta);
    }//GEN-LAST:event_btnInsertatINIActionPerformed

    private void btnBorrarINIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarINIActionPerformed
        boolean respuesta = listaDoble.eliminarINI();
        mostrarELIMI(respuesta);
    }//GEN-LAST:event_btnBorrarINIActionPerformed

    public void mostrarINSER(boolean res){
        if(res){
            showMessageDialog(this, "SE INSERTO");
            txtValor.setText("");
            PaneMostrar.setText(listaDoble.mostrar());
        }else{
            showMessageDialog(this, "ERROR! LISTA LLENA");
        }
    }
    
    public void mostrarELIMI(boolean res){
        if(res){
            showMessageDialog(this, "SE ELIMINO");
            txtValor.setText("");
            PaneMostrar.setText(listaDoble.mostrar());
        }else{
            showMessageDialog(this, "ERROR! LISTA VACIA");
        }
    }
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
            java.util.logging.Logger.getLogger(VentanaListaDobel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaDobel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaDobel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaDobel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListaDobel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane PaneMostrar;
    private javax.swing.JButton btnBorrarFIN;
    private javax.swing.JButton btnBorrarINI;
    private javax.swing.JButton btnInsertar2;
    private javax.swing.JButton btnInsertar3;
    private javax.swing.JButton btnInsertarFIN;
    private javax.swing.JButton btnInsertatINI;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNodo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtNodo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}