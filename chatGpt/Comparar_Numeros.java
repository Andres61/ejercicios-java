package chatGpt;

import java.util.Scanner;

public class Comparar_Numeros {
    public static void main(String[] args) {
        Scanner compararN = new Scanner(System.in);
        System.out.print("Primer numero a comprar");
        int num1 = compararN.nextInt();

        System.out.print("Segundo numero a comprar");
        int num2 = compararN.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " Mayor que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " Mayor que " + num1);
        }else
            System.out.println("Los numeros son iguales");
        {

        }
    }
}
