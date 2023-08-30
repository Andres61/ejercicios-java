package Udemy;

import java.util.Scanner;

public class EstacionesDelAno {
    public static void main(String[] args) {
        Scanner estaciones = new Scanner(System.in);
        System.out.println("Ingrese numero de estaciones: ");
        int numeroEstacion =estaciones.nextInt();

        String nombreEstacion = null;

        switch (numeroEstacion){
            case 1:
                nombreEstacion = "Vereno";
                break;
            case 2:
                nombreEstacion = "Otono";
                break;
            case 3:
                nombreEstacion = "Invierno";
                break;
            case 4:
                nombreEstacion = "Primavera";
                break;
            default:
                System.out.println("El numero ingresado es incorreccto");
        }

        System.out.println("La estacion del año es: " + nombreEstacion);

    }
}
 /*
 | Número  | Estación  |
| :-----: | :-------- |
|    1    | Verano    |
|    2    | Otoño     |
|    3    | Invierno  |
|    4    | Primavera |
  */