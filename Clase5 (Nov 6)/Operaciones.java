//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

// CLASE DE OPERACIONES
public class Operaciones {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        Scanner teclado = new Scanner(System.in);

        // Raiz cuadrada 
        System.out.print("Digite un numero para obtener la raiz cuadrada: ");
        double num = teclado.nextDouble();

        double raiz = Math.sqrt(num);
        System.out.println(raiz);

        // Potencia
        System.out.print("Digite el numero de la base de la potencia: ");
        double base = teclado.nextDouble();
        System.out.print("Digite el numero de la base de la potencia: ");
        double exponente = teclado.nextDouble();

        double potencia = Math.pow(base, exponente);
        System.out.println(potencia);

        // Numero al azar (random)        
        double azar = Math.random();
        System.out.println(azar);

    }
}
