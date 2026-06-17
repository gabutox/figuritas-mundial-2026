package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 1 - GABI
 * Clase modelo para las selecciones del Mundial FIFA 2026.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Seleccion implements Serializable {

    private String id;
    private String nombre;
    private String confederacion;
    private String grupo;

    public Seleccion(String id, String nombre, String confederacion, String grupo) {
        this.id = id;
        this.nombre = nombre;
        this.confederacion = confederacion;
        this.grupo = grupo;
    }

    public String getId()              { return id; }
    public String getNombre()          { return nombre; }
    public String getConfederacion()   { return confederacion; }
    public String getGrupo()           { return grupo; }

    public void setId(String id)                     { this.id = id; }
    public void setNombre(String nombre)             { this.nombre = nombre; }
    public void setConfederacion(String confederacion) { this.confederacion = confederacion; }
    public void setGrupo(String grupo)               { this.grupo = grupo; }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }
}
