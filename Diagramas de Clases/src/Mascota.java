public abstract class Mascota implements Sonido{
    private String nombre;
    private int edad;

    public Mascota() {
        this.nombre = null;
        this.edad = 0;
    }

    public Mascota(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public void sonido() {

    }
}
