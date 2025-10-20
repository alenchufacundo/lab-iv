package Punto4;

public class MarcoDeTexto {
    protected Texto texto;
    protected int ancho;
    protected int alto;
    
    public MarcoDeTexto(Texto texto, int ancho, int alto) {
        this.texto = texto;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
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
    
    
}
