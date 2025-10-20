package ar.utn.edu.tup.Utils;
import ar.utn.edu.tup.BancoSistema.Cliente;
import ar.utn.edu.tup.BancoSistema.Cuenta;
import ar.utn.edu.tup.BancoSistema.TipoCuenta;
import ar.utn.edu.tup.BancoSistema.TipoPersona;

import java.time.LocalDate;
import java.util.Scanner;

public class OperacionesCuentas {
    Scanner sc = new Scanner(System.in);
    Cliente cliente = new Cliente(null,null,1,2,null,null,null,null,null);

    public void altaCliente(){

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = sc.nextLine();
        cliente.setNombre(nombre);

        System.out.println("Ingrese el apellido del cliente:");
        String apellido = sc.nextLine();
        cliente.setApellido(apellido);

        System.out.println("Ingrese la edad del cliente:");
        int edad = Integer.parseInt(sc.nextLine());
        cliente.setEdad(edad);

        System.out.println("Ingrese el dni del cliente:");
        int dni = Integer.parseInt(sc.nextLine());
        cliente.setDni(dni);

        System.out.println("Ingrese la direccion del cliente:");
        String direccion =sc.nextLine();
        cliente.setDireccion(direccion);

        System.out.println("Ingrese el tipo de persona Física(F) o Jurídica(J):");
        String tipoPersonaStr = sc.nextLine().toUpperCase();

        while (!tipoPersonaStr.equals("F") && !tipoPersonaStr.equals("J")) {
            System.out.println("Tipo de persona inválido. Ingrese NATURAL o JURIDICA:");
            tipoPersonaStr = sc.nextLine().toUpperCase();
        }
        TipoPersona tipoPersona = TipoPersona.fromString(tipoPersonaStr);
        cliente.setTipoPersona(tipoPersona);

        System.out.println("Ingrese el banco del cliente:");
        String banco = sc.nextLine();
        cliente.setBanco(banco);

        LocalDate fechaAlta = LocalDate.now();
        cliente.setFechaAlta(fechaAlta);

    }

    public void altaCuenta(){
        //Creacion de cuenta
        System.out.println("Ingrese el nombre de la cuenta:");
        String nombreCuenta = sc.nextLine();

        int balance = 0;

        LocalDate fechaCreacion = LocalDate.now();

        System.out.println("Ingrese el tipo de cuenta (CORRIENTE/AHORRO):");
        String tipoCuentaStr = sc.nextLine().toUpperCase();
        TipoCuenta tipoCuenta = TipoCuenta.valueOf(tipoCuentaStr);

        Cuenta cuenta = new Cuenta(nombreCuenta, balance, fechaCreacion, tipoCuenta);
        cliente.addCuenta(cuenta);
        System.out.println("Cliente dado de alta con exito!");
    }



    public void mostrarCliente(){
        System.out.println(cliente.toString());
    }
}


