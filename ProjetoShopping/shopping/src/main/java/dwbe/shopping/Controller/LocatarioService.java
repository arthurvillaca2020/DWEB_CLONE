package dwbe.shopping.Controller;


import dwbe.shopping.Model.Locatario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LocatarioService {

    private List<Locatario> database = new ArrayList<>();

    public void gravar(Locatario locatario){
        database.add(locatario);
    }
    public void alterar(Locatario locatario){
        int index = database.indexOf(locatario);
        database.set(index, locatario);
    }

    public Locatario buscarPorLocatario(int id){
        int index = database.indexOf(new Locatario(id));
        Locatario selectLocatario = database.get(index);
        return selectLocatario;
    }
    public List<Locatario> listar(){
        return database;
    }
}

