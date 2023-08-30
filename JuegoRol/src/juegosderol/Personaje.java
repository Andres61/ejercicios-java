package juegosderol;

public class Personaje {

    private String nombre;

    private int vida;

    private int puntosDeAtaque;

    public Personaje(String nombre, int vida, int puntosDeAtaque) {
        this.nombre = nombre;
        this.vida = vida;
        this.puntosDeAtaque = puntosDeAtaque;

    }

    public void atacar(Personaje objetivo){
        objetivo.recibirAtaque(this.puntosDeAtaque);
    }
    public void recibirAtaque(int puntosDeAtaque){
        this.vida -= puntosDeAtaque;
    }
    public boolean estaVivo(){
        return this.vida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPuntosDeAtaque() {
        return this.puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", puntosDeAtaque=").append(puntosDeAtaque);
        sb.append('}');
        return sb.toString();
    }
}
