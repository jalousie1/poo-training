public class ContaCorrente extends Conta {

    private static final double TAXA_CORRENTE = 0.02;
    private static final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * TAXA_CORRENTE);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - TAXA_DEPOSITO);
    }
}
