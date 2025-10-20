package ej1;

public class Juez {
    private TipoPoder poder;
    private TipoJurisdiccion jurisdiccion;

    public Juez(TipoPoder poder, TipoJurisdiccion jurisdiccion) {
        this.poder = poder;
        this.jurisdiccion = jurisdiccion;
    }

    public TipoPoder getPoder() {
        return poder;
    }

    public void setPoder(TipoPoder poder) {
        this.poder = poder;
    }

    public TipoJurisdiccion getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(TipoJurisdiccion jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }
    
    @Override
    public String toString() {
        return "Juez{" + "\n" +
                "   tipoPoder='" + getPoder() + ", " +"\n" +
                "   tipoJurisdiccion='" + getJurisdiccion() + '\'' + "\n" +
        '}';
    }

    public static void main(String[] args) {
        Juez juez = new Juez(TipoPoder.EJECUTIVO, TipoJurisdiccion.NACIONAL);
        System.out.println(juez);
    }
    
}
