package org.unitec.mensajitoandroid;

/**
 * Created by luisabrahamaquinocastillo on 3/23/18.
 */

public class Mensajito {
    String id;
    Fecha fecha;
    Hora hora;
    String titulo;
    String cuerpo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}
