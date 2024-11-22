//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

// CLASE DE TECLADO
public class Teclado {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digita tu nombre: ");
        String nombre = teclado.next();

        System.out.print("Digita tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + ", tu edad es de " + edad + " anios");

    }
}