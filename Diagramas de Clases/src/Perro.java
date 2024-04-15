public class Perro extends Mascota{
    private String raza;

    public Perro() {
        super();
        this.raza = null;
    }

    public Perro(int edad, String nombre, String raza) {
        super(edad, nombre);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("¡Guau!");
    }
}
