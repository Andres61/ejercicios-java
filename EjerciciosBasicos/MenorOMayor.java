package EjerciciosBasicos;

import java.util.Scanner;

public class MenorOMayor {
    public static void main(String[] args) {

        Scanner year = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = year.nextInt();

        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }
}
