package dwbe.shopping.Controller;

import dwbe.shopping.Model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoService {
    private List<Servico> database = new ArrayList<>();

    public void gravar(Servico servico){
        database.add(servico);
    }
    public void alterar(Servico servico){
        int index = database.indexOf(servico);
        database.set(index, servico);
    }

    public Servico buscarPorServico(int id){
        int index = database.indexOf(new Servico(id));
        Servico selectServico = database.get(index);
        return selectServico;
    }
    public List<Servico> listar(){
        return database;
    }
}
