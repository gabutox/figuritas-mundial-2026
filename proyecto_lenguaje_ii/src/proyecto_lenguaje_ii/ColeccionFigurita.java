package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 3
 * Clase modelo para registrar que figuritas tiene cada usuario.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * IMPORTANTE: usuarioId y figuritaId guardan solo el ID (String),
 * NO los objetos completos. Esto evita errores de serializacion circular.
 *
 * El campo "estado" puede ser: "TENGO", "ME_FALTA", "REPETIDA"
 * El campo "cantidad" indica cuantas tiene (util para REPETIDA).
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class ColeccionFigurita implements Serializable {

    private String id;
    private String usuarioId;
    private String figuritaId;
    private String estado;
    private String cantidad;

    public ColeccionFigurita(String id, String usuarioId, String figuritaId, String estado, String cantidad) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.figuritaId = figuritaId;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public String getId()           { return id; }
    public String getUsuarioId()    { return usuarioId; }
    public String getFiguritaId()   { return figuritaId; }
    public String getEstado()       { return estado; }
    public String getCantidad()     { return cantidad; }

    public void setId(String id)               { this.id = id; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public void setFiguritaId(String figuritaId) { this.figuritaId = figuritaId; }
    public void setEstado(String estado)       { this.estado = estado; }
    public void setCantidad(String cantidad)   { this.cantidad = cantidad; }

    @Override
    public String toString() {
        return "Usuario:" + usuarioId + " - Figurita:" + figuritaId + " - " + estado;
    }
}
