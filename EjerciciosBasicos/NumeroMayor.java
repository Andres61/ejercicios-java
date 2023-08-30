package EjerciciosBasicos;
//Pedir al usuario dos números y mostrar por pantalla el mayor de ellos.
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner mayor = new Scanner(System.in);

        System.out.println("Escribe los numeros");
        int num1 = mayor.nextInt();
        int num2 = mayor.nextInt();

        if (num1 >= num2)
        {
            System.out.println("Numero " + num1 + " mayor que " + num2 + "!!!");
        } else if (num2 >= num1)
        {
            System.out.println("Numero " + num2 + " mayor que " + num1 + " !!!");
        }
        else{
            System.out.println("Solo ingresa numero por teclado numerico");
        }
    }
}

