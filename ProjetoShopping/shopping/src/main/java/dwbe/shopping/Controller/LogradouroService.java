package dwbe.shopping.Controller;

import dwbe.shopping.Model.Logradouro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LogradouroService {

    private List<Logradouro> database = new ArrayList<>();

    public void gravar(Logradouro logradouro){
        database.add(logradouro);
    }
    public void alterar(Logradouro logradouro){
        int index = database.indexOf(logradouro);
        database.set(index, logradouro);
    }

    public Logradouro buscarPorLogradouro(String cep){
        int index = database.indexOf(new Logradouro(cep));
        Logradouro selectLogradouro = database.get(index);
        return selectLogradouro;
    }
    public List<Logradouro> listar(){
        return database;
    }
}

