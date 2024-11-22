/* EJERCICIO 10
Resta y producto de tres números pide al usuario 
que ingrese tres números enteros, luego muestra el 
resultado de restar el segundo del primero y, después, 
multiplicar el resultado por el tercer número */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio10 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner operaciones = new Scanner(System.in);

        int primerNum, segundoNum, tercerNum, restaResultado, multiplicacion;

        System.out.println("Por favor, a continuacion digite tres numeros enteros");

        System.out.print("Digite el primer numero: ");
        primerNum = operaciones.nextInt();
        System.out.print("Digite el segundo numero: ");
        segundoNum = operaciones.nextInt();
        System.out.print("Digite el tercer numero: ");
        tercerNum = operaciones.nextInt();

        restaResultado = primerNum - segundoNum;
        multiplicacion = restaResultado * tercerNum;

        System.out.println("Al restar el segundo numero del primero obtenemos: " + restaResultado);
        System.out.println("Al multiplicar este resultado con el tercer numero obtenemos: " + multiplicacion);

    }
}