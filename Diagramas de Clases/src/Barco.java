import java.util.Date;

public class Barco implements Sonido{
    private Motor motor;
    private String nombre;
    private Date fechaConstruccion;
    private int numCamarrotes;

    public Barco() {
        this.nombre = null;
        this.fechaConstruccion = null;
        this.numCamarrotes = 0;
        this.motor = null;
    }

    public Barco(Date fechaConstruccion, String nombre, int numCamarrotes, String fabricante, String codigo, int potencia) {
        this.fechaConstruccion = fechaConstruccion;
        this.nombre = nombre;
        this.numCamarrotes = numCamarrotes;
        this.motor = new Motor(fabricante, codigo, potencia);
    }

    @Override
    public void sonido() {
        System.out.println("¡HONK HONK!");
    }
}
