// CLASE DE OPERACIONES
public class Operaciones {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Enteros
        long v1 = 1L;
        int v2 = 2;
        short v3 = 5;
        byte v4 = 8;
        /* Se puede almacenar una variable en otra
        mientras donde se almecene tenga el mayor espacio*/
        v1 = v1 + v2;
        System.out.println(v1);

        // Decimales
        double v5 = 1.2;
        float v6 = 9.2f;
        /* Se puede guardar una variable entera en una variable decimal,
        pero no se puede al revez, debido a que se pierde la parte decimal */
        v5 = v5 + v2;
        System.out.println(v5);

        // Area triangulo
        int base = 5;
        int altura = 2;
        int areaTriangulo = (base * altura)/2;
        System.out.println("Area del triangulo: " + areaTriangulo);

        // Operaciones con booleanos
        // Igualdad --> ==  | Signacion de un valor --> =
        boolean x = 2 == 2;

    }
}