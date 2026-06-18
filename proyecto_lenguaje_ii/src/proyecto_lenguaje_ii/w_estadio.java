/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_lenguaje_ii;
import java.util.ArrayList;
import java.io.File;
import org.ini4j.Wini;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author norav
 */
public class w_estadio extends javax.swing.JFrame {

    ArrayList<Estadio> estructura_estadios = new ArrayList<>();
    String rutaEstadios;
    public w_estadio() {
        initComponents();
        
        try{
            Wini ini = new Wini(new File("configuracion.ini"));
            rutaEstadios = ini.get("Archivos", "estadios");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LeerDatos_estadio();
         if (estructura_estadios.isEmpty()){
        estructura_estadios.add(new Estadio("1", "Estadio Azteca", "Ciudad de México", "México", "87523"));

        estructura_estadios.add(new Estadio("2", "BMO Field", "Toronto", "Canadá", "45000"));

        estructura_estadios.add(new Estadio("3", "BC Place", "Vancouver", "Canadá", "54500"));

        estructura_estadios.add(new Estadio("4", "MetLife Stadium", "East Rutherford", "Estados Unidos", "82500"));

        estructura_estadios.add(new Estadio("5", "AT&T Stadium", "Arlington", "Estados Unidos", "80000"));

        estructura_estadios.add(new Estadio("6", "SoFi Stadium", "Inglewood", "Estados Unidos", "70240"));

        estructura_estadios.add(new Estadio("7", "Mercedes-Benz Stadium", "Atlanta", "Estados Unidos", "71000"));

        estructura_estadios.add(new Estadio("8", "Lumen Field", "Seattle", "Estados Unidos", "68740"));
        GrabarDatos_estadio();
    }
        MostrarDatos_estadio();
    }
    
    public void LeerDatos_estadio(){
        try {
            File archivo = new File(rutaEstadios);
            FileInputStream fin = new FileInputStream(archivo.getAbsolutePath());
            ObjectInputStream ois = new ObjectInputStream(fin);
            estructura_estadios = (ArrayList<Estadio>) ois.readObject();
            fin.close();
        } catch(Exception es) {
            
            
        }
    }
   
    public void GrabarDatos_estadio() {
        try {
            File archivo = new File(rutaEstadios);
            FileOutputStream fos = new FileOutputStream(archivo.getAbsolutePath());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estructura_estadios);
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
 public void Agregar_estadio(){
     
     Estadio e = new Estadio("", "", "", "", "");
     e.setId(this.txtID.getText());
     e.setNombre(this.txtNombre.getText());
     e.setCiudad(this.txtCiudad.getText());
     e.setPais(this.txtPais.getText());
     e.setCapacidad(this.txtCapacidad.getText());
     
     estructura_estadios.add(e);
     JOptionPane.showMessageDialog(null,"Estadio agregado correctamente");
     
     
 }
 
    public void MostrarDatos_estadio(){
     String[][] matriz = new String[estructura_estadios.size()][5];
     
     for(int i = 0; i< estructura_estadios.size(); i++) {
         matriz[i][0] = estructura_estadios.get(i).getId();
         matriz[i][1] = estructura_estadios.get(i).getNombre();
         matriz[i][2] = estructura_estadios.get(i).getCiudad();
         matriz[i][3] = estructura_estadios.get(i).getPais();
         matriz[i][4] = estructura_estadios.get(i).getCapacidad();
         
     }
     tblEstadios.setModel(new javax.swing.table.DefaultTableModel(
     matriz,
     new String[]{"ID","Nombre","Ciudad","Pais","Capacidad"}
     ));         
     }
     
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstadios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setText("jTextField1");

        txtNombre.setText("jTextField2");

        txtCiudad.setText("jTextField3");

        txtPais.setText("jTextField4");

        txtCapacidad.setText("jTextField5");

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

        tblEstadios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Ciudad", "País", "Capacidad"
            }
        ));
        jScrollPane1.setViewportView(tblEstadios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrabar)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGrabar))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtID.setText("");
    txtNombre.setText("");
    txtCiudad.setText("");
    txtPais.setText("");
    txtCapacidad.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        Agregar_estadio();
        GrabarDatos_estadio();
        MostrarDatos_estadio();      // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstadios;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
