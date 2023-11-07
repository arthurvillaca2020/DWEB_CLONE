package dwbe.shopping.Model;

public class Evento {
    private int id;
    private String nomeEvento;
    private String dataHora;
    private String descricao;

    public Evento(int id, String nomeEvento, String dataHora, String descricao) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.dataHora = dataHora;
        this.descricao = descricao;

    }
    public Evento() {

    }

    public Evento(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

