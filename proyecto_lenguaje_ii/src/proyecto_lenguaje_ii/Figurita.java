package proyecto_lenguaje_ii;

import java.io.Serializable;

/**
 * INTEGRANTE 3
 * Clase modelo para las figuritas del album.
 * Implementa Serializable para poder guardarse en archivo.
 *
 * IMPORTANTE: jugadorId guarda solo el ID (String), NO el objeto Jugador.
 * Esto evita errores de serializacion circular.
 *
 * El campo "tipo" puede ser: "Jugador", "Escudo", "Estadio"
 *
 * TODO: Esta clase ya esta completa. No modificar.
 */
public class Figurita implements Serializable {

    private String id;
    private String numero;
    private String tipo;
    private String jugadorId;

    public Figurita(String id, String numero, String tipo, String jugadorId) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.jugadorId = jugadorId;
    }

    public String getId()           { return id; }
    public String getNumero()       { return numero; }
    public String getTipo()         { return tipo; }
    public String getJugadorId()    { return jugadorId; }

    public void setId(String id)             { this.id = id; }
    public void setNumero(String numero)     { this.numero = numero; }
    public void setTipo(String tipo)         { this.tipo = tipo; }
    public void setJugadorId(String jugadorId) { this.jugadorId = jugadorId; }

    @Override
    public String toString() {
        return "N°" + numero + " - " + tipo;
    }
}
