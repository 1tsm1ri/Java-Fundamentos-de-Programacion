// CLASE DE BUCLES
public class Bucles {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // While
        int indice = 1;
        while (indice <= 10) { // Continua cuando se deje de cumplir la condicion
            System.out.println("While se ejecuto por #" + indice + " vez");
            indice++; // Indice por cada iteracion  se le suma 1
        }
        // Continua..

        //Do While
        int indice2 = 1;
        do { // Se ejecuta minimo una vez
            System.out.println("Hola" + indice2);
            indice2++;
        } while (indice2 <= 10); // Se repite unicamente si se cumple la condicion

        // For 
        // variable; condicion; incremento/decremento
        // Se ejecuta primero el incremento y luego se evalua la condicion
        for(int i = 0; i <= 10; i++) { 
            System.out.println("Hola " + i);
        }

        for(int x = 0; x <= 10; x++) { 
            System.out.println("Hola " + x);
            break; // Se rompe el bucle
        }

    }
}

