package house;

public class Empresa {

    private String nombre;

    private int dinero;

    private String direccion;

    public Empresa(String nombre, int dinero, String direccion) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return this.dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empresa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dinero=").append(dinero);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
