/* EJERCICIO 1
Hacer un programa en el que el usuario 
digite su año de nacimiento y devuelve por 
consola la edad que tendrá el año que viene */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio1 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner edad = new Scanner(System.in);

        int anioNacimiento;

        // Pedida de datos al usuario
        System.out.print("Por favor digite su anio de nacimiento: ");
        anioNacimiento = edad.nextInt();

        // Operaciones + impresion por consola
        int edadProxAnio = 2025 - anioNacimiento;
        System.out.println("Usted tendra " + edadProxAnio + " anios el proximo anio");

    }
}