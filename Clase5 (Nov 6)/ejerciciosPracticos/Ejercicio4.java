/* CUARTO EJERCICIO
 Operador lógico AND: Crea dos variables de 
 tipo boolean y usa el operador lógico && (AND) 
 para comprobar si ambas son verdaderas. Imprime 
 el resultado de la operación */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio4 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        boolean bool1 = true, bool2 = true;
        boolean comprobacion = bool1 && bool2;

        System.out.println("Ambas variables son verdaderas?: " + comprobacion);

    }
}