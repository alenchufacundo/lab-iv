package ar.utn.edu.tup.BancoSistema;

public enum TipoCuenta {
    CORRIENTE("C.C"),
    AHORRO ("C.A");

    private final String descripcion;

    TipoCuenta(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
