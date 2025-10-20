package ej5;

public class Animal {
    private String nombre;
    private String tipo;
    private int edad;
    private String raza;

    public Animal(String nombre, String tipo, int edad, String raza) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void seAlimenta() {
        System.out.println("El " + getTipo() + " " + getNombre() + " se alimenta.");
    }    
    
}
