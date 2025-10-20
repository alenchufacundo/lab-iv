public class Persona {

    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    public Persona(String nombre, String apellido, char sexo , int edad, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es " + nombre);        
        System.out.println("El apellido es " + apellido);        
        System.out.println("El sexo es " + sexo);        
        System.out.println("La edad es " + edad);        
        System.out.println("La ciudad es " + ciudad);        
    }

    public void mayorDeEdad(){
        if (edad>=18) {
            System.out.println("la persona + 18 es " + nombre);
        }else{
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        
        Persona juan = new Persona("juan" ,"gimenez"  , 'M' , 0 , "bahia blanca");
        Persona soloNombre = new Persona("juan" ,"gimenez", 'M', 0, null);
        
        juan.mostrarDatos();
        soloNombre.mostrarDatos();
        juan.mayorDeEdad();
    }
}