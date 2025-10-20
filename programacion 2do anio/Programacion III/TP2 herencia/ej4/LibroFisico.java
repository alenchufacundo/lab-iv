package ej4;
public class LibroFisico extends Libro {
    private boolean esTapaDura;
    
    public LibroFisico(String titulo, String autor, double precio, boolean esTapaDura) {
        super(titulo, autor, precio);
        this.esTapaDura = esTapaDura;
    }

    public boolean isEsTapaDura() {
        return esTapaDura;
    }

    
    public String getTapaDura() {
        // en este return se usa una forma abreviada de un if. donde la primera salida es el true y la segunda el false.
        return esTapaDura ? "Es tapa dura" : "No es tapa dura";
    }

    public void setEsTapaDura(boolean esTapaDura) {
        this.esTapaDura = esTapaDura;
    }
    
    @Override
    public String toString() {
        return "LibroFisico [\n" +
            "   esTapaDura=" + getTapaDura() + ",\n" +
            "   titulo=" + getTitulo() + ",\n" +
            "   autor=" + getAutor() + ",\n" +
            "   precio=" + getPrecio() + ",\n" +
        "]";
    }

    public static void main(String[] args) {
        LibroFisico libro = new LibroFisico("El señor de los anillos", "J. R. R. Tolkien", 15000, true);
        System.out.println(libro);
    }
    
}
