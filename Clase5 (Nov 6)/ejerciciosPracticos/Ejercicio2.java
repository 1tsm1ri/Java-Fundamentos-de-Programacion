/* SEGUNDO EJERCICIO
Verificar si un número es positivo, negativo o cero: 
Define una variable de tipo int y utiliza operadores 
relacionales para verificar si el número es positivo, 
negativo o cero. Solo imprime el resultado usando los 
operadores adecuados, sin condicionales */

public class Ejercicio2 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        int num = 8;
        boolean positivo, negativo, cero;
        positivo = num > 0;
        negativo = num < 0;
        cero = num == 0;

        System.out.println("El numero es positivo?: " + positivo);
        System.out.println("El numero es negativo?: " + negativo);
        System.out.println("El numero es igual a cero?: " + cero);

    }
}