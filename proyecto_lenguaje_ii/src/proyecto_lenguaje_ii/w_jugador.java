/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lenguaje_ii;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author norav
 */
public class w_jugador extends javax.swing.JFrame {
    String rutaArchivo = "jugadores.dat";
    
ArrayList<Jugador> estructura_jugadores = new ArrayList<>();
ArrayList<Seleccion> estructura_selecciones = new ArrayList<>();

String rutaJugadores;
String rutaSelecciones;




    public w_jugador() {
        initComponents();
        LeerDatos_jugador();
         MostrarDatos_jugador();
        CargarComboPosicion();
    }

   public void CargarCombosSeleccion(){
       cmbSeleccion.removeAllItems();
       for(Seleccion s : estructura_selecciones){
           cmbSeleccion.addItem(
           s.getId() + " - " + s.getNombre()
           );
       }
   }
     
     public void CargarComboSeleccion(){
         cmbSeleccion.removeAllItems();
         for(Seleccion s : estructura_selecciones) {
             cmbSeleccion.addItem(
             s.getId() + " - " + s.getNombre()
             );
         }
     }
     public void CargarComboPosicion(){
         cmbPosicion.removeAllItems();
         cmbPosicion.addItem("Arquero");
         cmbPosicion.addItem("Defensor");
         cmbPosicion.addItem("Mediocampista");
         cmbPosicion.addItem("Delantero");
         
     }
     public void Agregar_jugador(){
         Jugador j = new Jugador("", "", "", "", "");
         j.setId(txtID.getText());
         j.setNombre(txtNombre.getText());
         j.setDorsal(txtDorsal.getText());
         j.setPosicion(cmbPosicion.getSelectedItem().toString());
       
         String seleccion = cmbSeleccion.getSelectedItem().toString();
         j.setSeleccionId(seleccion.split("-")[0]);
         
         estructura_jugadores.add(j);
         MostrarDatos_jugador();
     } 
     
     public void MostrarDatos_jugador() {
         DefaultTableModel modelo = 
                 (DefaultTableModel) tblJug.getModel();
         modelo.setRowCount(0);
         for(Jugador j : estructura_jugadores) {
             modelo.addRow(new Object[]{
             j.getId(),
             j.getNombre(),
             j.getDorsal(),
             j.getPosicion(),
             j.getSeleccionId()
         });
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDorsal = new javax.swing.JTextField();
        cmbSeleccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJug = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        cmbPosicion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setText("jTextField1");

        txtNombre.setText("jTextField2");

        txtDorsal.setText("jTextField3");

        cmbSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblJug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dorsal", "Posición", "Selección"
            }
        ));
        jScrollPane1.setViewportView(tblJug);

        btnGrabar.setText("jButton1");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnNuevo.setText("jButton2");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        cmbPosicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrabar)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cmbSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGrabar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
    Agregar_jugador();
    GrabarDatos_jugador();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtID.setText("");
        txtNombre.setText("");
        txtDorsal.setText("");
        
        cmbSeleccion.setSelectedIndex(0);
        cmbPosicion.setSelectedIndex(0);
        
        txtID.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed
   public void GrabarDatos_jugador(){

    try {

        ObjectOutputStream salida =
            new ObjectOutputStream(
                new FileOutputStream(rutaArchivo)
            );

        salida.writeObject(estructura_jugadores);

        salida.close();

    } catch(Exception e){

        JOptionPane.showMessageDialog(null, e.getMessage());

    }
}
   public void LeerDatos_jugador(){

    File archivo = new File(rutaArchivo);

    if(!archivo.exists()){
        return;
    }

    try {

        ObjectInputStream entrada =
            new ObjectInputStream(
                new FileInputStream(rutaArchivo)
            );

        estructura_jugadores =
            (ArrayList<Jugador>) entrada.readObject();

        entrada.close();

    } catch(Exception e){

        JOptionPane.showMessageDialog(null, e.getMessage());

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
            java.util.logging.Logger.getLogger(w_jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(w_jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(w_jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(w_jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new w_jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbPosicion;
    private javax.swing.JComboBox<String> cmbSeleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJug;
    private javax.swing.JTextField txtDorsal;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
