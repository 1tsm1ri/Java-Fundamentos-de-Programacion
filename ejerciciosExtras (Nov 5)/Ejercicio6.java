/* EJERCICIO 6 
Hacer un programa que dados 3 números 
por teclado, devuelva el promedio de 
los mismos por consola */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio6 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner promedio = new Scanner(System.in);

        double primerNum, segundoNum, tercerNum, promedioFinal;

        System.out.println("Ingrese tres valores de los cuales desee obtener un promedio");

        System.out.print("Digite el primer numero: ");
        primerNum = promedio.nextDouble();
        System.out.print("DIgite el segundo numero: ");
        segundoNum = promedio.nextDouble();
        System.out.print("Digite el tercer numero: ");
        tercerNum = promedio.nextDouble();

        promedioFinal = (primerNum + segundoNum + tercerNum)/3;

        System.out.println("El promedio de los valores digitados es: " + promedioFinal);

    }
}