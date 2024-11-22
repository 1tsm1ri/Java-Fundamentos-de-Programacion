/* TERCER EJERCICIO
Realizar un programa el cual le pida los siguientes datos personales a un usuario:
    Nombre, Apellido, Edad, Email, 
    Numero de teléfono, Dirección, Pais

Y lo muestre por consola siguiendo el siguiente formato:
    NOMBRE: X
    APELLIDO: X
    EDAD: X
    EMAIL: X
    TELEFONO: X
    DIRECCION: X
    PAIS: X */



//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String args []) {

        // Variable 
        Scanner datos = new Scanner(System.in);

        // PEDIDA DE DATOS
        System.out.println("A continucion le pediremos algunos datos");
        // Nombre
        System.out.print("Digite su nombre: ");
        String nombre = datos.next();
        // Apellido
        System.out.print("Digite su apellido: ");
        String apellido = datos.next();
        // Edad
        System.out.print("Digite su edad: ");
        String edad = datos.next();
        // Mail
        System.out.print("Digite su correo electronico: ");
        String email = datos.next();
        // Numero tell
        System.out.print("Digite su numero de telefono: ");
        String numTel = datos.next();
        // Dirección 
        System.out.print("Digite su direccion: ");
        String direccion = datos.next();
        // Pais
        System.out.print("Digite su pais de residencia: ");
        String pais = datos.next();

        System.out.println(" ");

        // MOSTRAR EN CONSOLA
        System.out.println("- NOMBRE: " + nombre);
        System.out.println("- APELLIDOS: " + apellido);
        System.out.println("- EDAD: " + edad);
        System.out.println("- EMAIL: " + email);
        System.out.println("- TELEFONO: " + numTel);
        System.out.println("- DIRECCION: " + direccion);
        System.out.println("- PAIS: " + pais);

    }
}