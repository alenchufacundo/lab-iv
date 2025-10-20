public class Oficina extends Comerciales{

    public Oficina(String direccion, int id, int area, double precioM2) {
        super(direccion, id, area, precioM2);

    }
    
    @Override
    public void imprimir() {
        System.out.println("Oficina--------------------------------");
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Precio M2: " + getPrecioM2());
        System.out.println("Precio de venta: " + getPrecioM2() * getArea());
    }
}
