public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("seila sul", "casa");
        Telefone telefone = new Telefone("99999-9999", "Celular");
        Funcionario funcionario = new Funcionario("Christian", 12342225, 20, 3000.0, endereco, telefone);

        System.out.println(funcionario);
    }
}