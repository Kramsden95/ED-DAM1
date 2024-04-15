public class Gato extends Mascota{
    private String raza;

    public Gato() {
        super();
        this.raza = null;
    }

    public Gato(int edad, String nombre, String raza) {
        super(edad, nombre);
        this.raza = raza;
    }

    @Override
    public void sonido() {
        System.out.println("¡Quack!");
    }
}
