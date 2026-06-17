# Sistema de Figuritas - Mundial FIFA 2026
**Lenguajes de Programación II — Trabajo Práctico Final**

> Java Swing + NetBeans + Persistencia en Archivos (Serialización)

---

## Integrantes y división de trabajo

| Integrante | Módulo | Archivos que le tocan |
|------------|--------|----------------------|
| **Gabi (gabutox)** | Módulo Base | `Usuario.java`, `w_login`, `w_principal`, `w_usuarios`, `Seleccion.java`, `w_seleccion`, `Leyenda.java`, `w_leyenda` |
| **Compañero 2** | Módulo Jugador | `Estadio.java`, `w_estadio`, `Jugador.java`, `w_jugador` |
| **Compañero 3** | Módulo Figurita | `Figurita.java`, `w_figurita`, `ColeccionFigurita.java`, `w_coleccion` |

---

## Como clonar el proyecto (LEER ANTES DE TOCAR NADA)

### Paso 1 — Instalar Git
Descargar de https://git-scm.com e instalar con opciones por defecto.

### Paso 2 — Clonar el repositorio
Abrir una terminal (CMD o PowerShell) y ejecutar:
```
git clone https://github.com/gabutox/figuritas-mundial-2026.git
```
Esto crea la carpeta `figuritas-mundial-2026` con todo el proyecto adentro.

### Paso 3 — Abrir en NetBeans
- Abrir NetBeans
- File → Open Project
- Navegar hasta la carpeta clonada y abrirla

---

## Como trabajar todos los dias (RUTINA OBLIGATORIA)

### Antes de empezar a programar — bajar cambios
```
git pull
```

### Cuando terminas algo — subir tu trabajo
```
git add .
git commit -m "descripcion de lo que hiciste"
git push
```

**Ejemplo de mensaje de commit:**
```
git commit -m "Agrega clase Jugador con getters y setters"
git commit -m "Termina CRUD de Seleccion con serializacion"
git commit -m "Agrega ComboBox de selecciones en w_jugador"
```

---

## Orden de desarrollo (importante seguir este orden)

```
SEMANA 1
  Gabi → Login + CRUD Usuario + CRUD Seleccion + CRUD Posicion

SEMANA 2
  Gabi    → sigue con detalles y pruebas
  Comp 2  → CRUD Estadio + CRUD Jugador (necesita Seleccion y Posicion de Gabi)

SEMANA 3
  Los 3 en paralelo
  Comp 3  → CRUD Figurita + CRUD Coleccion (necesita Jugador de Comp 2)
```

---

## Estructura del proyecto

```
proyecto_lenguaje_ii/
├── src/
│   └── proyecto_lenguaje_ii/
│       ├── Usuario.java               <- Gabi
│       ├── Seleccion.java             <- Gabi
│       ├── Posicion.java              <- Gabi
│       ├── Estadio.java               <- Compañero 2
│       ├── Jugador.java               <- Compañero 2
│       ├── Figurita.java              <- Compañero 3
│       ├── ColeccionFigurita.java     <- Compañero 3
│       ├── w_login.java               <- Gabi
│       ├── w_principal.java           <- Gabi
│       ├── w_usuarios.java            <- Gabi
│       ├── w_seleccion.java           <- Gabi
│       ├── w_posicion.java            <- Gabi
│       ├── w_estadio.java             <- Compañero 2
│       ├── w_jugador.java             <- Compañero 2
│       ├── w_figurita.java            <- Compañero 3
│       └── w_coleccion.java           <- Compañero 3
├── usuarios.txt                       <- se genera solo al ejecutar
├── selecciones.txt
├── posiciones.txt
├── estadios.txt
├── jugadores.txt
├── figuritas.txt
├── coleccion.txt
├── configuracion.ini                  <- NO modificar
├── ini4j-0.5.4.jar                    <- libreria del profe, NO tocar
└── README.md                          <- este archivo
```

---

## Regla de oro

> Siempre hacer `git pull` antes de empezar.
> Nunca subir archivos `build/` ni `.class`.
> Avisar por el grupo cuando terminas algo para que los otros puedan hacer pull.

---

## Patron de codigo (los 4 metodos de cada ventana)

Cada ventana `w_X.java` debe tener exactamente estos 4 metodos:

```java
// 1. Lee el archivo y llena el ArrayList
public void LeerDatos_X() { ... }

// 2. Guarda el ArrayList completo en el archivo
public void GrabarDatos_X() { ... }

// 3. Toma los campos de la pantalla y agrega al ArrayList
public void Agregar_X() { ... }

// 4. Recorre el ArrayList y muestra los datos en la JTable
public void MostrarDatos_X() { ... }
```

Copiar el estilo del archivo `w_usuarios.java` del proyecto de ejemplo del profesor.

---

## Entidades y sus atributos

| Clase | Atributos | Depende de |
|-------|-----------|------------|
| `Usuario` | id, nombre, usuario, clave | — |
| `Seleccion` | id, nombre, confederacion, grupo | — |
| `Leyenda` | id, nombre, pais, anioMundial, golesEnMundiales | — |
| `Estadio` | id, nombre, ciudad, pais, capacidad | — |
| `Jugador` | id, nombre, dorsal, posicion, seleccionId | Seleccion |
| `Figurita` | id, numero, tipo, jugadorId | Jugador |
| `ColeccionFigurita` | id, usuarioId, figuritaId, estado, cantidad | Usuario + Figurita |

> **IMPORTANTE:** Los campos que terminan en `Id` guardan solo el identificador
> (un String o int), NO el objeto completo. Esto evita errores de serializacion.
