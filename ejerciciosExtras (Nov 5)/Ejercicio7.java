/*  EJERCICIO 7
Hacer un conversor de grados Celsius 
a Fahrenheit [FORMULA:    F = C * (9/5) + 32] 
F = Fahrenheit y C = Celsius */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio7 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner conversor = new Scanner(System.in);

        double gradosC, gradosF;

        System.out.println("Conversor de grados Celsius a Fahrenheit");

        System.out.print("Digite la temperatura en Celsius: ");
        gradosC = conversor.nextDouble();

        gradosF = (gradosC * 9/5) + 32;

        System.out.println(gradosC + "C en Fahrenheit es: " + gradosF);

    }
}