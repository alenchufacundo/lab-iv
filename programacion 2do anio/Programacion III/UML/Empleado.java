public class Empleado extends Persona {

  private int nEmpleado;

  private int valorHora;

  public int getSalario() {
    return valorHora * 160;
  }

}