package dwbe.shopping.Model;

import java.util.ArrayList;
import java.util.List;

public class Terceirizado {
    private int id;
    private String cnpj;
    private List<Servico> servicos = new ArrayList();
    private Logradouro logradouro;
    private String email;
    private String telefone;

    public Terceirizado(int id, String cnpj, List<Servico> servicos, Logradouro logradouro, String email, String telefone) {
        this.id = id;
        this.cnpj = cnpj;
        this.servicos = servicos;
        this.logradouro = logradouro;
        this.email = email;
        this.telefone = telefone;
    }

    public Terceirizado() {
    }
    public Terceirizado(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
