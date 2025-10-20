package ej2;

public class Superheroe extends Persona {
    private String nombreFicticio;
    private String tipoPoder;

    public Superheroe(String nombre, double altura, String nombreFicticio, String tipoPoder) {
        super(nombre, altura);
        this.nombreFicticio = nombreFicticio;
        this.tipoPoder = tipoPoder;
    }

    public String getNombreFicticio() {
        return nombreFicticio;
    }

    public void setNombreFicticio(String nombreFicticio) {
        this.nombreFicticio = nombreFicticio;
    }

    public String getTipoPoder() {
        return tipoPoder;
    }

    public void setTipoPoder(String tipoPoder) {
        this.tipoPoder = tipoPoder;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nombre ficticio: " + nombreFicticio);
        System.out.println("Tipo de poder: " + tipoPoder);
    }
}
