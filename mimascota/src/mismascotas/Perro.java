package mismascotas;

public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, int edad, String tipo, String raza) {
        super(nombre, edad, tipo);
        this.raza = raza;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Perro{");
        sb.append("raza='").append(raza).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
