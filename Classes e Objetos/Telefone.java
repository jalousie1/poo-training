public class Telefone {
    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}