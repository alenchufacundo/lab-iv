package ej5;

public class Principal {
    public static void main(String[] args) {
        Animal perro = new Animal("Pepe", "Perro", 3, "Labrador");
        perro.seAlimenta();
        
        Animal gato = new Animal("Garfield", "Gato", 5, "Persa");
        gato.seAlimenta();

        Animal pajaro = new Animal("Tweety", "Pajaro", 1, "Canario");
        pajaro.seAlimenta();   
    }
}
