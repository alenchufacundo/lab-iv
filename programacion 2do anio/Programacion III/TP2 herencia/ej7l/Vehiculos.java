package ej7l;
public class Vehiculos {

  public String marca;
  public int modelo;
  public String patente;
  public double precio;
  public Motor motor;
  

  public Vehiculos(String marca, int modelo, String patente, double precio, Motor motor) {
    this.marca = marca;
    this.modelo = modelo;
    this.patente = patente;
    this.precio = precio;
    this.motor = motor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getModelo() {
    return modelo;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public String getPatente() {
    return patente;
  }

  public void setPatente(String patente) {
    this.patente = patente;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void encender() {
  }
  
  public void acelerar() {
  }

  public void frenar() {
  }

}