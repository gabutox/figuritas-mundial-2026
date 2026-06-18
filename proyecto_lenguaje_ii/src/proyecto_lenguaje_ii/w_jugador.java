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
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author norav
 */
public class w_jugador extends javax.swing.JFrame {
    String rutaArchivo = "jugadores.txt";
    
ArrayList<Jugador> estructura_jugadores = new ArrayList<>();
ArrayList<Seleccion> estructura_selecciones = new ArrayList<>();

String rutaJugadores;
String rutaSelecciones;




    public w_jugador() {
        initComponents();
        LeerDatos_jugador();
        
        
        if (estructura_jugadores.isEmpty()) {

    // ARGENTINA
    estructura_jugadores.add(new Jugador("1","Emiliano Martinez","23","Arquero","ARG"));
    estructura_jugadores.add(new Jugador("2","Nahuel Molina","26","Defensa","ARG"));
    estructura_jugadores.add(new Jugador("3","Cristian Romero","13","Defensa","ARG"));
    estructura_jugadores.add(new Jugador("4","Nicolas Otamendi","19","Defensa","ARG"));
    estructura_jugadores.add(new Jugador("5","Rodrigo De Paul","7","Mediocampista","ARG"));
    estructura_jugadores.add(new Jugador("6","Alexis Mac Allister","20","Mediocampista","ARG"));
    estructura_jugadores.add(new Jugador("7","Lionel Messi","10","Delantero","ARG"));
    estructura_jugadores.add(new Jugador("8","Julian Alvarez","9","Delantero","ARG"));


    // BRASIL
    estructura_jugadores.add(new Jugador("9","Alisson Becker","1","Arquero","BRA"));
    estructura_jugadores.add(new Jugador("10","Marquinhos","4","Defensa","BRA"));
    estructura_jugadores.add(new Jugador("11","Eder Militao","3","Defensa","BRA"));
    estructura_jugadores.add(new Jugador("12","Bruno Guimaraes","8","Mediocampista","BRA"));
    estructura_jugadores.add(new Jugador("13","Casemiro","5","Mediocampista","BRA"));
    estructura_jugadores.add(new Jugador("14","Vinicius Jr","7","Delantero","BRA"));
    estructura_jugadores.add(new Jugador("15","Neymar Jr","11","Delantero","BRA"));
    estructura_jugadores.add(new Jugador("16","Raphinha","10","Delantero","BRA"));


    // FRANCIA
    estructura_jugadores.add(new Jugador("17","Mike Maignan","16","Arquero","FRA"));
    estructura_jugadores.add(new Jugador("18","Theo Hernandez","22","Defensa","FRA"));
    estructura_jugadores.add(new Jugador("19","William Saliba","2","Defensa","FRA"));
    estructura_jugadores.add(new Jugador("20","Jules Kounde","5","Defensa","FRA"));
    estructura_jugadores.add(new Jugador("21","Eduardo Camavinga","6","Mediocampista","FRA"));
    estructura_jugadores.add(new Jugador("22","Adrien Rabiot","14","Mediocampista","FRA"));
    estructura_jugadores.add(new Jugador("23","Kylian Mbappe","10","Delantero","FRA"));
    estructura_jugadores.add(new Jugador("24","Michael Olise","11","Delantero","FRA"));


    // ESPAÑA
    estructura_jugadores.add(new Jugador("25","Unai Simon","23","Arquero","ESP"));
    estructura_jugadores.add(new Jugador("26","Paul Cubarsí","22","Defensa","ESP"));
    estructura_jugadores.add(new Jugador("27","Aymeric Laporte","14","Defensa","ESP"));
    estructura_jugadores.add(new Jugador("28","Rodri","16","Mediocampista","ESP"));
    estructura_jugadores.add(new Jugador("29","Pedri","8","Mediocampista","ESP"));
    estructura_jugadores.add(new Jugador("30","Gavi","9","Mediocampista","ESP"));
    estructura_jugadores.add(new Jugador("31","Lamine Yamal","19","Delantero","ESP"));
    estructura_jugadores.add(new Jugador("32","Nico Williams","17","Delantero","ESP"));
    
    // INGLATERRA
estructura_jugadores.add(new Jugador("33","Jordan Pickford","1","Arquero","ENG"));
estructura_jugadores.add(new Jugador("34","Reece James","24","Defensa","ENG"));
estructura_jugadores.add(new Jugador("35","John Stones","5","Defensa","ENG"));
estructura_jugadores.add(new Jugador("36","Declan Rice","4","Mediocampista","ENG"));
estructura_jugadores.add(new Jugador("37","Jude Bellingham","10","Mediocampista","ENG"));
estructura_jugadores.add(new Jugador("38","Marcus Rashford","11","Delantero","ENG"));
estructura_jugadores.add(new Jugador("39","Bukayo Saka","7","Delantero","ENG"));
estructura_jugadores.add(new Jugador("40","Harry Kane","9","Delantero","ENG"));



// ALEMANIA
estructura_jugadores.add(new Jugador("41","Manuel Neuer","1","Arquero","GER"));
estructura_jugadores.add(new Jugador("42","Antonio Rudiger","2","Defensa","GER"));
estructura_jugadores.add(new Jugador("43","Joshua Kimmich","6","Mediocampista","GER"));
estructura_jugadores.add(new Jugador("44","Ilkay Gundogan","8","Mediocampista","GER"));
estructura_jugadores.add(new Jugador("45","Florian Wirtz","10","Mediocampista","GER"));
estructura_jugadores.add(new Jugador("46","Jamal Musiala","14","Delantero","GER"));
estructura_jugadores.add(new Jugador("47","Kai Havertz","7","Delantero","GER"));
estructura_jugadores.add(new Jugador("48","Niclas Fullkrug","9","Delantero","GER"));



// MEXICO
estructura_jugadores.add(new Jugador("49","Guillermo Ochoa","13","Arquero","MEX"));
estructura_jugadores.add(new Jugador("50","Jorge Sanchez","2","Defensa","MEX"));
estructura_jugadores.add(new Jugador("51","Edson Alvarez","4","Mediocampista","MEX"));
estructura_jugadores.add(new Jugador("52","Luis Chavez","24","Mediocampista","MEX"));
estructura_jugadores.add(new Jugador("53","Orbelin Pineda","17","Mediocampista","MEX"));
estructura_jugadores.add(new Jugador("54","Hirving Lozano","22","Delantero","MEX"));
estructura_jugadores.add(new Jugador("55","Raul Jimenez","9","Delantero","MEX"));
estructura_jugadores.add(new Jugador("56","Santiago Gimenez","11","Delantero","MEX"));



// ESTADOS UNIDOS
estructura_jugadores.add(new Jugador("57","Matt Turner","1","Arquero","USA"));
estructura_jugadores.add(new Jugador("58","Antonee Robinson","5","Defensa","USA"));
estructura_jugadores.add(new Jugador("59","Tyler Adams","4","Mediocampista","USA"));
estructura_jugadores.add(new Jugador("60","Weston McKennie","8","Mediocampista","USA"));
estructura_jugadores.add(new Jugador("61","Christian Pulisic","10","Delantero","USA"));
estructura_jugadores.add(new Jugador("62","Timothy Weah","21","Delantero","USA"));
estructura_jugadores.add(new Jugador("63","Folarin Balogun","9","Delantero","USA"));
estructura_jugadores.add(new Jugador("64","Ricardo Pepi","14","Delantero","USA"));



    GrabarDatos_jugador();
}
         MostrarDatos_jugador();
         CargarComboSeleccion();
         LeerDatos_selecciones();
        CargarComboPosicion();
    }
    public void LeerDatos_selecciones(){
        try{
            File archivo = new File("selecciones.txt");
            FileInputStream fin = new FileInputStream(archivo.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fin);
            estructura_selecciones = (ArrayList<Seleccion>) ois.readObject();
            fin.close();
        } catch(Exception ex) {ex.printStackTrace();
        
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
         j.setSeleccionId(seleccion.split(" - ")[0]);
         
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

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
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
