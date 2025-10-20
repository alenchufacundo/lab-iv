public class Depto_Familiar extends Apartamentos {

    public Depto_Familiar(String direccion, int id, int area, double precioM2, int cantBaños, int cantHabitaciones,
            double valorAdministracion) {
        super(direccion, id, area, precioM2, cantBaños, cantHabitaciones, valorAdministracion);
    }

    @Override
    public void imprimir() {
        System.out.println("Departamento Familiar--------------------------------");
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