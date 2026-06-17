package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 1 - GABI
 * Clase modelo para las leyendas historicas del Mundial.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * Ejemplos: Maradona, Pele, Ronaldo, Zidane, Beckenbauer
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Leyenda implements Serializable {

    private String id;
    private String nombre;
    private String pais;
    private String anioMundial;

    public Leyenda(String id, String nombre, String pais, String anioMundial) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.anioMundial = anioMundial;
    }

    public String getId()            { return id; }
    public String getNombre()        { return nombre; }
    public String getPais()          { return pais; }
    public String getAnioMundial()   { return anioMundial; }

    public void setId(String id)                   { this.id = id; }
    public void setNombre(String nombre)           { this.nombre = nombre; }
    public void setPais(String pais)               { this.pais = pais; }
    public void setAnioMundial(String anioMundial) { this.anioMundial = anioMundial; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + pais + ")";
    }
}
