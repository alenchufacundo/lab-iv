package ej6;

public class Principal {
    public static void main(String[] args) {
        Televisor televisor = new Televisor(120000, "negro", 'D', 55);      
        Lavadora lavadora = new Lavadora(3690, "Gris", 'F', 1258, 11);  

        System.out.println(lavadora);

        System.out.println(televisor);
    }
}
