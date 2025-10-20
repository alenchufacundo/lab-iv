package ej7l ;

public class Principal {
    public static void main(String[] args) {
        Autos auto = new Autos("Fiat", 2010, "AAA000", 400000, null);
        Motos moto = new Motos("Honda", 2023, "AAA111", 5000, null);

        auto.encenderAire(false);
        auto.encenderAuto(true);
        auto.acelerarAuto(true);

        moto.getCilindrada(200);
        moto.esGamaAlta();        
    }
}
