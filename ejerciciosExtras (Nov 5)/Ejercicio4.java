/* EJERCICIO 4
Hacer un programa que le agregue el IVA 
a un precio digitado por teclado, el IVA será 
del 19% y luego devuelva el precio final 
con IVA por consola */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio4 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {
 
        Scanner precioIva = new Scanner(System.in);

        double precio, iva, precioFinal;

        System.out.print("Digite el precio de su producto: ");
        precio = precioIva.nextDouble();

        iva = precio * 0.19;
        precioFinal = precio + iva;

        System.out.println("El precio del final del producto con iva es: " + precioFinal);

    }
}