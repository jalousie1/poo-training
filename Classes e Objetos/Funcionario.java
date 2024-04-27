public class Funcionario {
    private String nome;
    private int numeroMatricula;
    private int idade;
    private double salario;
    private Endereco endereco;
    private Telefone telefone;

    public Funcionario(String nome, int numeroMatricula, int idade, double salario, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.idade = idade;
        this.salario = salario;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public boolean verificarIdadeAposentadoria() {
        return idade > 65;
    }

    public void bonificar(double valor) {
        this.salario += valor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", idade=" + idade +
                ", salario=" + salario +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                '}';
    }
}