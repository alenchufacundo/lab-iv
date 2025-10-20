package ar.utn.edu.tup.Utils;
import java.util.Scanner;
public class SetearPantalla{
    protected Scanner scanner = new Scanner(System.in);


    protected static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
