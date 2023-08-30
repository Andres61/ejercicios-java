package mismascotas;

public class Gato extends Mascota {

    private String pelaje;

    public Gato(String nombre, int edad, String tipo, String pelaje) {
        super(nombre, edad, tipo);
        this.pelaje = pelaje;
    }

    public void maullar(){
        System.out.println("mia");
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gato{");
        sb.append("pelaje='").append(pelaje).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
