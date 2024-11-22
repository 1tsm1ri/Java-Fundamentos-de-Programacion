/* QUINTO EJERCICIO
Operador lógico OR: Crea dos variables de tipo 
boolean y usa el operador lógico || (OR) para 
comprobar si al menos una de las dos es verdadera. 
Imprime el resultado de la operación */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio5 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        boolean bool1 = false, bool2 = true;
        boolean comprobacion = bool1 || bool2;

        System.out.println("Ambas variables son verdaderas?: " + comprobacion);

    }
}