public class Locales extends Comerciales {
    private boolean interno;
    private String dondeEsta;

    public Locales(String direccion, int id, int area, double precioM2, boolean esInterno) {
        super(direccion, id, area, precioM2);
        this.interno = esInterno;
        this.dondeEsta = dondeEsta;
    }

    public void esInterno(boolean interno){
        if(interno){
            System.out.println("Es Interno");
        }else{
            System.out.println("Da a la calle");
        }

    }

    @Override
    public void imprimir() {
        System.out.println("Locales--------------------------------");
        System.out.println("Direccion: " + getDireccion());
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Precio M2: " + getPrecioM2());
        esInterno(interno);
        System.out.println("Precio de venta: " + getPrecioM2() * getArea());
        System.out.println("Donde esta establecido: " + dondeEsta);
    }

}