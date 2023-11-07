package dwbe.shopping.Controller;

import dwbe.shopping.Model.Terceirizado;

import java.util.ArrayList;
import java.util.List;

public class TerceirizadoService {
    private List<Terceirizado> database = new ArrayList<>();

    public void gravar(Terceirizado terceirizado){
        database.add(terceirizado);
    }
    public void alterar(Terceirizado terceirizado){
        int index = database.indexOf(terceirizado);
        database.set(index, terceirizado);
    }

    public Terceirizado buscarPorTerceirizado(int id){
        int index = database.indexOf(new Terceirizado(id));
        Terceirizado selectTerceirizado = database.get(index);
        return selectTerceirizado;
    }
    public List<Terceirizado> listar(){
        return database;
    }
}
