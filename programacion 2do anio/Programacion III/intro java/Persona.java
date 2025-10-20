public class Persona {
    public Integer edad;
    public String nombre;
    public Posicion posicion;    
    
    // dos formas de crear un objeto tipo persona:
    // 1.
        // Persona juan;
        // juan = new Persona();
    // 2.
        // Persona juan = new Persona();
        
    // constructor
    public Persona(Integer edad, String nombre, Posicion posicion){
        this.edad = edad;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public static void main(String[] args) {
        // 1. Crear una instancia de Persona utilizando el constructor con parámetros
        Posicion posicionJuan = new Posicion("Delantero");
        
        Persona juan = new Persona(25, "Juan", posicionJuan);
        System.out.println(juan.nombre + " " + juan.edad + " " + juan.posicion.nombrePosicion);
            
        // 2. Crear una instancia de Persona utilizando el constructor sin parámetros
        Persona juanSinParametros = new Persona(null, null, null); // o proporciona valores adecuados
        System.out.println(juanSinParametros.edad);
    }
        
}
