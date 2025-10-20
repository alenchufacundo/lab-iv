package ej1;

public class Senador extends Legislador {
    public Senador(String nombre, String apellido, int dni, TipoPoder poder, String provinciaQueRepresenta) {
        super(nombre, apellido, dni, poder, provinciaQueRepresenta);
    }

    @Override
    public String toString() {
        return "Senador{" + "\n" +
                "   nombre='" + getNombre() + ", " + "\n" +
                "   apellido='" + getApellido() + ", " + "\n" +
                "   dni='" + getDni() + ", " + "\n" +
                "   tipoPoder='" + getPoder() + ", " +"\n" +
                "   provinciaQueRepresenta='" + getProvinciaQueRepresenta() + '\'' + "\n" +
        '}';
    }

    public static void main(String[] args) {
        Senador senador = new Senador("Juan", "Perez", 12345678, TipoPoder.EJECUTIVO, "La Pampa");
        System.out.println(senador);
    }
}
