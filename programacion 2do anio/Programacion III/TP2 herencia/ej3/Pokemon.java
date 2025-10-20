package ej3;

public class Pokemon {
    private String nombre;
    private String color;
    private double potenciaAtaque;
    private int nivelVida;

    //constructor con valores especificos
    // public Pokemon(String nombre, String color, int potenciaAtaque, int nivelVida) {
    //     this.nombre = nombre;
    //     this.color = color;
    //     this.potenciaAtaque = potenciaAtaque;
    //     this.nivelVida = nivelVida;
    // }
    //constructor x defecto
    public Pokemon() {
        // Valores por defecto
        this.nombre = "Charizard";
        this.color = "Rojo";
        this.potenciaAtaque = 50;
        this.nivelVida = 100;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPotenciaAtaque() {
        return potenciaAtaque;
    }
    public void setPotenciaAtaque(int potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }

    public void saludoPokemon(){
        System.out.println("Hola, soy "+ nombre);
    }

    public void sanarPokemon(){
        if (nivelVida < 100) {
            System.out.println("Sanando a "+ nombre + "...") ;
            nivelVida = (100-nivelVida)+nivelVida;
            System.out.println("Ahora tiene "+ nivelVida + " de vida");
        }
    }

    public void evolucionarPokemon(String nombreNuevo, String colorNuevo){
        nombre = nombreNuevo;
        color = colorNuevo;
        potenciaAtaque = (potenciaAtaque*0.2)+potenciaAtaque;
    }

    

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.saludoPokemon();
        pokemon.sanarPokemon();
        pokemon.evolucionarPokemon("Charmeleon","Azul");
        System.out.println(pokemon);
    }

}
