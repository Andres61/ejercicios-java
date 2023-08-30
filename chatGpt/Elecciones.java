package chatGpt;

import java.util.Scanner;

public class Elecciones {
    public static void main(String[] args) {
        Scanner elecciones = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = elecciones.nextInt();

        if (edad >= 18){
            System.out.println("Puede votar");
        }else
            System.out.println("No puedes votar");
    }
}
