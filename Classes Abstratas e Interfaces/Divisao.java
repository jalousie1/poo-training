public class Divisao extends OperacaoMatematica {

    @Override
    public double calcular(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return numero1 / numero2;
    }

    @Override
    public String getDescricao() {
        return "Divisão";
    }
}