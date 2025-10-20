package ej9;

public class Cajero extends Empleados {
    
    
    public Cajero(String nombre, int dni, String domicilio, String fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Cajero--------------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Sueldo a cobrar: " + getSueldo());
    }    
}
