package Punto4;

public class Texto {
    protected String texto;
    protected String fuente;
    protected int tamaño;
    protected String color;

    
    public Texto(String texto, String fuente, int tamaño, String color) {
        this.texto = texto;
        this.fuente = fuente;
        this.tamaño = tamaño;
        this.color = color;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }


    public String getFuente() {
        return fuente;
    }


    public void setFuente(String fuente) {
        this.fuente = fuente;
    }


    public int getTamaño() {
        return tamaño;
    }


    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    
    
}
