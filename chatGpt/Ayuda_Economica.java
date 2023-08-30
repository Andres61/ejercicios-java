package chatGpt;

import java.util.Scanner;

public class Ayuda_Economica {
    public static void main(String[] args) {

        Scanner escribe = new Scanner(System.in);

        String estado = null;

        System.out.println("Numero de hijos cargo: ");
        int cantidadHijos = escribe.nextInt();
        System.out.println("===========================");

        System.out.print("Eliga el numero de la opcion por la cual desea realizar la solicitud de ayuda\n" +
                "1. Es cabeza de hogar\n" +
                "2. Es desempleado\n" +
                "3. Es discapacitado\n" +
                "4. Tiene bajos ingresos\n");
       estado = escribe.next();
        System.out.println("=======================");


        switch (cantidadHijos){
            case 1:
                estado = " Cabeza de Hogar" + "Aplica a una ayuda por $500.000";
                break;
            case 2:
                estado = " Desempleado: " + "Aplica para una ayuda de $350.000";
                break;
            case 3:
                estado = " Discapacitado: " + "Aplica para una ayuda de $600.000";
                break;
            case 4:
                estado = " Bajos ingresos: " + "Aplica para un mercado de $250.000";
                break;
            default:
                System.out.println("No aplica para el auxilio economico");
                return;
        }
        System.out.println("La opcion que eligo es" + estado);



        }

    }

