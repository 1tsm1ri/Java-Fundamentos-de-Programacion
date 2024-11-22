/* TERCER EJERCICIO
Días de la Semana (switch)
Solicita al usuario un número del 1 al 7 e indica 
el día de la semana correspondiente. Usa switch.

Condiciones:
    1 para "Lunes", 2 para "Martes", y asi sucesivamente 
    hasta el domingo, 7 para "Domingo".
    Si el número está fuera del rango 1-7, 
    muestra "Día inválido". */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicio3 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner diasSemana = new Scanner(System.in);

        int dias;
        System.out.print("Ingrese un numero del 1 al 7: ");
        dias = diasSemana.nextInt();
        diasSemana.close();

        switch(dias) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}