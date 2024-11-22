// CLASE DE CADENAS
public class Cadenas {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable de tipo CHAR, almacena un caractar
        char c = 'X';

        // Instancia de String
        // Instancia = Variable
        String cadena = "Hello World";
        System.out.println(cadena + ", 2024");

        String cadena1 = "Hello World";
        String cadena2 = ", 2024";
        String cadenaa = cadena1 + cadena2;
        System.out.println(cadenaa);

        // NO FUNCIONA, evalua  la refenrencia en memoria
        // Cada valor que se almacena es unico
        boolean x = cadena1 == cadena2;
        System.out.println("Resultado: " + x);
        // Para verificar si la cadena es igual, se realiza:
        boolean y = cadena1.equals(cadena2);
        System.out.println("Resultado: " + y);
    }
}

