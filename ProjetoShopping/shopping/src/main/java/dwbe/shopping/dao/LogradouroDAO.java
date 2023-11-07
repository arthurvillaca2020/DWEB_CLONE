package dwbe.shopping.dao;

import dwbe.shopping.Model.Logradouro;

import java.util.ArrayList;
import java.util.List;

public class LogradouroDAO {

    public boolean CadastrarLogradouro(Logradouro logradouro) {
        return true;
    }

    public boolean AlterarLogradouro(Logradouro logradouro) {
        return true;
    }

    public boolean DeletarLogradouro(Logradouro logradouro) {
        return true;
    }

    public List<Logradouro> BuscarTodosLogradouros() {
        return new ArrayList<Logradouro>();
    }

    public Logradouro BuscarLogradouroCep(String cep) {
        return new Logradouro();
    }
}


