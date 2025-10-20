package ej7l;

public class Motor extends Motos { 
  public double cilindrada;
  public int numeroMotor;
  public int cantKm;



  public Motor(String marca, int modelo, String patente, double precio, Motor motor, double cilindrada, int numeroMotor,
      int cantKm) {
    super(marca, modelo, patente, precio, motor);
    this.cilindrada = cilindrada;
    this.numeroMotor = numeroMotor;
    this.cantKm = cantKm;
  }

  public double getCilindrada() {
    return cilindrada;
  }

  public void setCilindrada(double cilindrada) {
    this.cilindrada = cilindrada;
  }

  public int getNumeroMotor() {
    return numeroMotor;
  }

  public void setNumeroMotor(int numeroMotor) {
    this.numeroMotor = numeroMotor;
  }

  public int getCantKm() {
    return cantKm;
  }

  public void setCantKm(int cantKm) {
    this.cantKm = cantKm;
  }


}