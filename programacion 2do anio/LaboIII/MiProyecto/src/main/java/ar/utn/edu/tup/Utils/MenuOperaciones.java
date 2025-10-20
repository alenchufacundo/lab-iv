package ar.utn.edu.tup.Utils;
import java.util.*;
public class MenuOperaciones {

    public void menuOperaciones(){
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            //Ingresar en el menu para operar
            System.out.println("Menu Operaciones");
            System.out.println("1. Deposito");
            System.out.println("2. Retirar");
            System.out.println("3. Consulta de saldo");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opcion: ");

            //Ingresar numero valido
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
                System.out.print("Ingresa una opcion: ");
            }

            op = scanner.nextInt();

            //Ejecutar opcion ingresada
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (op != 0);
    }

    public static void main(String[] args) {
        MenuOperaciones moo = new MenuOperaciones();
        moo.menuOperaciones();
    }
}
