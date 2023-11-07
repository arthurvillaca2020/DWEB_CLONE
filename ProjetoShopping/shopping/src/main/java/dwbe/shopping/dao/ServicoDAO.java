package dwbe.shopping.dao;

import dwbe.shopping.Model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoDAO {
    public boolean CadastrarServico(Servico servico) {
        return true;
    }

    public boolean AlterarServico(Servico servico) {
        return true;
    }

    public boolean DeletarServico(Servico servico) {
        return true;
    }

    public List<Servico> BuscarTodosServicos() {
        return new ArrayList<Servico>();
    }

    public Servico BuscarServicoId(int id) {
        return new Servico();
    }

}
