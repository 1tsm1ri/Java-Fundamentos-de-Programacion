// CLASE DE OPERADORES
public class Operadores {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        boolean a, b, c, d, e, f, g, h, i;

        // Operadores relacionales
        a = 12 == 2;
        b = 2 != 2;
        c = 6 > 8;
        d = 8 < 9;
        e = 2 >= 1;
        f = 8 <= 9;
        // Operadores logicos
        g = !true;
        h = true && false;
        i = false || false;

        // Consola operadores relacionales
        System.out.println(a); // false
        System.out.println(b); // false
        System.out.println(c); // false
        System.out.println(d); // true
        System.out.println(e); // true
        System.out.println(f); // true
        // Consola operadores logicos
        System.out.println(g); // false
        System.out.println(h); // false
        System.out.println(i); // false

    }
}
