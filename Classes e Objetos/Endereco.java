public class Endereco {
    private String rua;
    private String logradouro;

    public Endereco(String rua, String logradouro) {
        this.rua = rua;
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}