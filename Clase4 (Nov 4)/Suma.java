//Importacion de la clase Scanner
import java.util.Scanner;

// CLASE DE SUMA
public class Suma {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);

        int valorUno, valorDos, resultado;

        System.out.print("Digite el primer valor: ");
        valorUno = teclado.nextInt();

        System.out.print("Digite el segundo valor: ");
        valorDos = teclado.nextInt();

        resultado = valorUno + valorDos;

        System.out.println(valorUno + " + " + valorDos + " = " + resultado);
        System.out.println("El resultado de la suma es: " + resultado);


    }
}