package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 2
 * Clase modelo para los jugadores del Mundial FIFA 2026.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * IMPORTANTE: seleccionId guarda solo el ID (String), NO el objeto Seleccion.
 * Esto evita errores de serializacion circular.
 *
 * Ejemplo: si Argentina tiene id="ARG", entonces seleccionId = "ARG"
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Jugador implements Serializable {

    private String id;
    private String nombre;
    private String dorsal;
    private String posicion;
    private String seleccionId;

    public Jugador(String id, String nombre, String dorsal, String posicion, String seleccionId) {
        this.id = id;
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.seleccionId = seleccionId;
    }

    public String getId()           { return id; }
    public String getNombre()       { return nombre; }
    public String getDorsal()       { return dorsal; }
    public String getPosicion()     { return posicion; }
    public String getSeleccionId()  { return seleccionId; }

    public void setId(String id)                   { this.id = id; }
    public void setNombre(String nombre)           { this.nombre = nombre; }
    public void setDorsal(String dorsal)           { this.dorsal = dorsal; }
    public void setPosicion(String posicion)       { this.posicion = posicion; }
    public void setSeleccionId(String seleccionId) { this.seleccionId = seleccionId; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (#" + dorsal + ")";
    }
}
