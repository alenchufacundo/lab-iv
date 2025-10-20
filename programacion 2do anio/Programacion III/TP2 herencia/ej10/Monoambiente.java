public class Monoambiente extends Apartamentos {

    public Monoambiente(String direccion, int id, int area, double precioM2, int cantBaños, int cantHabitaciones, double ValorAdministracion) {
        super(direccion, id, area, precioM2, cantBaños, cantHabitaciones, ValorAdministracion);
        precioM2 = 18000;
    }

    @Override
    public void imprimir() {
        System.out.println("Monoambiente--------------------------------");
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Precio M2: " + getPrecioM2());
        System.out.println("Cantidad de Baños: " + getCantBaños());
        System.out.println("Cantidad de Habitaciones: " + getCantHabitaciones());
        System.out.println("Valor Administracion: " + getValorAdministracion());
        System.out.println("Precio de venta: " + getPrecioM2() * getArea());
    }
    
}
