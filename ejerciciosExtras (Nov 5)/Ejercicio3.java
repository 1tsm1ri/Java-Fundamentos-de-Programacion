/*  EJERCICIO 3
Hacer un programa al que se le digite 
por teclado una cantidad de centímetros 
y lo devuelva a metros */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio3 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner longitud = new Scanner(System.in);

        double centimetro, metro;

        System.out.print("Digite la cantidad que desea pasar a metros: ");
        centimetro = longitud.nextDouble();

        metro = centimetro / 100;

        System.out.println("La cantidad que digito equivale a " + metro + " metro(s)");

    }
}