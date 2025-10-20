package ar.utn.edu.tup.BancoSistema;

import java.time.LocalDate;

public class Cuenta{
    private String nombreCuenta;
    private int balance;
    private LocalDate fechaCreacion;
    private TipoCuenta tipoCuenta;
    private Cliente titular;

    public Cuenta(String nombreCuenta, int balance, LocalDate fechaCreacion, TipoCuenta tipoCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.balance = balance;
        this.fechaCreacion = fechaCreacion;
        this.tipoCuenta = tipoCuenta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombre(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuentas={");
        for (Cuenta cuenta : titular.getCuentas()) {
            sb.append("{nombre='").append(cuenta.getNombreCuenta()).append('\'');
            sb.append(", balance=").append(cuenta.getBalance());
            sb.append(", fechaCreacion=").append(cuenta.getFechaCreacion());
            sb.append(", tipoCuenta=").append(cuenta.getTipoCuenta()).append("}");
        }
        sb.append("]}");
        return sb.toString();
    }

}
