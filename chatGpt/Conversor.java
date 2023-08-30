package chatGpt;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        EXTERNA:
        while (true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println(" 1 - Pesos Colombianos a dolares \n"
            + " 2 - Pesos Mexicanos a dolares \n"
            + " 3 - Soles Peruanos a dolares \n"
            + " 4 - Salir");
            System.out.println("INGRESE UNA OPCION: ");
            Scanner moneda = new Scanner(System.in);
            char opcion = moneda.next().charAt(0);

            switch (opcion){
                case '1':
                    convertir(4479.54, "Pesos Colombiamos");
                    break;
                case '2':
                    convertir(18.05, "Pesos Mexicanos");
                    break;
                case '3':
                    convertir(3.79, "Soles Peruanos");
                    break;
                case '4':
                    System.out.println("CERRANDO PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        }
    }

    static void convertir(double valor_Dolar, String pais){
        Scanner moneda = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", pais);
        double cantidad_Moneda = moneda.nextDouble();
        double dolares = cantidad_Moneda/ valor_Dolar;
        dolares = (double) Math.round(dolares * 100d)/100;

        System.out.println("_______________________________");
        System.out.println("|   Tienes $" + dolares + "Dolares   |");
        System.out.println("_______________________________");
    }
}
