/* QUINTO EJERCICIO
Calculadora de Notas Finales
Diseña un programa que calcule la calificación final de un 
estudiante con base en sus notas de tres componentes: trabajos, 
exámenes y participación. Cada componente tiene un porcentaje 
de peso distinto en la nota final, y dependiendo del resultado, 
el programa muestra el estado del estudiante 
(Aprobado, Recuperación, o Reprobado).

Instrucciones:

Solicita al usuario ingresar tres notas:
    La nota de trabajos (peso del 30%).
    La nota de exámenes (peso del 50%).
    La nota de participación (peso del 20%).
    Calcula la nota final usando los pesos indicados:

notaFinal = (trabajos ∗ 0.3) + (examenes ∗ 0.5) + (participacion ∗ 0.2)

Dependiendo de la nota final, determina el estado del estudiante:
    Si la nota final es mayor o igual a 7, el estudiante está Aprobado.
    Si la nota final está entre 5 y 6.9, el estudiante está en Recuperación.
    Si la nota final es menor que 5, el estudiante está Reprobado.

Usa un switch para mostrar un mensaje de motivación dependiendo del estado:
    Aprobado: "¡Felicidades! Has aprobado el curso."
    Recuperación: "Tienes una oportunidad en la recuperación. ¡Estudia duro!"
    Reprobado: "Lo siento, has reprobado el curso."

Cabe aclarar que NO se le debe permitir al usuario que coloque notas 
superior a 10.0 o inferiores a 0, en caso de que esto suceda se debe 
finalizar la ejecución del programa */


//Importar Biblioteca/Libreria Scanner
import java.util.Scanner;

public class Ejercicioo5 {

    // Metodo main, inicio de ejecucion del codigo
    public static void main(String args []) {

        // Variable 
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Calculadora de nota final");

        boolean controlFlujo = true;
        double notaFinal ,notaTrabajo, notaExamen, notaParticipacion;
        String estadoNota = " ";        

        System.out.print("Ingrese la nota obtenida en los trabajos: ");
        notaTrabajo = calculadora.nextDouble();
    
        // Se pregunta el valor para saber si continuar o no mas adelante
        if (!(notaTrabajo < 0 || notaTrabajo > 10)) {
            System.out.print("Ingrese la nota obtenida en los examenes: ");
            notaExamen = calculadora.nextDouble();

            if (!(notaExamen < 0 || notaExamen > 10)) {
                System.out.print("Ingrese la nota obtenida por participacion: ");
                notaParticipacion = calculadora.nextDouble();

                if (!(notaParticipacion < 0 || notaParticipacion > 10)) {
                    controlFlujo = false; //Si esta variable es false es porque paso las 3 notas y se evita ejecutar el if final
                    calculadora.close(); //Cerrar el Scanner para liberar memoria
                    notaFinal = (notaTrabajo * 0.3) + (notaExamen * 0.5) + (notaParticipacion * 0.2);

                    if (notaFinal >= 7) {
                        estadoNota = "Aprobado";
                        System.out.println("El estudiante esta: " + estadoNota);
                    } else if (notaFinal >= 5 && notaFinal <= 6.9) {
                        estadoNota = "Recuperacion";
                        System.out.println("El estudiante esta en: " + estadoNota);
                    } else if (notaFinal < 5) {
                        estadoNota = "Reprobado";
                        System.out.println("El estudiante esta: " + estadoNota);
                    }


                    switch (estadoNota) {

                        case "Aprobado":
                            System.out.println("Felicidades! Has aprobado el curso.");
                            break;
                        case "Recuperacion":
                            System.out.println("Tienes una oportunidad en la recuperacion. Estudia duro!");
                            break;
                        case "Reprobado":
                            System.out.println("Lo siento, has reprobado el curso.");
                            break;
                        default:  
                    }
                }                
            }            
        }  
        
        //Solo se ejecuta si los valores digitados arriba son incorrectos
        if (controlFlujo) {

            calculadora.close(); //Cerrar el Scanner en el caso de que no se termino de leer arriba
            System.out.println("Ejecucion finalizada");
            System.out.println("Recuerde unicamente ingresar valores superiores a 0 e inferiores a 10");
        }
    }
}