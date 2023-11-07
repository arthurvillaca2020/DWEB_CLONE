package dwbe.shopping.dao;

import dwbe.shopping.Model.Evento;

import java.util.ArrayList;
import java.util.List;

public class EventoDAO {

    public boolean CadastrarEvento(Evento evento) {
        return true;
    }

    public boolean AlterarEvento(Evento evento) {
        return true;
    }

    public boolean DeletarEvento(Evento evento) {
        return true;
    }

    public List<Evento> BuscarTodosEventos() {
        return new ArrayList<Evento>();
    }

    public Evento BuscarEventoId(int id) {
        return new Evento();
    }
}

