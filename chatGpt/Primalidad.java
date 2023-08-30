package chatGpt;

import java.util.Scanner;


public class Primalidad {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        if (esPrimo(numero)){
            System.out.println("Es numero primo");
        }else {
            System.out.println("No es numero primo");
        }

    }

    /**
     *<h1>Funcion esPrimo</h2>
     * Descricion: Detecta si un numero es primo o no
     * @param numero Resive un numero entero
     * @returnRetorna Rertorna un valor booleano indicando si el numero
     * es primo o no
     */
    static boolean esPrimo(int numero){
        int contador = 0;

        int[] numeros = new int [numero];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
        }

        for (int i: numeros) {

            if(i == 1 || i == numero ) {
                continue;
            }
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador == 0;
    }

}
