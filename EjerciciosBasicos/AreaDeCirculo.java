
package EjerciciosBasicos;

import java.util.Scanner;

public class AreaDeCirculo {
    public static void main(String[] args) {

        //Pedir al usuario el radio de un círculo y mostrar por pantalla su área.

        Scanner circulo = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo\n");
        double radio = circulo.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es " + area);
    }
}
