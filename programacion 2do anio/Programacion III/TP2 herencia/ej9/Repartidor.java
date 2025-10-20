package ej9;

public class Repartidor extends Empleados {
    private int repartosMensuales;
    private int repartosDiarios;

    public Repartidor(String nombre, int dni, String domicilio, String fechaIngreso, int repartosMensuales, int repartosDiarios) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.repartosMensuales = repartosMensuales;
        this.repartosDiarios = repartosDiarios;
    }

    public int getRepartosMensuales() {
        return repartosMensuales;
    }

    public void setRepartosMensuales(int repartosMensuales) {
        this.repartosMensuales = repartosMensuales;
    }

    public int getRepartosDiarios() {
        return repartosDiarios;
    }

    public void setRepartosDiarios(int repartosDiarios) {
        this.repartosDiarios = repartosDiarios;
    }
    
    // Los repartidores cobran 500 pesos extra por cada reparto que realicen. Se debe
// guardar un atributo que contabilice los repartos mensuales.

    public double calcularSueldoRepartidor() {
        double sueldo =  repartosDiarios * 500 + super.getSueldo();
        repartosMensuales = repartosDiarios + repartosMensuales;
        return sueldo;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("Repartidor--------------------------------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Sueldo a cobrar: " + calcularSueldoRepartidor());
    }
}
