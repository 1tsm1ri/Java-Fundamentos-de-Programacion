/* Ejercicio:
"Calculadora de tarifas para un servicio de transporte"

En una ciudad, el servicio de transporte tiene una tarifa base 
y un cargo adicional dependiendo de la distancia recorrida. 
La tarifa cambia según la cantidad de kilómetros y el tipo de 
servicio solicitado.

Reglas:
    La tarifa base es $5.
    Si la distancia recorrida es menor o igual a 10 km, se agrega un cargo adicional de $2 por cada km recorrido.
    Si la distancia es mayor a 10 km pero menor o igual a 20 km, se agrega un cargo adicional de $1.5 por cada km.
    Si la distancia es mayor a 20 km, se agrega un cargo adicional de $1 por cada km.

Dependiendo del tipo de servicio, puede haber un cargo adicional:
    Si el servicio es "express", el cargo es $10 adicionales.
    Si el servicio es "regular", no hay cargo adicional.
    Si el servicio es "economico", el cargo es $5 adicionales.

El programa debe pedir al usuario que ingrese:
    La distancia recorrida en km.
    El tipo de servicio (puede ser "express", "regular", "economico").
    Calcular el precio total según las condiciones anteriores y mostrarlo por pantalla.

Requisitos:
    Usa un bucle para permitir que el usuario ingrese los datos múltiples veces
    (por ejemplo, hasta que decida salir).
    Utiliza switch para el tipo de servicio.
    Utiliza condicionales if para calcular el cargo adicional según la distancia.
    Usa variables para almacenar los resultados intermedios y el cálculo final. */

import java.util.Scanner;

public class Ejercicio {

    public static void main(String args[]) {

        Scanner calculadora = new Scanner(System.in);

        // Bucle para ingresar multiples datos
        char confirmacion = ' ';
        // Tarifas
        double tarifaBase = 5.0, tarifaExpress = 10.0, tarifaRegular = tarifaBase, tarifaEconomica = 5.0;

        System.out.println("Bienvenido al servicio de transporte");

        do {

            int tipoDeServicio = 0;
            double distanciaKilometros = 0.0, precioTotal = 0.0;

            // Pedida de informacion al usuario 
            System.out.println(" ");
            System.out.print("Por favor digite la distancia recorrida en km: ");
            distanciaKilometros = calculadora.nextDouble();

            if (distanciaKilometros > 0) {
                System.out.println(" ");
                System.out.println("1. Servicio Express");
                System.out.println("2. Servicio Regular");   
                System.out.println("3. Servicio Economico");
                System.out.print("Digite el numero de acuerdo al tipo de servicio solicitado: ");
            tipoDeServicio = calculadora.nextInt();
            } else {
                System.out.println("Solo es posible ingresar cantidades positivas");
                break;
            }

            // Switch case para TIPO DE SERVICIO
            switch (tipoDeServicio) {
                case 1:
                    precioTotal = tarifaBase + tarifaExpress;
                    break;
                case 2: 
                    precioTotal = tarifaBase + tarifaRegular;
                    break;
                case 3:
                    precioTotal = tarifaBase + tarifaEconomica;
                    break;
                default:
                    System.out.println("El dato ingresado no es valido");
            }

            // Cargo adicional en base a la distancia 
            if (distanciaKilometros <= 10.0) {
                precioTotal += 2.0 * distanciaKilometros;

            } else if (distanciaKilometros > 10.0 && distanciaKilometros <= 20.0) {
                precioTotal += 1.5 * distanciaKilometros;

            } else {
                precioTotal += 1.0 * distanciaKilometros;
            }


            System.out.println(" ");
            System.out.println("El precio total es de: " + precioTotal);

            System.out.println(" ");
            System.out.println("Desea ingresar nuevos datos?");
            System.out.println("Digite 's' para continuar");
            System.out.print("En su defecto digite otra letra: ");
            confirmacion = calculadora.next().charAt(0);
            
        } while (confirmacion == 's'|| confirmacion == 'S');

        calculadora.close();

        System.out.println(" ");
        System.out.println("Servicio finalizado");

    }
}