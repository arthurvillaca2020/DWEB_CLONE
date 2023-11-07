package dwbe.shopping.Model;

public class Servico {
    private int id;
    private String nomeServico;
    private String descricao;
    private double preco;
    private String horarioFuncionamento;

    public Servico(int id, String nomeServico, String descricao, double preco, String horarioFuncionamento) {
        this.id = id;
        this.nomeServico = nomeServico;
        this.descricao = descricao;
        this.preco = preco;
        this.horarioFuncionamento = horarioFuncionamento;

    }

    public Servico() {
    }
    public Servico(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

}
