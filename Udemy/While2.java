package Udemy;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        int inicio, salida, a, total = 0;

        Scanner numEnteros = new Scanner(System.in);

        System.out.println("Numeno inicial");
        inicio = numEnteros.nextInt();

        System.out.println("Finalizacion del numero");
        salida = numEnteros.nextInt();

        a = inicio + 1;
        while (a < salida){
            total += 1;
            a++;
        }
        System.out.println("");
        System.out.println("el total es : " + total);
    }
}
