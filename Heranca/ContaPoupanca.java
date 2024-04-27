public class ContaPoupanca extends Conta {

    private static final double TAXA_POUPANCA = 0.03;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * TAXA_POUPANCA);
    }
}
