package ar.utn.edu.tup.BancoSistema;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente extends Persona {
    private TipoPersona tipoPersona;
    private String banco;
    private LocalDate fechaAlta;
    private Set<Cuenta> Cuentas = new HashSet<>();


    public Cliente(String nombre, String apellido, int edad, int dni, String direccion, TipoPersona tipoPersona, String banco, LocalDate fechaAlta, Set<Cuenta> cuentas) {
        super(nombre, apellido, edad, dni, direccion);
        this.tipoPersona = tipoPersona;
        this.banco = banco;
        this.fechaAlta = fechaAlta;
        this.Cuentas = new HashSet<>(); // Inicializar el conjunto Cuentas
        if (cuentas != null) {
            this.Cuentas.addAll(cuentas);
        }
    }


    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Set<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void addCuenta(Cuenta cuenta){
        this.Cuentas.add(cuenta);
        cuenta.setTitular(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre='").append(getNombre()).append('\'');
        sb.append(", apellido='").append(getApellido()).append('\'');
        sb.append(", edad=").append(getEdad());
        sb.append(", dni=").append(getDni());
        sb.append(", direccion='").append(getDireccion()).append('\'');
        sb.append(", tipoPersona=").append(tipoPersona);
        sb.append(", banco='").append(banco).append('\'');
        sb.append(", fechaAlta=").append(fechaAlta);
        sb.append("}");
        return sb.toString();
    }

    public void bajaCliente(){
        for (Cuenta cuenta : Cuentas) {
            cuenta.setTitular(null); // Desvincular la cuenta del cliente
        }
        Cuentas.clear(); // Limpiar el conjunto de cuentas del cliente
    }
}
