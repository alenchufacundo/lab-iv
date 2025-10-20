package ar.utn.edu.tup.BancoSistema;

public enum TipoMovimiento {
    DEPOSITO ("D"),
    RETIRO ("R"),
    TRANSFERENCIA ("T");

    private final String descripcion;

    TipoMovimiento(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
