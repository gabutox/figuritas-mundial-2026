package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 1 - GABI
 * Clase modelo para las posiciones de juego.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * Posiciones posibles: Portero, Defensa, Mediocampista, Delantero
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Posicion implements Serializable {

    private String id;
    private String nombre;

    public Posicion(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId()        { return id; }
    public String getNombre()    { return nombre; }

    public void setId(String id)         { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }
}
