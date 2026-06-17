# TAREAS — INTEGRANTE 2
## Modulo Jugador: Estadio + Jugador

---

## ANTES DE ARRANCAR

Esperar a que el Integrante 1 (Gabi) termine y suba `Seleccion.java`.
Hacer `git pull` para bajar sus cambios antes de empezar.

```
git pull
```

---

## Clases que te tocan

| Archivo | Estado | Descripcion |
|---------|--------|-------------|
| `Estadio.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `Jugador.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `w_estadio.java` | ❌ CREAR VOS | CRUD de Estadios (simple, sin ComboBox) |
| `w_jugador.java` | ❌ CREAR VOS | CRUD de Jugadores (con 2 ComboBox) |

---

## Orden recomendado

```
1. w_estadio   <- no tiene dependencias, hacerla primero para practicar el patron
2. w_jugador   <- tiene 2 ComboBox (Seleccion y Posicion), hacerla despues
```

---

## Como crear cada ventana en NetBeans

1. Clic derecho en el paquete `proyecto_lenguaje_ii`
2. New → JFrame Form
3. Ponerle el nombre (ej: `w_estadio`)
4. NetBeans crea automaticamente el `.java` y el `.form`

---

## w_estadio — CRUD simple (sin ComboBox)

### Campos visuales:
- `JTextField` para: id, nombre, ciudad, pais, capacidad
- `JTable` en un `JScrollPane`
- Boton Nuevo, Boton Grabar

### Los 4 metodos a programar:

```java
// Variables globales
String rutaArchivo;
ArrayList<Estadio> estructura_estadios = new ArrayList<>();

// En el constructor leer el .ini:
File archivo = new File("configuracion.ini");
Wini ini = new Wini(new File(archivo.getAbsolutePath()));
rutaArchivo = ini.get("Archivos", "estadios");
this.LeerDatos_estadio();
this.MostrarDatos_estadio();
```

Seguir el mismo patron de los 4 metodos que usa el Integrante 1.

---

## w_jugador — CRUD con ComboBox (la mas importante de tu modulo)

### Campos visuales:
- `JTextField` para: id, nombre, dorsal
- **`JTextField`** para posicion (texto libre: Portero, Defensa, etc.)
- **`JComboBox`** para seleccionar la Seleccion (se llena con datos del archivo)
- `JTable` en un `JScrollPane`
- Boton Nuevo, Boton Grabar

### Variables globales necesarias:

```java
String rutaJugadores;
String rutaSelecciones;   // para cargar el ComboBox
String rutaPosiciones;    // para cargar el ComboBox

ArrayList<Jugador> estructura_jugadores = new ArrayList<>();
ArrayList<Seleccion> estructura_selecciones = new ArrayList<>();
ArrayList<Posicion> estructura_posiciones = new ArrayList<>();
```

### En el constructor, cargar todo:

```java
Wini ini = new Wini(new File("configuracion.ini"));
rutaJugadores  = ini.get("Archivos", "jugadores");
rutaSelecciones = ini.get("Archivos", "selecciones");
rutaPosiciones  = ini.get("Archivos", "posiciones");

this.LeerDatos_jugador();
this.LeerDatos_selecciones();  // para el ComboBox
this.LeerDatos_posiciones();   // para el ComboBox
this.CargarComboSeleccion();
this.CargarComboPosicion();
this.MostrarDatos_jugador();
```

### Metodo para cargar el ComboBox de Selecciones:

```java
public void CargarComboSeleccion() {
    jComboBox1.removeAllItems();
    for (Seleccion s : estructura_selecciones) {
        jComboBox1.addItem(s.getId() + " - " + s.getNombre());
    }
}
```

### Metodo Agregar para Jugador (guarda solo el ID):

```java
public void Agregar_jugador() {
    Jugador j = new Jugador("", "", "", "", "");
    j.setId(this.jTextField1.getText());
    j.setNombre(this.jTextField2.getText());
    j.setDorsal(this.jTextField3.getText());

    // Del ComboBox tomamos solo el ID (lo primero antes del " - ")
    String seleccionSeleccionada = jComboBox1.getSelectedItem().toString();
    j.setSeleccionId(seleccionSeleccionada.split(" - ")[0]);

    String posicionSeleccionada = jComboBox2.getSelectedItem().toString();
    j.setPosicionId(posicionSeleccionada.split(" - ")[0]);

    estructura_jugadores.add(j);
    JOptionPane.showMessageDialog(null, "Jugador agregado correctamente");
}
```

---

## Aviso importante para tu companero

Cuando termines `w_jugador` funcionando,
**avisar al grupo** para que el Integrante 3 pueda arrancar con `w_figurita`.

```
git add .
git commit -m "Termina CRUD Jugador - listo para Integrante 3"
git push
```
