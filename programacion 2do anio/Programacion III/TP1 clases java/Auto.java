public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    public Auto(String color, String patente, int año, double d, int km){
        this.color = color; 
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }

    public static void encender(){
        System.out.println("el auto se encendio");
    }

    public static void kilometrajeMayor(){
        if (km >= 1000000){
            System.out.println("el auto con patente " + patente + "tiene mas de 100000");
        }
    }

    public static void main(String[] args) {
        Auto siena = new Auto("rojo", "AAA999", 2015, 1.4, 1000000);  
        siena.encender();      
    }
}
