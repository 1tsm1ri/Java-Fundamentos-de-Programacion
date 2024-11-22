/* EJERCICIO 5
Cálculo de velocidad Pide al usuario que 
ingrese una distancia en metros y un tiempo 
en segundos, luego calcula la velocidad usando 
la fórmula velocidad = distancia / tiempo */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio5 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner velocidad = new Scanner(System.in);

        double distancia, tiempo, velocidadFinal;

        System.out.print("Digite la distancia en metros: ");
        distancia = velocidad.nextDouble();
        System.out.print("Digite el tiempo en segundos: ");
        tiempo = velocidad.nextDouble();

        velocidadFinal = distancia / tiempo;

        System.out.println("La velocidad a la que usted se encuentra es: " + velocidadFinal + "m/s");

    }
}