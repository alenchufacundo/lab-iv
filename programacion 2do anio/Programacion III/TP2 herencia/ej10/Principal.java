public class Principal {

    public static void main(String[] args) {

        Monoambiente m1 = new Monoambiente("Alsina 111", 1, 100, 1000000, 2, 2, 40000);
        m1.imprimir();

        Depto_Familiar d1 = new Depto_Familiar("Estados unidos 1234", 2, 340, 1800000, 3, 2, 80000);
        d1.imprimir();
    }
}