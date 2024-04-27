import java.util.Date;

public class Reclamacao {
    private int id;
    private String endereco;
    private int tamanhoBuraco;
    private String localizacao;
    private Date dataHoraReclamacao;
    private String situacao;

    public Reclamacao(int id, String endereco, int tamanhoBuraco, String localizacao, Date dataHoraReclamacao, String situacao) {
        this.id = id;
        this.endereco = endereco;
        this.tamanhoBuraco = tamanhoBuraco;
        this.localizacao = localizacao;
        this.dataHoraReclamacao = dataHoraReclamacao;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTamanhoBuraco() {
        return tamanhoBuraco;
    }

    public void setTamanhoBuraco(int tamanhoBuraco) {
        this.tamanhoBuraco = tamanhoBuraco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Date getDataHoraReclamacao() {
        return dataHoraReclamacao;
    }

    public void setDataHoraReclamacao(Date dataHoraReclamacao) {
        this.dataHoraReclamacao = dataHoraReclamacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Reclamacao [id=" + id + ", endereco=" + endereco + ", tamanhoBuraco=" + tamanhoBuraco + ", localizacao=" + localizacao + ", dataHoraReclamacao=" + dataHoraReclamacao + ", situacao=" + situacao + "]";
    }
}