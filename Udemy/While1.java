package Udemy;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        int a, num, suma = 0;
        a = 1;

        Scanner sumar = new Scanner(System.in);

        System.out.println("Numero: ");
        num = sumar.nextInt();

        while (a <= num){
            suma = suma + a;
            a++;
        }
        System.out.println("");
        System.out.println("Suma: " + suma);
    }
}
