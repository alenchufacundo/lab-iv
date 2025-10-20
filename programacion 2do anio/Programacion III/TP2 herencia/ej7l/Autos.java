package ej7l;

public class Autos extends Vehiculos {
  
  public Autos(String marca, int modelo, String patente, double precio, Motor motor) {
    super(marca, modelo, patente, precio, motor);
  }

  public boolean encenderAire(boolean encender) {
    if (encender == true) {
      System.out.println("El aire se encendió");
      return false;
    } else {
      System.out.println("El aire se apago");
      encender = true;
      return true;
      
    }
  }

  public boolean encenderAuto(boolean prender){
    if (prender == true) {
      System.out.println("El auto se prendió");
      return false;
    } else {
      System.out.println("El auto se apago");
      prender = true;
      return true;
    }
  }


  public boolean acelerarAuto(boolean acelerar){
    if (acelerar == true) {
      System.out.println("El auto acelera...");
      return false;
    } else {
      System.out.println("El auto frena...");
      acelerar = true;
      return true;
    }
  }
}