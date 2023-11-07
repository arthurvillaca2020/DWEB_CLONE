package dwbe.shopping.Model;

public class Locatario {
    private int id;
    private String nome;
    private String cnpj;
    private String rg;
    private String inscricaoEstatual;
    private String seguimentoLocator;
    private Logradouro logradouro;

    public Locatario(int id, String nome, String cnpj, String rg, String inscricaoEstatual, String seguimentoLocator, Logradouro logradouro) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.rg = rg;
        this.inscricaoEstatual = inscricaoEstatual;
        this.seguimentoLocator = seguimentoLocator;
        this.logradouro = logradouro;
    }
    public Locatario(int id){
        this.id = id;
    }
    public Locatario(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(String inscricaoEstatual) {
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public String getSeguimentoLocator() {
        return seguimentoLocator;
    }

    public void setSeguimentoLocator(String seguimentoLocator) {
        this.seguimentoLocator = seguimentoLocator;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
}
