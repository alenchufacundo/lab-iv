    public class Casa extends Viviendas {
        private double valorAdministracion;
        
        public Casa(String direccion, int id, int area, double precioM2, int cantBaños, int cantHabitaciones, double valorAdministracion) {
            super(direccion, id, area, precioM2, cantBaños, cantHabitaciones);
            this.valorAdministracion = valorAdministracion;
        }

        public double getValorAdministracion() {
            return valorAdministracion;
        }

        public void setValorAdministracion(double valorAdministracion) {
            this.valorAdministracion = valorAdministracion;
        }
    }
