package ej9;

public class Administrativo extends Empleados {
    private int horasTrabajadas;

    public Administrativo(String nombre, int dni, String domicilio, String fechaIngreso,int horasTrabajadas) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double valorSueldo(){
        double sueldo;
        if (this.horasTrabajadas > 40) {
            sueldo = super.getSueldo() + 200000;
        }else{
            sueldo = super.getSueldo() + 50000;
        }
        return sueldo;
    }
    
    @Override
    public void imprimirRecibo() {
        System.out.println("Administrativo--------------------------------");
        System.out.println("Nombre y Apellido: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Sueldo a cobrar: " + valorSueldo());
    }
    

}
