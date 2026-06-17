package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 2
 * Clase modelo para los jugadores del Mundial FIFA 2026.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * IMPORTANTE: seleccionId y posicionId guardan solo el ID (String),
 * NO el objeto completo. Esto evita errores de serializacion circular.
 *
 * Ejemplo: si Argentina tiene id="ARG", entonces seleccionId = "ARG"
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Jugador implements Serializable {

    private String id;
    private String nombre;
    private String dorsal;
    private String seleccionId;
    private String posicionId;

    public Jugador(String id, String nombre, String dorsal, String seleccionId, String posicionId) {
        this.id = id;
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.seleccionId = seleccionId;
        this.posicionId = posicionId;
    }

    public String getId()           { return id; }
    public String getNombre()       { return nombre; }
    public String getDorsal()       { return dorsal; }
    public String getSeleccionId()  { return seleccionId; }
    public String getPosicionId()   { return posicionId; }

    public void setId(String id)                   { this.id = id; }
    public void setNombre(String nombre)           { this.nombre = nombre; }
    public void setDorsal(String dorsal)           { this.dorsal = dorsal; }
    public void setSeleccionId(String seleccionId) { this.seleccionId = seleccionId; }
    public void setPosicionId(String posicionId)   { this.posicionId = posicionId; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (#" + dorsal + ")";
    }
}
