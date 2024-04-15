public class Motor {
    private String fabricante;
    private String potencia;
    private int codigo;

    public Motor() {
        this.fabricante = null;
        this.potencia = null;
        this.codigo = 0;
    }

    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }
}
