package Udemy;

import java.util.Scanner;

/*
Enunciado: Dado un número entero de un dígito (0 al 9),
devolver el número en letras.
Análisis: Para la solución de este problema, se requiere que el usuario ingrese
un número entero y el sistema verifica y devuelve el número en letras.
 */
public class NumALetras {
    public static void main(String[] args) {
        Scanner numerosALetras = new Scanner(System.in);
        System.out.println("SOLO UN DIGITO ENTRE 0 Y 9");
        System.out.println("Ingrese el numero a convertir: ");
        int numero = numerosALetras.nextInt();

        String letrasNum = null;

        switch (numero){
            case 0:
                letrasNum = "CERO";
                break;
            case 1:
                letrasNum = "UNO";
                break;
            case 2:
                letrasNum = "DOS";
                break;
            case 3:
                letrasNum = "TRES";
                break;
            case 4:
                letrasNum = "CUATRO";
                break;
            case 5:
                letrasNum = "CINCO";
                break;
            case 6:
                letrasNum = "SEIS";
                break;
            case 7:
                letrasNum = "SIETE";
                break;
            case 8:
                letrasNum = "OCHO";
            case 9:
                letrasNum = "NUEVE";
                break;
            default:
                letrasNum = "ERROR ";
        }
        System.out.println("El numero en letras es: " + letrasNum);
    }
}
