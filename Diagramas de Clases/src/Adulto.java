public class Adulto extends Persona{
    private String NSS;
    private String direccion;

    public Adulto() {
        super();
        this.NSS = null;
        this.direccion = null;
    }

    public Adulto(String nombre, String DNI, int edad, String NSS, String direccion) {
        super(nombre, DNI, edad);
        this.NSS = NSS;
        this.direccion = direccion;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Adulto{" +
                "NSS='" + NSS + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
