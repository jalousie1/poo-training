import java.util.Date;

public class Conserto {
    private int idReclamacao;
    private Date dataHoraConserto;
    private double valorConserto;

    public Conserto(int idReclamacao, Date dataHoraConserto, double valorConserto) {
        this.idReclamacao = idReclamacao;
        this.dataHoraConserto = dataHoraConserto;
        this.valorConserto = valorConserto;
    }

    public int getIdReclamacao() {
        return idReclamacao;
    }

    public void setIdReclamacao(int idReclamacao) {
        this.idReclamacao = idReclamacao;
    }

    public Date getDataHoraConserto() {
        return dataHoraConserto;
    }

    public void setDataHoraConserto(Date dataHoraConserto) {
        this.dataHoraConserto = dataHoraConserto;
    }

    public double getValorConserto() {
        return valorConserto;
    }

    public void setValorConserto(double valorConserto) {
        this.valorConserto = valorConserto;
    }

    @Override
    public String toString() {
        return "Conserto [idReclamacao=" + idReclamacao + ", dataHoraConserto=" + dataHoraConserto + ", valorConserto=" + valorConserto + "]";
    }
}