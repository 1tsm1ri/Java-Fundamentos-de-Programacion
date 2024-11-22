// CLASE MANIPULACION DE CADENAS
public class Manipulacion {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Total caracteres de la cadena
        String cadena = "Hola como estas? ";
        int caracteres = cadena.length();
        System.out.println("La cadena: " + cadena + " tiene " + caracteres + " caracteres");

        // Devuelve un char del indice
        String cadena2 = "Nintendo";
        char caracter = cadena2.charAt(5);
        System.out.println("El caracter #5 de la cadena " + cadena2 + " es: " + caracter);

        // Subcadena desde el indice hasta el final
        String cadena3 = cadena.substring(5);
        System.out.println(cadena3);

        // Subcadena de un indice a otro
        String cadena4 = cadena.substring(5, 9);
        System.out.println(cadena4);

        // MAYUSCULAS a minusuclas 
        String x = "HELLO WORLD";
        System.out.println(x.toLowerCase());

        // minusuclas a MAYUSCULAS
        String y = "hello world";
        System.out.println(x.toUpperCase());

        // Elimina espacios iniciales y finales
        String z = "  Hello world  ";
        System.out.println(z.length());
        System.out.println(z.trim().length());

        // Compara dos cadenas (sensible a mayusculas y minusculas)
        String cadena5 = "Hola";
        String cadena6 = "hola";
        System.out.println(cadena5.equals(cadena2));

        // Compara dos cadenas (ignora mayusculas y minusculas)
        System.out.println(cadena5.equalsIgnoreCase(cadena2));

        // Revisar contenido existente en cadena
        String cadena7 = "Hola como estas";
        System.out.println(cadena7.contains("estas"));

        // Reemplaza un char por otro
        System.out.println(cadena7.replace('o', 'a'));

        // Verifica si la cadena esta vacia
        String cadena8 = "";
        System.out.println(cadena8.isEmpty());

        // Pasa cualquier dato a tipo String
        String cadena9 = String.valueOf(2);
        System.out.println(cadena9);

    }
}