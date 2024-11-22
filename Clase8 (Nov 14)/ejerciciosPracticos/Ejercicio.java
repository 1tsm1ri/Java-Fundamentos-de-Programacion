/* EJERCICIO

Recorrer un Array Bidimensional usando un único for, no es válido usar otros bucles.
Se le debe pedir al usuario al principio el tamaño del array bidimensional preguntando 
la cantidad de filas y columnas que quiere, luego llenar el array bidimensional para 
luego imprimir en forma de tabla como se vio en clase

Tanto para llenar el array bidimensional como para recorrerlo se debe usar un solo for */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio {

    public static void main(String args[]) {

        // Array Bidimencional 
        int filas, columnas;

        Scanner array = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas de matriz: ");
        filas = array.nextInt();
        System.out.print("Ingrese el numero de columnas de matriz: ");
        columnas = array.nextInt();

        int matrix [][] = new int [filas][columnas];

        //Generador de numero aletorio para llenar la matriz
        Random numRandom = new Random();
        matrix[filas-1][columnas-1] = numRandom.nextInt(100) + 1;

        int j = 0;
        for (int i = 0; i < filas; i++) {     
            if (j < columnas) {
                System.out.print("[" + matrix[i][j] + "]");
                j++; // Incremento de j en 1 
                i--; // Decremento de i en 1
            } else {
                j = 0;
                System.out.println(" ");
            }
        }



    }

}
