public class Soma extends OperacaoMatematica {

    @Override
    public double calcular(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public String getDescricao() {
        return "Soma";
    }
}