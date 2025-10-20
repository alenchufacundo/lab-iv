public class Viviendas extends Inmueble {
    private int cantBaños;
    private int cantHabitaciones;


    public Viviendas(String direccion, int id, int area, double precioM2, int cantBaños, int cantHabitaciones) {
        super(direccion, id, area, precioM2);
        this.cantBaños = cantBaños;
        this.cantHabitaciones = cantHabitaciones;
    }


    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    
}
