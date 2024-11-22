/* EJERCICIO 8
Hacer un conversor de horas a minutos */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio8 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner conversor = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Conversor de horas a minutos");

        System.out.print("Por favor digite la cantidad de horas que desea transformar: ");
        horas = conversor.nextInt();

        minutos = horas * 60;

        System.out.println(horas + "h en minutos es: " + minutos + "min");

    }
}