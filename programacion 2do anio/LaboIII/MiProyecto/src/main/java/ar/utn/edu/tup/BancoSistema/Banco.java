package ar.utn.edu.tup.BancoSistema;

import java.util.List;

public class Banco {
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void aregarClienteBanco(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void eliminarClienteBanco(Cliente cliente) {
        this.clientes.remove(cliente);
    }


}
