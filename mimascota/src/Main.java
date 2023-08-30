import mismascotas.*;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Martin", 12, "Perro", "Schnauzer");
        Gato gato1 = new Gato("Antonia", 13, "Gato", "Carey");
        Perro perro2 = new Perro("Manolo", 17, "Perro", "Criollo");

        System.out.println(" El nombre del gato/a es: " + gato1.getNombre() + " Y el pelaje es: " +  gato1.getPelaje());
        System.out.println("El nombre del perro/a es: " + perro1.getNombre() + " Y la raza es: " +  perro1.getRaza());

        System.out.println(gato1.getNombre() + " y " + perro1.getNombre() + " son hermanos ");
        System.out.println(gato1.getNombre() + "Le pega a " + perro2.getNombre() + " por ser " + perro2.getRaza());


    }
}