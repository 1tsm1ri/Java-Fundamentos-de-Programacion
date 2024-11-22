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

        teclado = new Scanner(System.in);

        System.out.print("Digita tus apellidos: ");
        String apellidos = teclado.nextLine();

        teclado = new Scanner(System.in);

        System.out.print("Digita tu profesion: ");
        String profesion = teclado.nextLine();

        teclado = new Scanner(System.in);

        System.out.print("Digita tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Hola " + nombre + " " + apellidos + ", tu edad es de " + edad + " anios y te dedicas a " + profesion);

        teclado.close();

    }
}