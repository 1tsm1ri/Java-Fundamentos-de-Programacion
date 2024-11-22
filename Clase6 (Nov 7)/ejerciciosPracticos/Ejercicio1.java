/* PRIMER EJERCICIO
Edad y Rango de Vida
Solicita al usuario su edad y determina en qué etapa de la 
vida se encuentra. Usa if y else anidados. 

Condiciones:
    Si la edad está entre 0 y 12, muestra "Infancia".
    Si la edad está entre 13 y 17, muestra "Adolescencia".
    Si la edad está entre 18 y 64, muestra "Adultez".
    Si la edad es mayor o igual a 65, muestra "Vejez".
    Si la edad es negativa, muestra "Edad inválida". */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio1 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner rango = new Scanner(System.in);

        int edad;
        System.out.print("Por favor digite su edad: ");
        edad = rango.nextInt();
        rango.close();

        if (edad < 0) {
            System.out.println("Edad Invalida");
        } else if (edad >= 0 && edad <= 12) {
            System.out.println("Infancia");
        } else if ( edad >= 13 && edad <= 17) {
            System.out.println("Adolescencia");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Adultez");
        } else if (edad >= 65) {
            System.out.println("Vejez");
        } 

    }
}