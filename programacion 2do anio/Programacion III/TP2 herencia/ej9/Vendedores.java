package ej9;

public class Vendedores extends Empleados {
    private int cantVentas;

    
    public Vendedores(String nombre, int dni, String domicilio, String fechaIngreso, int cantVentas) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.cantVentas = cantVentas;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    
    public double calcularSueldo(){
        double sueldo =  getSueldo() + (getCantVentas() * 0.5);
        return sueldo;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Vendedor--------------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Sueldo a cobrar: " + calcularSueldo());
    }
}
