public class Inmueble {
    private String direccion;
    private int id;
    private int area;
    private double precioM2;

    public Inmueble(String direccion, int id, int area, double precioM2) {
        this.direccion = direccion;
        this.id = id;
        this.area = area;
        this.precioM2 = precioM2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }    

    public double getPrecioM2() {
        return precioM2;
    }

    public void setPrecioM2(double precioM2) {
        this.precioM2 = precioM2;
    }
    

    

    public void imprimir() {
        System.out.println("Inmueble--------------------------------");
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Precio por M2: " + getPrecioM2());
        System.out.println("Precio de venta: " + getPrecioM2() * getArea());
    }

    
}
