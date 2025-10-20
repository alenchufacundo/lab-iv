package Punto4;

public class Panel {
    protected Texto texto;
    protected Botones botones;
    protected MarcoDeTexto marco;
    protected Scrollbar scrollbar;


    public Panel(Texto texto, Botones botones, MarcoDeTexto marco, Scrollbar scrollbar) {
        this.texto = texto;
        this.botones = botones;
        this.marco = marco;
        this.scrollbar = scrollbar;
    }


    public Texto getTexto() {
        return texto;
    }


    public void setTexto(Texto texto) {
        this.texto = texto;
    }


    public Botones getBotones() {
        return botones;
    }


    public void setBotones(Botones botones) {
        this.botones = botones;
    }


    public MarcoDeTexto getMarco() {
        return marco;
    }


    public void setMarco(MarcoDeTexto marco) {
        this.marco = marco;
    }


    public Scrollbar getScrollbar() {
        return scrollbar;
    }


    public void setScrollbar(Scrollbar scrollbar) {
        this.scrollbar = scrollbar;
    }
    
    
    
}
