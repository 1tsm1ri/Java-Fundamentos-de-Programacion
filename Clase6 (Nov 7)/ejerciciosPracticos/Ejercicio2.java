/* SEGUNDO EJERCICIO
Clasificación de Calificación
Solicita al usuario una calificación (de 0 a 10) e 
indica el nivel correspondiente. Usa if y else if.

Condiciones:
    Si la calificación está entre 9 y 10, muestra "Excelente".
    Si está entre 7 y 8, muestra "Bueno".
    Si está entre 5 y 6, muestra "Regular".
    Si está entre 0 y 4, muestra "Insuficiente".
    Si la calificación está fuera del rango 0-10, 
    muestra "Calificación inválida". */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio2 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner evaluacion = new Scanner(System.in);

        int calificacion;
        System.out.print("Digite su calificacion: ");
        calificacion = evaluacion.nextInt();
        evaluacion.close();

        if (calificacion == 9 || calificacion == 10) {
            System.out.println("Calificacion EXCELENTE");
        } else if (calificacion == 7 || calificacion == 8) {
            System.out.println("Calificacion BUENO");
        } else if (calificacion == 5 || calificacion == 6) {
            System.out.println("Calificacion REGULAR");
        } else if (calificacion >= 0 && calificacion <= 4) {
            System.out.println("Calificacion INSUFICIENTE");
        } else {
            System.out.println("Calificacion INVALIDA");
            System.out.println("Por favor ingrese valores entre 0 y 10");
        }

    }
}