package house;

public class Empleado extends Empresa {

    private int idEmpleado;

    public Empleado(String nombre, int dinero, String direccion, int idEmpleado) {
        super(nombre, dinero, direccion);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append('}');
        return sb.toString();
    }
}


