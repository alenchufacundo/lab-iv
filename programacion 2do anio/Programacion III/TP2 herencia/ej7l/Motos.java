package ej7l;

public class Motos extends Vehiculos {

    public Motos(String marca, int modelo, String patente, double precio, Motor motor) {
    super(marca, modelo, patente, precio, motor);
    }

    public boolean esGamaAlta() {
      if (motor.getCilindrada() >= 500) {
          return true;
      }else{
          return false;
      }
    }

}