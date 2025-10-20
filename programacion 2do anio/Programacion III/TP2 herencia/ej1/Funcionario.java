package ej1;
public class Funcionario extends Persona{
    private TipoPoder poder;

    public Funcionario(String nombre, String apellido, int dni, TipoPoder poder) {
        super(nombre, apellido, dni);
        this.poder = poder;
    }

    public TipoPoder getPoder() {
        return poder;
    }

    public void setPoder(TipoPoder poder) {
        this.poder = poder;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", dni='" + getDni() + '\'' +
                "tipoPoder='" + poder + '\''+
                '}';
    }
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Juan", "Perez", 12345678, TipoPoder.EJECUTIVO);
        System.out.println(funcionario);
    }
    
}
