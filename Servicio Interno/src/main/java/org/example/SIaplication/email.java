package org.example.SIaplication;

public class email {

    private String destinatario;
    private String origen;
    private String mensaje;
    private String asunto;

    public email(String destinatario, String mensaje, String asunto){
        this.destinatario = destinatario;
        this.origen = "supermercasapractica@gmail.com";
        this.mensaje = mensaje;
        this.asunto = asunto;
    }

    public email(){}

    public email(String destinatario, String asunto){
        this.destinatario = destinatario;
        this.origen = "supermercasapractica@gmail.com";
        this.asunto = asunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getOrigen() {
        return origen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
}
