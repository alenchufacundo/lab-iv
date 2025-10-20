package ej1;
public class Legislador extends Funcionario{
    private String provinciaQueRepresenta;

    public Legislador(String nombre, String apellido, int dni, TipoPoder poder, String provinciaQueRepresenta) {
        super(nombre, apellido, dni, poder);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    @Override
    public String toString() {
        return  "Legislador{" + "\n" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", dni='" + getDni() + '\'' +
                "tipoPoder='" + getPoder() + '\''+
                "provinciaQueRepresenta='" + provinciaQueRepresenta + '\'' + "\n" +
                '}';
    }

    public static void main(String[] args) {
        Legislador legislador = new Legislador("Juan", "Perez", 12345678, TipoPoder.EJECUTIVO, "Misiones");
        System.out.println(legislador);
    }
}