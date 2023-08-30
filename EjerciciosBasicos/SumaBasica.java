package EjerciciosBasicos;

import java.util.Scanner;

public class SumaBasica {
    public static void main(String[] args) {

        Scanner suma = new Scanner(System.in);

        System.out.println("Primer numero a sumar");
        int numero1 = suma.nextInt();

        System.out.println("Segundo numero a sumar");
        int numero2 = suma.nextInt();

        System.out.println("="+(numero1 + numero2));
    }
}
