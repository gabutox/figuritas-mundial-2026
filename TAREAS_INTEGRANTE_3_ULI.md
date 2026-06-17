# TAREAS — ULI
## Modulo Figurita: Figurita + ColeccionFigurita

---

## ANTES DE ARRANCAR

Esperar a que el Integrante 2 termine y suba `w_jugador`.
Hacer `git pull` para bajar todos los cambios antes de empezar.

```
git pull
```

---

## Clases que te tocan

| Archivo | Estado | Descripcion |
|---------|--------|-------------|
| `Figurita.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `ColeccionFigurita.java` | ✅ YA CREADA | Solo leerla, no modificar |
| `w_figurita.java` | ❌ CREAR VOS | CRUD de Figuritas (con ComboBox de Jugador) |
| `w_coleccion.java` | ❌ CREAR VOS | CRUD de Coleccion (con ComboBox de Usuario y Figurita) |

---

## Orden recomendado

```
1. w_figurita    <- tiene 1 ComboBox (Jugador)
2. w_coleccion   <- tiene 2 ComboBox (Usuario y Figurita), la mas compleja del proyecto
```

---

## Como crear cada ventana en NetBeans

1. Clic derecho en el paquete `proyecto_lenguaje_ii`
2. New → JFrame Form
3. Ponerle el nombre (ej: `w_figurita`)
4. NetBeans crea automaticamente el `.java` y el `.form`

---

## w_figurita — CRUD con ComboBox de Jugador

### Campos visuales:
- `JTextField` para: id, numero
- `JTextField` o `JComboBox` para tipo (puede ser fijo: Jugador/Escudo/Estadio)
- **`JComboBox`** para seleccionar el Jugador
- `JTable` en un `JScrollPane`
- Boton Nuevo, Boton Grabar

### Variables globales necesarias:

```java
String rutaFiguritas;
String rutaJugadores;   // para cargar el ComboBox

ArrayList<Figurita> estructura_figuritas = new ArrayList<>();
ArrayList<Jugador> estructura_jugadores = new ArrayList<>();
```

### En el constructor, cargar todo:

```java
Wini ini = new Wini(new File("configuracion.ini"));
rutaFiguritas = ini.get("Archivos", "figuritas");
rutaJugadores = ini.get("Archivos", "jugadores");

this.LeerDatos_figurita();
this.LeerDatos_jugadores();   // para el ComboBox
this.CargarComboJugador();
this.MostrarDatos_figurita();
```

### Metodo para cargar el ComboBox de Jugadores:

```java
public void CargarComboJugador() {
    jComboBox1.removeAllItems();
    for (Jugador j : estructura_jugadores) {
        jComboBox1.addItem(j.getId() + " - " + j.getNombre());
    }
}
```

### Metodo Agregar para Figurita:

```java
public void Agregar_figurita() {
    Figurita f = new Figurita("", "", "", "");
    f.setId(this.jTextField1.getText());
    f.setNumero(this.jTextField2.getText());
    f.setTipo(this.jTextField3.getText()); // o del ComboBox de tipos

    // Del ComboBox tomamos solo el ID
    String jugadorSeleccionado = jComboBox1.getSelectedItem().toString();
    f.setJugadorId(jugadorSeleccionado.split(" - ")[0]);

    estructura_figuritas.add(f);
    JOptionPane.showMessageDialog(null, "Figurita agregada correctamente");
}
```

---

## w_coleccion — La ventana mas importante del proyecto

Esta es la ventana central del sistema: registra que figuritas tiene cada usuario.

### Campos visuales:
- `JTextField` para: id, cantidad
- **`JComboBox`** para seleccionar el Usuario
- **`JComboBox`** para seleccionar la Figurita
- **`JComboBox`** para el estado (TENGO / ME_FALTA / REPETIDA)
- `JTable` en un `JScrollPane`
- Boton Nuevo, Boton Grabar

### Variables globales necesarias:

```java
String rutaColeccion;
String rutaUsuarios;    // para ComboBox
String rutaFiguritas;   // para ComboBox

ArrayList<ColeccionFigurita> estructura_coleccion = new ArrayList<>();
ArrayList<Usuario> estructura_usuarios = new ArrayList<>();
ArrayList<Figurita> estructura_figuritas = new ArrayList<>();
```

### En el constructor, cargar todo:

```java
Wini ini = new Wini(new File("configuracion.ini"));
rutaColeccion = ini.get("Archivos", "coleccion");
rutaUsuarios  = ini.get("Archivos", "usuarios");
rutaFiguritas = ini.get("Archivos", "figuritas");

this.LeerDatos_coleccion();
this.LeerDatos_usuarios();
this.LeerDatos_figuritas();
this.CargarComboUsuario();
this.CargarComboFigurita();
this.CargarComboEstado();
this.MostrarDatos_coleccion();
```

### Cargar el ComboBox de estado (valores fijos, no de archivo):

```java
public void CargarComboEstado() {
    jComboBox3.removeAllItems();
    jComboBox3.addItem("TENGO");
    jComboBox3.addItem("ME_FALTA");
    jComboBox3.addItem("REPETIDA");
}
```

### Metodo Agregar para ColeccionFigurita:

```java
public void Agregar_coleccion() {
    ColeccionFigurita c = new ColeccionFigurita("", "", "", "", "");
    c.setId(this.jTextField1.getText());
    c.setCantidad(this.jTextField2.getText());

    String usuarioSel = jComboBox1.getSelectedItem().toString();
    c.setUsuarioId(usuarioSel.split(" - ")[0]);

    String figuritaSel = jComboBox2.getSelectedItem().toString();
    c.setFiguritaId(figuritaSel.split(" - ")[0]);

    c.setEstado(jComboBox3.getSelectedItem().toString());

    estructura_coleccion.add(c);
    JOptionPane.showMessageDialog(null, "Registro agregado correctamente");
}
```

---

## Tip final

Esta es la ventana con mas ComboBox del proyecto (3 en total).
Hacerla despues de w_figurita para tener practica con el patron.
Si algo no compila, revisar que hiciste `git pull` y tenes
las clases `Usuario.java`, `Figurita.java` y `ColeccionFigurita.java`
en el paquete.
