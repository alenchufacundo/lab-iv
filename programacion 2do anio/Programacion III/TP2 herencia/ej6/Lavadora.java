package ej6;

public class Lavadora extends Electrodomestico {
    private int revoluciones;
    private int cargaMax;
    public Lavadora(double precio, String color, char consumo, int revoluciones, int cargaMax) {
        super(precio, color, consumo);
        this.revoluciones = revoluciones;
        this.cargaMax = cargaMax;
    }

    

    public int getRevoluciones() {
        return revoluciones;
    }



    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }



    public int getCargaMax() {
        return cargaMax;
    }



    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }



    @Override
    public String toString() {
        return "Lavadora =  [\n" +
                "   precio =" + getPrecio() + ",\n" +
                "   color =" + getColor() + ",\n" +
                "   consumo =" + getConsumo() + ",\n" +
                "   revoluciones =" + revoluciones + ",\n" +
                "   cargaMax =" + cargaMax + ",\n" +
                "]";
        }
    
}
