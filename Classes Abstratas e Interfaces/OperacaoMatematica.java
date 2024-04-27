public abstract class OperacaoMatematica {

    public abstract double calcular(double numero1, double numero2);

    public String toString() {
        return "OperacaoMatematica{" +
                "descricao=" + getDescricao() +
                '}';
    }

    public abstract String getDescricao();
}
