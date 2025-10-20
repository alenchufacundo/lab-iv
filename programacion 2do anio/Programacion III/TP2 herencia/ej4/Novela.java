package ej4;

public class Novela extends Libro{
    TipoNovela tipoNovela;

    public Novela(String titulo, String autor, double precio, TipoNovela tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }

    public TipoNovela getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(TipoNovela tipoNovela) {
        this.tipoNovela = tipoNovela;
    }

    @Override
    public String toString() {
        return "Novela[\n" +
                  "     Tipo="+ tipoNovela + ",\n" +
                  "     Titulo="+ getTitulo() + "\n" +
                  "     Autor=" + getAutor() + "\n" +
                  "     Precio=" + getPrecio() + "\n" +
                 "]";
    }

    public static void main(String[] args) {
        Novela novela = new Novela("El señor de los anillos", "J. R. R. Tolkien", 15000, TipoNovela.HISTORICA);
        System.out.println(novela);
    }    
}
