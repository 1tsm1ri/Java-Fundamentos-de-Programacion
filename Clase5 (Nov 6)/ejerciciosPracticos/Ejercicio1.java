/* PRIMER EJERCICIO
Comparacion de dos numeros: declare dos variables de 
tipo int con valores diferentes y luego imprima en 
consola el resultado de las siguientes comparaciones 
usando operadores relacionales:

    Si el primer número es mayor que el segundo.
    Si el primer número es igual al segundo.
    Si el primer número es menor que el segundo. */

public class Ejercicio1 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        boolean comparacion1, comparacion2, comparacion3;
        int primeraVariable = 4, segundaVariable = 7;

        // Operadores relacionales
        comparacion1 = primeraVariable > segundaVariable;
        comparacion2 = primeraVariable == segundaVariable;
        comparacion3 = primeraVariable < segundaVariable;

        // Consola
        System.out.println(comparacion1); 
        System.out.println(comparacion2); 
        System.out.println(comparacion3);

    }
}