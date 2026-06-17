# TAREAS — INTEGRANTE 1 (Gabi)
## Modulo Base: Login + Usuarios + Seleccion + Posicion

---

## Clases que te tocan

| Archivo | Estado | Descripcion |
|---------|--------|-------------|
| `Usuario.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `Seleccion.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `Posicion.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `w_login.java` | ❌ CREAR VOS | Ventana de Login |
| `w_principal.java` | ❌ CREAR VOS | Menu principal con botones |
| `w_usuarios.java` | ❌ CREAR VOS | CRUD de Usuarios |
| `w_seleccion.java` | ❌ CREAR VOS | CRUD de Selecciones |
| `w_posicion.java` | ❌ CREAR VOS | CRUD de Posiciones |

---

## Orden recomendado para hacer las ventanas

```
1. w_login        <- la mas simple, solo 2 campos y un boton
2. w_principal    <- menu con botones que abren el resto
3. w_usuarios     <- copiar el estilo de w_usuarios del proyecto del profe
4. w_posicion     <- la mas simple (id + nombre), hacerla antes que seleccion
5. w_seleccion    <- similar a posicion pero con mas campos
```

---

## Como crear cada ventana en NetBeans

1. Clic derecho en el paquete `proyecto_lenguaje_ii`
2. New → JFrame Form
3. Ponerle el nombre (ej: `w_login`)
4. NetBeans crea automaticamente el `.java` y el `.form`
5. Diseñar la ventana arrastrando componentes desde la paleta

---

## Que debe tener cada ventana CRUD (w_usuarios, w_seleccion, w_posicion)

### Componentes visuales (arrastrar en el editor):
- `JTextField` para cada campo de la entidad
- `JTable` dentro de un `JScrollPane` para mostrar los datos
- `JButton` Nuevo
- `JButton` Grabar
- `JButton` Eliminar (opcional, pero suma puntos)

### Los 4 metodos que debes programar en cada ventana:

```java
// Lee el archivo .txt y carga el ArrayList
public void LeerDatos_X() {
    try {
        File archivo = new File(rutaArchivo);
        FileInputStream fin = new FileInputStream(archivo.getAbsolutePath());
        ObjectInputStream ois = new ObjectInputStream(fin);
        estructura_X = (ArrayList<X>) ois.readObject();
        fin.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

// Guarda el ArrayList completo en el archivo .txt
public void GrabarDatos_X() {
    try {
        File archivo = new File(rutaArchivo);
        FileOutputStream fos = new FileOutputStream(archivo.getAbsolutePath());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(estructura_X);
        oos.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

// Toma los valores de los JTextField y agrega al ArrayList
public void Agregar_X() {
    X obj = new X("", "", ...);
    obj.setId(this.jTextField1.getText());
    obj.setNombre(this.jTextField2.getText());
    // ... resto de campos
    estructura_X.add(obj);
    JOptionPane.showMessageDialog(null, "Dato agregado correctamente");
}

// Muestra los datos del ArrayList en la JTable
public void MostrarDatos_X() {
    String[][] matriz = new String[estructura_X.size()][columnas];
    for (int i = 0; i < estructura_X.size(); i++) {
        matriz[i][0] = estructura_X.get(i).getId();
        matriz[i][1] = estructura_X.get(i).getNombre();
        // ... resto de campos
    }
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        matriz, new String[]{"Id", "Nombre", ...}
    ));
}
```

### Variables globales que van al inicio de cada ventana:

```java
String rutaArchivo;   // se lee del configuracion.ini
ArrayList<X> estructura_X = new ArrayList<>();
```

### En el constructor de cada ventana, leer el .ini asi:

```java
File archivo = new File("configuracion.ini");
Wini ini = new Wini(new File(archivo.getAbsolutePath()));
rutaArchivo = ini.get("Archivos", "selecciones"); // cambiar segun entidad
this.LeerDatos_X();
this.MostrarDatos_X();
```

---

## w_login — Logica especial

La ventana de login NO tiene CRUD. Solo verifica usuario y clave:

```java
// En el boton Ingresar:
private void btnIngresarActionPerformed(...) {
    String user = jTextField1.getText();
    String pass = jTextField2.getText();

    // Buscar en el ArrayList de usuarios
    for (Usuario u : estructura_usuarios) {
        if (u.getUsuario().equals(user) && u.getClave().equals(pass)) {
            new w_principal().setVisible(true);
            this.dispose(); // cierra el login
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
}
```

---

## w_principal — Menu principal

Solo tiene botones, uno por cada modulo. Cada boton abre una ventana:

```java
// Boton "Gestionar Selecciones"
private void btnSeleccionesActionPerformed(...) {
    new w_seleccion().setVisible(true);
}
```

---

## Aviso importante para tus companeros

Cuando termines `Seleccion.java`, `Posicion.java` y sus ventanas CRUD,
**avisar al grupo** para que el Integrante 2 pueda arrancar con `w_jugador`
(necesita cargar las selecciones y posiciones en sus ComboBox).

```
git add .
git commit -m "Termina CRUD Seleccion y Posicion - listo para Integrante 2"
git push
```
