public class Nino extends Persona{
    private Juguete juguete;
    private String colegio;

    public Nino() {
        super();
        this.colegio = null;
    }

    public Nino(String nombre, String DNI, int edad, String colegio) {
        super(nombre, DNI, edad);
        this.colegio = colegio;
    }

    public void comprarJuguete(Juguete juguete){
        this.juguete = juguete;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String toString() {
        return "Nino{" +
                "colegio='" + colegio + '\'' +
                '}';
    }
}
