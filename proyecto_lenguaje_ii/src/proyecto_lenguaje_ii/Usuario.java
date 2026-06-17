package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 1 - GABI
 * Clase modelo para los usuarios del sistema.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Usuario implements Serializable {

    private String id;
    private String nombre;
    private String usuario;
    private String clave;

    public Usuario(String id, String nombre, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getId()          { return id; }
    public String getNombre()      { return nombre; }
    public String getUsuario()     { return usuario; }
    public String getClave()       { return clave; }

    public void setId(String id)           { this.id = id; }
    public void setNombre(String nombre)   { this.nombre = nombre; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setClave(String clave)     { this.clave = clave; }

    @Override
    public String toString() {
        return id + " - " + nombre;
    }
}
