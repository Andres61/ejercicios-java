import juegosderol.Asesino;
import juegosderol.Guerrero;
import juegosderol.Mago;
import juegosderol.Personaje;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personaje[] personajes = new Personaje[3];


        personajes[0] = new Guerrero("Manolo", 100, 40);
        personajes[1] = new Mago("Martin", 100, 40);
        personajes[2] = new Asesino("Antonia", 100, 40);

        Random batalla = new Random();

        while (hayMasDeUnPersonajeVivo(personajes)) {
            Personaje atacante = personajes[batalla.nextInt(personajes.length)];
            Personaje objetivo = personajes[batalla.nextInt(personajes.length)];

            if (atacante != objetivo) {
                atacante.atacar(objetivo);

                System.out.println(atacante.getNombre() + " ataca a " + objetivo.getNombre());
                System.out.println(objetivo.getNombre() + " queda con " + objetivo.getVida() + " puntos de vida");

                if (!objetivo.estaVivo()) {
                    System.out.println(objetivo.getNombre() + " ha muerto");

                }
            }
        }

        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) {
                System.out.println("El ganador es " + personaje.getNombre());
            }
        }
    }

    private static boolean hayMasDeUnPersonajeVivo(Personaje[] personajes) {
        int contador = 0;

        for (Personaje personaje : personajes) {
            if (personaje.estaVivo()) {
                contador++;
            }
        }

        return contador > 1;
    }
    private static boolean fueraDeCombate(Personaje[] personajes){
        int combatiente = 0;

        for (Personaje personaje: personajes){
            if (personaje.getVida() == 0){
                combatiente--;
            }
        }
        return combatiente >1;
    }
}


