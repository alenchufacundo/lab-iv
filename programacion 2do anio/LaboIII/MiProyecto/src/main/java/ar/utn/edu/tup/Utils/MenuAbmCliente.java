package ar.utn.edu.tup.Utils;

public class MenuAbmCliente extends SetearPantalla{
    public void menuABM(){
        int opcion;

        do {
            //Ingresar en el menu para el ABM
            System.out.println("Menu ABM");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Modificar Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opcion: ");

            //Ingresar numero valido
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
                System.out.print("Ingresa una opcion: ");
            }

            opcion = scanner.nextInt();

            //Ejecutar opcion ingresada
            switch (opcion) {
                case 1:
                    System.out.println("Crear Cliente");
                    OperacionesCuentas nuevoCliente = new OperacionesCuentas();
                    nuevoCliente.altaCliente();
                    nuevoCliente.mostrarCliente();
                    break;
                case 2:
                    System.out.println("Modificar Cliente");
                    // Lógica para modificar cliente
                    break;
                case 3:
                    System.out.println("Eliminar Cliente");
                    // Lógica para eliminar cliente
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (opcion != 0);

    }

    public static void main(String[] args) {
        MenuAbmCliente menu = new MenuAbmCliente();
        menu.menuABM();
    }

}
