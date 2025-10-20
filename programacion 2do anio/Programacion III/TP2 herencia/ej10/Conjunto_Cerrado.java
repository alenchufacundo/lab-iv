public class Conjunto_Cerrado extends Casa {
    private boolean incluyeAreaComun;

    public Conjunto_Cerrado(String direccion, int id, int area,double precioM2, int cantBaños, int cantHabitaciones, boolean incluyeAreaComun, double valorAdministracion) {
        super(direccion, id, area, precioM2, cantBaños, cantHabitaciones, valorAdministracion);
        this.incluyeAreaComun = incluyeAreaComun;
    }

    public boolean isIncluyeAreaComun() {
        return incluyeAreaComun;
    }

    public void setIncluyeAreaComun(boolean incluyeAreaComun) {
        this.incluyeAreaComun = incluyeAreaComun;
    }

    @Override
    public void imprimir() {
        System.out.println("Conjunto cerrado--------------------------------"); 
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Precio M2: " + getPrecioM2());
        System.out.println("Incluye Area Comun: " + isIncluyeAreaComun());
        System.out.println("Valor Administracion: " + getValorAdministracion());
        System.out.println("Cantidad de Baños: " + getCantBaños());
        System.out.println("Cantidad de Habitaciones: " + getCantHabitaciones());
        System.out.println("Precio de venta: " + getPrecioM2() * getArea());
    }

}
