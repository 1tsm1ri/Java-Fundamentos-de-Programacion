/* EJERCICIO 2
Hacer un programa que dada la altura y 
la base de un triangulo por teclado calcule 
el área del mismo y lo devuelva por consola */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio2 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner areaTriangulo = new Scanner(System.in);

        int altura, base, area;

        System.out.print("Digite la base de su triangulo: ");
        base = areaTriangulo.nextInt();

        System.out.print("Digite la altura de su triangulo: ");
        altura = areaTriangulo.nextInt();

        area = (base * altura)/2;

        System.out.println("El area de su triangulo es: " + area);

    }
}