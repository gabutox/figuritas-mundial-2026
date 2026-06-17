package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 2
 * Clase modelo para los estadios del Mundial FIFA 2026.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Estadio implements Serializable {

    private String id;
    private String nombre;
    private String ciudad;
    private String pais;
    private String capacidad;

    public Estadio(String id, String nombre, String ciudad, String pais, String capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.capacidad = capacidad;
    }

    public String getId()          { return id; }
    public String getNombre()      { return nombre; }
    public String getCiudad()      { return ciudad; }
    public String getPais()        { return pais; }
    public String getCapacidad()   { return capacidad; }

    public void setId(String id)               { this.id = id; }
    public void setNombre(String nombre)       { this.nombre = nombre; }
    public void setCiudad(String ciudad)       { this.ciudad = ciudad; }
    public void setPais(String pais)           { this.pais = pais; }
    public void setCapacidad(String capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + ciudad + ")";
    }
}
