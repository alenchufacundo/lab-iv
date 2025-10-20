package ej9;


public class Empleados extends Ejercicio2 {
   private String nombre;
   private int dni;
   private String domicilio;
   private String fechaIngreso;
   private static double sueldo=650000;

    public Empleados(String nombre, int dni, String domicilio, String fechaIngreso) {
      this.nombre = nombre;
      this.dni = dni;
      this.domicilio = domicilio;
      this.fechaIngreso = fechaIngreso;
   }
   

   public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getDni() {
        return dni;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public String getDomicilio() {
        return domicilio;
    }


    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getFechaIngreso() {
        return fechaIngreso;
    }


    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        Empleados.sueldo = sueldo;
    }

    public void imprimirRecibo(){
        System.out.println("Empleado--------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Sueldo a cobrar: " + sueldo);
    }
}
  
