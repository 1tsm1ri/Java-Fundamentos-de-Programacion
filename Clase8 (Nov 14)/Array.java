
//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

// CLASE DE ARRAYS
public class Array {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Arrays
        int cajita []; // Declaracion de array
        cajita = new int[5]; // Inicializando espacios del array
        cajita [0] = 7;
        cajita [1] = 2;
        cajita [2] = 6;
        cajita [3] = 5;
        cajita [4] = 1;
        System.out.println(cajita[2]);


        String personas [] = new String [5];
        personas[0] = "Carlos";
        personas[1] = "David";
        personas[2] = "Leonardo";
        personas[3] = "Yesica";
        personas[4] = "Paola";
        System.out.println(personas[1]);

        for (int i = 0; i < 5; i++) {
            System.out.println(personas[i]);
        }

        System.out.println(" ");

        // - - - - - - - - - - - - - - 

        Scanner arrays = new Scanner(System.in);

        System.out.print("Digite la cantidad de personas que quiere guardar: ");
        int x = arrays.nextInt();

        String personas2[] = new String[x];


        for (int i = 0; i < x; i++) {
            arrays = new Scanner(System.in);

            System.out.print("Digite su nombre #" + (i + 1) + ": ");
            personas[i] = arrays.nextLine();
        }


        for (int i = 0; i < x; i++) {
            System.out.println(personas[i]);
        }

        System.out.println(" ");

        // - - - - - - - - - - - - - - 

        int y [] = {2, 5, 7, 8, 10};

        for (int i = 0; i < 5; i++) {
            System.out.println(y[i]);
        }

        System.out.println(" ");

        // ARRAYS BIDIMENCIONALES (Matrices)
        int matrix [][] = new int [2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        for (int i = 0; i < 2; i++) { // For i
            for (int j = 0; j < 2; j++) { // For j
                System.out.println(matrix[i][j]);
            }
        }

        System.out.println(" ");

        // - - - - - - - - - - - - - - 

        int z [][] = {{1, 2, 3},{4,5,6},{7,8,9}}; // new int [3][3];

        int filas = z.length;// Filas de la matriz
        int columnas = z[0].length; // Columnas de la matriz

        for (int i = 0; i < filas; i++) { // For i = Filas 
            for (int j = 1; j < columnas; j++) { // For j = Columnas 
                System.out.println("[" + i + "][" + j + "] = " + z[i][j]);
            }
        }

        System.out.println(" ");

        // - - - - - - - - - - - - - -

        int m [][] = {{1, 2, 3},{4,5,6},{7,8,9}}; // new int [3][3];

        int filas2 = m.length;// Filas de la matriz
        int columnas2 = m[0].length; // Columnas de la matriz

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.println("[" + i + "][" + j + "] =" + m[i][j]);
            }
        }

        System.out.println(" ");

        for (int i = 0; i < filas2; i++) { // For i = filas 
            for (int j = 0; j < columnas2; j++) { // For j = columnas 
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        // - - - - - - - - - - - - - -

        int a [][] = {{1, 2, 3},{4,5,6}}; // new int [2][3]

    }
}

