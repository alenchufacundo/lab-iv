package Punto4;

public class Scrollbar {
    protected double valorMin;
    protected double valorMax;
    protected double valorActual;
    protected String orientacion;

    
    public Scrollbar(double valorMin, double valorMax, double valorActual, String orientacion) {
        this.valorMin = valorMin;
        this.valorMax = valorMax;
        this.valorActual = valorActual;
        this.orientacion = orientacion;
    }


    public double getValorMin() {
        return valorMin;
    }


    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }


    public double getValorMax() {
        return valorMax;
    }


    public void setValorMax(double valorMax) {
        this.valorMax = valorMax;
    }


    public double getValorActual() {
        return valorActual;
    }


    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }


    public String getOrientacion() {
        return orientacion;
    }


    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    
}
