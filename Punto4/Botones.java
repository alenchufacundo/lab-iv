package Punto4;

public class Botones {
    protected int ancho;
    protected int alto;
    protected Texto texto;
    protected String accion;
    protected String icono;

    
    public Botones(int ancho, int alto, Texto texto, String accion, String icono) {
        this.ancho = ancho;
        this.alto = alto;
        this.texto = texto;
        this.accion = accion;
        this.icono = icono;
    }

    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    public Texto getTexto() {
        return texto;
    }
    public void setTexto(Texto texto) {
        this.texto = texto;
    }
    public String getAccion() {
        return accion;
    }
    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    
    
}
