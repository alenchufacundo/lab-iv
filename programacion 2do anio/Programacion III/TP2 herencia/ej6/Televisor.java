package ej6;

public class Televisor extends Electrodomestico{
    private int cantPulgadas;

    public Televisor(double precio, String color, char consumo, int cantPulgadas) {
        super(precio, color, consumo);
        this.cantPulgadas = cantPulgadas;
    }

    public int getCantPulgadas() {
        return cantPulgadas;
    }

    public void setCantPulgadas(int cantPulgadas) {
        this.cantPulgadas = cantPulgadas;
    }

    @Override
    public String toString() {
        return "Televisor =  [\n" +
                "   precio =" + getPrecio() + ",\n" +
                "   color =" + getColor() + ",\n" +
                "   consumo =" + getConsumo() + ",\n" +
                "   cantPulgadas =" + cantPulgadas + ",\n" +
                "]";
        }
  
}
