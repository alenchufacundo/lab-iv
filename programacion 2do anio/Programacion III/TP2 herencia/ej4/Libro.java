package ej4;

public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro [\n" +
                "titulo=" + titulo + ",\n" +
                "   autor=" + autor + ",\n" +
                "   precio=" + precio + ",\n" +
                "]";
    }

    public static void main(String[] args) {
        Libro libro = new Libro("El señor de los anillos", "J. R. R. Tolkien", 15000);
        System.out.println(libro);
    }
}
