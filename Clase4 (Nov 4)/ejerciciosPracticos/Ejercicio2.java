/* SEGUNDO EJERCICIO
Realizar un programa que pedidos dos números 
por teclado, realice una multiplicación, luego 
que muestre el resultado por consola */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String args []) {

        // Variable 
        Scanner numeros = new Scanner(System.in);

        System.out.println("Elija dos numeros a multiplicar");
        System.out.println("Estos pueden contener valores decimales");
        System.out.println("En caso de hacer uso de estos, utilice una coma");

        System.out.println(" ");

        System.out.print("Por favor ingrese el primer numero: ");
        double primerNumero = numeros.nextDouble();

        System.out.print("Por favor ingrese el segundo numero: ");
        double segundoNumero = numeros.nextDouble();

        double resultado = primerNumero * segundoNumero;

        System.out.println("El resultado de la multiplicacion de: " + primerNumero + " x " + segundoNumero + " es " + resultado);

    }
}