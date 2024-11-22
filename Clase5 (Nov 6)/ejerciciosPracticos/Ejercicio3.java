/* TERCER EJERCICIO
Comprobación de igualdad de tres valores: Declara 
tres variables de tipo int y usa operadores relacionales 
para comprobar si todas son iguales entre sí. Imprime 
los resultados de las comparaciones */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio3 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        int primeraVariable = 4, segundaVariable = 7, terceraVariable = 25;
        boolean comparacion;

        comparacion = primeraVariable == segundaVariable && segundaVariable == terceraVariable;

        System.out.println("Las variables tienen el mismo valor?: " + comparacion);


    }
}