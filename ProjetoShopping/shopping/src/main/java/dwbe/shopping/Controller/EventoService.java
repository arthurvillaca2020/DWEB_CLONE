package dwbe.shopping.Controller;

import dwbe.shopping.Model.Evento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventoService {
    private List<Evento> database = new ArrayList<>();

    public void gravar(Evento evento){
        database.add(evento);
    }
    public void alterar(Evento evento){
        int index = database.indexOf(evento);
        database.set(index, evento);
    }

    public Evento buscarPorEvento(int id){
        int index = database.indexOf(new Evento(id));
        Evento selectEvento = database.get(index);
        return selectEvento;
    }
    public List<Evento> listar(){
        return database;
    }
}

