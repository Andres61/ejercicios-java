package EjerciciosBasicos;

import java.util.Scanner;

public class positivoNegativoCero{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        int numeros = numero.nextInt();

        if (numeros == 0)
        {
            System.out.println("El numero es Cero");
        } else if (numeros >= 1 )
        {
            System.out.println("El numero es positivo");
        }else {
            System.out.println("el numero es negativo");
        }
    }
}


