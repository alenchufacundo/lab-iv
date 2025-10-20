
public class Titular {

  private String nombre;
  private int dni;
  private String apellido;
  private int telefono;
  private String mail;

  public Titular(String nombre, int dni, String apellido, int telefono, String mail) {
    this.nombre = nombre;
    this.dni = dni;
    this.apellido = apellido;
    this.telefono = telefono;
    this.mail = mail;
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

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void mostrarTitular() {
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("DNI: " + this.getDni());
    System.out.println("Apellido: " + this.getApellido());
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Mail: " + this.getMail());
  }

}