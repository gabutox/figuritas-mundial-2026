/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_lenguaje_ii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.ini4j.Wini;

/**
 *
 * @author gabiz
 */
public class w_seleccion extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(w_seleccion.class.getName());
ArrayList<Seleccion> estructura_selecciones = new ArrayList<>();
String rutaSelecciones;
    /**
     * Creates new form w_seleccion
     */
    public w_seleccion() {
    initComponents();
    try {
        Wini ini = new Wini(new File("configuracion.ini"));
        rutaSelecciones = ini.get("Archivos", "selecciones");
    } catch (Exception e) {
        e.printStackTrace();
    }
    LeerDatos_seleccion();
    if (estructura_selecciones.isEmpty()) {
        // Grupo A
        estructura_selecciones.add(new Seleccion("MEX", "Mexico", "CONCACAF", "A"));
        estructura_selecciones.add(new Seleccion("RSA", "Sudafrica", "CAF", "A"));
        estructura_selecciones.add(new Seleccion("KOR", "Corea del Sur", "AFC", "A"));
        estructura_selecciones.add(new Seleccion("CZE", "Chequia", "UEFA", "A"));
        // Grupo B
        estructura_selecciones.add(new Seleccion("CAN", "Canada", "CONCACAF", "B"));
        estructura_selecciones.add(new Seleccion("BIH", "Bosnia y Herzegovina", "UEFA", "B"));
        estructura_selecciones.add(new Seleccion("QAT", "Qatar", "AFC", "B"));
        estructura_selecciones.add(new Seleccion("SUI", "Suiza", "UEFA", "B"));
        // Grupo C
        estructura_selecciones.add(new Seleccion("BRA", "Brasil", "CONMEBOL", "C"));
        estructura_selecciones.add(new Seleccion("MAR", "Marruecos", "CAF", "C"));
        estructura_selecciones.add(new Seleccion("HAI", "Haiti", "CONCACAF", "C"));
        estructura_selecciones.add(new Seleccion("SCO", "Escocia", "UEFA", "C"));
        // Grupo D
        estructura_selecciones.add(new Seleccion("USA", "Estados Unidos", "CONCACAF", "D"));
        estructura_selecciones.add(new Seleccion("PAR", "Paraguay", "CONMEBOL", "D"));
        estructura_selecciones.add(new Seleccion("AUS", "Australia", "AFC", "D"));
        estructura_selecciones.add(new Seleccion("TUR", "Turquia", "UEFA", "D"));
        // Grupo E
        estructura_selecciones.add(new Seleccion("GER", "Alemania", "UEFA", "E"));
        estructura_selecciones.add(new Seleccion("CUW", "Curazao", "CONCACAF", "E"));
        estructura_selecciones.add(new Seleccion("CIV", "Costa de Marfil", "CAF", "E"));
        estructura_selecciones.add(new Seleccion("ECU", "Ecuador", "CONMEBOL", "E"));
        // Grupo F
        estructura_selecciones.add(new Seleccion("NED", "Paises Bajos", "UEFA", "F"));
        estructura_selecciones.add(new Seleccion("JPN", "Japon", "AFC", "F"));
        estructura_selecciones.add(new Seleccion("SWE", "Suecia", "UEFA", "F"));
        estructura_selecciones.add(new Seleccion("TUN", "Tunez", "CAF", "F"));
        // Grupo G
        estructura_selecciones.add(new Seleccion("BEL", "Belgica", "UEFA", "G"));
        estructura_selecciones.add(new Seleccion("EGY", "Egipto", "CAF", "G"));
        estructura_selecciones.add(new Seleccion("IRN", "Iran", "AFC", "G"));
        estructura_selecciones.add(new Seleccion("NZL", "Nueva Zelanda", "OFC", "G"));
        // Grupo H
        estructura_selecciones.add(new Seleccion("ESP", "España", "UEFA", "H"));
        estructura_selecciones.add(new Seleccion("CPV", "Cabo Verde", "CAF", "H"));
        estructura_selecciones.add(new Seleccion("KSA", "Arabia Saudita", "AFC", "H"));
        estructura_selecciones.add(new Seleccion("URU", "Uruguay", "CONMEBOL", "H"));
        // Grupo I
        estructura_selecciones.add(new Seleccion("FRA", "Francia", "UEFA", "I"));
        estructura_selecciones.add(new Seleccion("SEN", "Senegal", "CAF", "I"));
        estructura_selecciones.add(new Seleccion("IRQ", "Irak", "AFC", "I"));
        estructura_selecciones.add(new Seleccion("NOR", "Noruega", "UEFA", "I"));
        // Grupo J
        estructura_selecciones.add(new Seleccion("ARG", "Argentina", "CONMEBOL", "J"));
        estructura_selecciones.add(new Seleccion("ALG", "Argelia", "CAF", "J"));
        estructura_selecciones.add(new Seleccion("AUT", "Austria", "UEFA", "J"));
        estructura_selecciones.add(new Seleccion("JOR", "Jordania", "AFC", "J"));
        // Grupo K
        estructura_selecciones.add(new Seleccion("POR", "Portugal", "UEFA", "K"));
        estructura_selecciones.add(new Seleccion("COD", "Rep. Dem. del Congo", "CAF", "K"));
        estructura_selecciones.add(new Seleccion("UZB", "Uzbekistan", "AFC", "K"));
        estructura_selecciones.add(new Seleccion("COL", "Colombia", "CONMEBOL", "K"));
        // Grupo L
        estructura_selecciones.add(new Seleccion("ENG", "Inglaterra", "UEFA", "L"));
        estructura_selecciones.add(new Seleccion("CRO", "Croacia", "UEFA", "L"));
        estructura_selecciones.add(new Seleccion("GHA", "Ghana", "CAF", "L"));
        estructura_selecciones.add(new Seleccion("PAN", "Panama", "CONCACAF", "L"));
        GrabarDatos_seleccion();
    }
    MostrarDatos_seleccion();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeleccion = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConfederacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(this::btnNuevoActionPerformed);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(this::btnGrabarActionPerformed);

        jLabel1.setText("ID");

        tblSeleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSeleccion);

        txtId.setColumns(15);
        txtId.addActionListener(this::txtIdActionPerformed);

        jLabel2.setText("Nombre");

        txtNombre.setColumns(15);

        jLabel3.setText("Confederacion");

        txtConfederacion.setColumns(15);

        jLabel4.setText("Grupo");

        txtGrupo.setColumns(15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGrabar))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(txtConfederacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfederacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrabar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void LeerDatos_seleccion() {
    try {
        File archivo = new File(rutaSelecciones);
        FileInputStream fin = new FileInputStream(archivo.getAbsolutePath());
        ObjectInputStream ois = new ObjectInputStream(fin);
        estructura_selecciones = (ArrayList<Seleccion>) ois.readObject();
        fin.close();
    } catch (Exception ex) {
        // si el archivo no existe todavia, no pasa nada
    }
}

public void GrabarDatos_seleccion() {
    try {
        File archivo = new File(rutaSelecciones);
        FileOutputStream fos = new FileOutputStream(archivo.getAbsolutePath());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(estructura_selecciones);
        oos.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void Agregar_seleccion() {
    Seleccion s = new Seleccion("", "", "", "");
    s.setId(this.txtId.getText());
    s.setNombre(this.txtNombre.getText());
    s.setConfederacion(this.txtConfederacion.getText());
    s.setGrupo(this.txtGrupo.getText());
    estructura_selecciones.add(s);
    JOptionPane.showMessageDialog(null, "Seleccion agregada correctamente");
}

public void MostrarDatos_seleccion() {
    String[][] matriz = new String[estructura_selecciones.size()][4];
    for (int i = 0; i < estructura_selecciones.size(); i++) {
        matriz[i][0] = estructura_selecciones.get(i).getId();
        matriz[i][1] = estructura_selecciones.get(i).getNombre();
        matriz[i][2] = estructura_selecciones.get(i).getConfederacion();
        matriz[i][3] = estructura_selecciones.get(i).getGrupo();
    }
    tblSeleccion.setModel(new javax.swing.table.DefaultTableModel(
        matriz, new String[]{"ID", "Nombre", "Confederacion", "Grupo"}
    ));
}
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
txtId.setText("");
txtNombre.setText("");
txtConfederacion.setText("");
txtGrupo.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
 Agregar_seleccion();
GrabarDatos_seleccion();
MostrarDatos_seleccion();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new w_seleccion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSeleccion;
    private javax.swing.JTextField txtConfederacion;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
