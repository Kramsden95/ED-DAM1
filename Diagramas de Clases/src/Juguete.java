public class Juguete {
    private String nombre;
    private int precio;
    private int edadRecomendada;

    public Juguete() {
        this.nombre = null;
        this.precio = 0;
        this.edadRecomendada = 0;
    }

    public Juguete(String nombre, int edadRecomendada, int precio) {
        this.nombre = nombre;
        this.edadRecomendada = edadRecomendada;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", edadRecomendada=" + edadRecomendada +
                '}';
    }
}
