public class Condicionales {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        //CONDICIONAL SIN ANIDAR
        // Condicional "if" 
        int x = 6;

        if (x == 6) {
            System.out.println("La condicion es cierta");
        }

        // Condicional "if else"
        if (x == 6){
            System.out.println("La condicion es cierta");
        } else {
            System.out.println("La condicion es falsa");
        }

        String ls = "Hola";
        if (ls.equals("Hola")){
            System.out.println("La condicion es cierta");
        }

        // CONDICIONALES ANIDADOS
        if (x == 7) {
            System.out.println("Se cumplio la condicion del if");
        } else if (x == 6) {
            System.out.println("Se cumplio la condicion del else if");   
        } else {
            System.out.println("Nunguna condicion se cumplio");
        } // puede continuar..

        switch (x) {
            case 1:
                System.out.println("Se cumplio el case 1");
                break;
            case 5:
                System.out.println("Se cumplio el case 5");
                break;
            case 6:
                System.out.println("Se cumplio el case 6");
                break;
            default:
                System.out.println("No se cumplio ningun case");
        }
        
        String y = "Mariana";

        switch (y) {
            case "Mariana":
                System.out.println("Se cumplio el case Mariana");
                break;
            case "Felipe":
                System.out.println("Se cumplio el case Felipe");
                break;
            case "David":
                System.out.println("Se cumplio el case David");
                break;
            default:
                System.out.println("No se cumplio ningun case");
        }
    }
}