/* CUARTO EJERCICIO
Clasificación de Triángulo
Solicita tres números enteros que representen los lados 
de un triángulo e indica qué tipo de triángulo es 
(equilátero, isósceles o escaleno). Usa if anidado.

Condiciones:
    Si los tres lados son iguales, muestra "Triángulo equilátero".
    Si dos lados son iguales, muestra "Triángulo isósceles".
    Si todos los lados son diferentes, muestra "Triángulo escaleno".
    Si algún lado es menor o igual a 0, muestra "Valores inválidos" */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio4 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner triangulo = new Scanner(System.in);

        int ladoUno, ladoDos, ladoTres;
        System.out.print("Digite el valor del primer lado del triangulo: ");
        ladoUno = triangulo.nextInt();
        System.out.print("Digite el valor del segundo lado del triangulo: ");
        ladoDos = triangulo.nextInt();
        System.out.print("Digite el valor del tercer lado del triangulo: ");
        ladoTres = triangulo.nextInt();
        triangulo.close();

        // Valores invalidos
        if (ladoUno <= 0 || ladoDos <= 0 || ladoTres <= 0) {
            System.out.println("Valores invalidos");
        // Tres lados iguales (equilatero)
        } else if (ladoUno == ladoDos && ladoDos == ladoTres) {
            System.out.println("Triangulo equilatero");
        // Lados desiguales (escaleno)
        } else if (ladoUno != ladoDos && ladoDos != ladoTres && ladoTres != ladoUno) {
            System.out.println("Triangulo escaleno");
        // Dos lados iguales (isosceles)
        } else {
            System.out.println("Triangulo isosceles");
        }
    }
}