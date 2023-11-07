package dwbe.shopping.Model;

public class Contrato {
    private int id;
    private double valor;
    private String dataInicio;
    private String dataTermino;
    private Locatario locatario;
    private String objetoLocacao;

    public Contrato(int id, double valor, String dataInicio, String dataTermino, Locatario locatario, String objetoLocacao) {
        this.id = id;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.locatario = locatario;
        this.objetoLocacao = objetoLocacao;

    }

    public Contrato() {
    }
    public Contrato(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public String getObjetoLocacao() {
        return objetoLocacao;
    }

    public void setObjetoLocacao(String objetoLocacao) {
        this.objetoLocacao = objetoLocacao;
    }


}