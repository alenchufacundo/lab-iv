package Punto4;

public class Ventana {
    protected String titulo;
    protected String iconoPrincipal;
    protected int ancho;
    protected int alto;
    protected Panel panel;

    
    public Ventana(String titulo, int ancho, int alto, Panel panel, String iconoPrincipal) {
        this.titulo = titulo;
        this.ancho = ancho;
        this.alto = alto;
        this.panel = panel;
        this.iconoPrincipal = iconoPrincipal;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getAncho() {
        return ancho;
    }


    public void setAncho(int ancho) {
        this.ancho = ancho;
    }


    public int getAlto() {
        return alto;
    }


    public void setAlto(int alto) {
        this.alto = alto;
    }


    public Panel getPanel() {
        return panel;
    }


    public void setPanel(Panel panel) {
        this.panel = panel;
    }


    public String getIconoPrincipal() {
        return iconoPrincipal;
    }


    public void setIconoPrincipal(String iconoPrincipal) {
        this.iconoPrincipal = iconoPrincipal;
    }
    

    
}
