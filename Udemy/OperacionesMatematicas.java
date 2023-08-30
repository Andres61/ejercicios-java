package Udemy;
/*
Enunciado: Dado dos números enteros y un operador +, −, * y /,
devolver la operación de los dos números según el operador ingresado,
considere que si el segundo número es cero y el operador es /,
no es divisible con el primer número, entonces devolver como resultado 0.
Análisis: Para la solución de este problema, se requiere que el usuario
ingrese un operador y dos números y el sistema verifica que operación debe
realizar y devuelve el resultado de la operación.
 */

import java.util.Scanner;

public class OperacionesMatematicas {

    public static void main(String[] args) {

        int num1, num2, resultado;
        resultado = 0;
        String operador;

        Scanner operaciones = new Scanner(System.in);

        System.out.println("Operador");
        operador = operaciones.next();

        System.out.println("Primer numero: ");
        num1 = operaciones.nextInt();

        System.out.println("Segundo numero: ");
        num2 = operaciones.nextInt();

        switch (operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if(num2 != 0){
                    resultado = num1 / num2;
                }else{
                    resultado = 0;
                }
                break;
            default:
                System.out.println("Error en la operacionm");
        }
        System.out.println("");
        System.out.println("El resultado es: " + resultado);

    }
}
