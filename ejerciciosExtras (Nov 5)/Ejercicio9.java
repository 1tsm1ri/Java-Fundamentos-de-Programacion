/* EJERCICIO 9
Hacer una calculadora de densidad, el digita 
la masa y el volumen de un objeto y se calcula 
la densidad con la siguiente formula 
[FORMULA: d = (m/v)] d = densidad, m = masa, v = volumen */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio9 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner calculadora = new Scanner(System.in);

        int densidad, masa, volumen;

        System.out.println("Calculadora de densidad");

        System.out.print("Digite la masa de su objeto: ");
        masa = calculadora.nextInt();
        System.out.print("Digite el volumen de su objeto: ");
        volumen = calculadora.nextInt();

        densidad = masa / volumen;

        System.out.println("La densidad de su objeto es: " + densidad);

    }
}