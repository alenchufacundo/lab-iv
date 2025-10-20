package ej6;

public class Electrodomestico {
    private double precio;
    private String color;
    private char consumo;
    private char[] categorias = {'A','B','C','D','E','F'};

    public Electrodomestico(double precio, String color, char consumo) {
        this.precio = precio;
        this.color = color;
        this.consumo = Character.toUpperCase(consumo);
        boolean categoriaValida = false;
        for (char c : categorias) {
            if (c == this.consumo) {
                categoriaValida = true;
                break;
            }
        }
        if (!categoriaValida) {
            this.consumo = 'F';
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public char[] getCategorias() {
        return categorias;
    }

    public void setCategorias(char[] categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Electrodomestico:[\n" +
                "precio: " + precio + ",\n" +
                "color: " + color + ",\n" +
                "consumo: " + consumo + ",\n" +
                "]";
            }

    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(12685, "Verde", 'B');
        System.out.println(electrodomestico);
    }
    
    
}
