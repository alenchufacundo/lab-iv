package ej9;

public class Ejercicio2 {
    public static void main(String[] args) {
        Vendedores v1 = new Vendedores("Juan", 12345678, "San martin 200", "2018", 1000);
        Administrativo a1 = new Administrativo("Pedro", 56897213, "Sarmiento 2355", "2020", 20);
        Repartidor r1 = new Repartidor("Maria", 78632859, "Carronti 1000", "2015", 1000, 1000);
        Cajero c1 = new Cajero("Lucas", 5669988, "Alsina 11", "2000");
        
        v1.imprimirRecibo();
        a1.imprimirRecibo();
        r1.imprimirRecibo();
        c1.imprimirRecibo();
    }
}
