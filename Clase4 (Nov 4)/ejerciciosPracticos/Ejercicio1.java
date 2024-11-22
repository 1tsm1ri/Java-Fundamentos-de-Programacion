/* PRIMER EJERCICIO
Realizar un programa que le pida al usuario por teclado 
el año de nacimiento, y que luego muestre por consola 
la edad que tiene el usuario actualmente */

//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String args []) {

        // Variable 
        Scanner nacimiento = new Scanner(System.in);

        System.out.print("Por favor digite su anio de nacimiento: ");
        int anioNacimiento = nacimiento.nextInt();

        anioNacimiento = 2024 - anioNacimiento;

        System.out.println("Usted tiene: " + anioNacimiento + " anios");

    }
}