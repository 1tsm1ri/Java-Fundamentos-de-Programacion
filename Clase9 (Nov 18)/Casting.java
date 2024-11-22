// CLASE DE CASTING
public class Casting {

    public static void main(String args []) {
  
        long v1 = 5L;
        int v2 = 12;
        short v3 = 7;
        byte v4 = 1;

        // Conversion de variable de tipo Long a tipo Int
        v2 = (int)v1;
        System.out.println(v2);

        double v5 = 2.5;
        float v6 = 5.6f;

        // COnversion de variable float a double
        v6 = (float)v5;
        System.out.println(v6);

        // Metodo de la clase String
        String cadena = String.valueOf(v6);
        System.out.println(cadena);

        // Cambiar a tipo de dato primitivo
        String cadenaa = "6.7";
        float v7 = Float.parseFloat(cadenaa);
        System.out.println(v7);

    }
}

