package chatGpt;

import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner saludo = new Scanner(System.in);
        System.out.print("Ingrese su género (Masculino o Femenino): ");

        String genero = saludo.next();

        if(genero.equalsIgnoreCase("Masculino")){
            System.out.println("Buenos dias caballero");
        } else if (genero.equalsIgnoreCase("Femenino")) {
            System.out.println("Buenos dias señorita");
        } else {
            System.out.println("Buenos dias indeciso/a");
        }
    }
}