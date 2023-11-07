package dwbe.shopping.Controller;

import dwbe.shopping.Model.Contrato;
import dwbe.shopping.Model.Evento;
import dwbe.shopping.dao.ContratoDAO;
import dwbe.shopping.dao.EventoDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventoService {
    private List<Evento> database = new ArrayList<>();

    private EventoDAO eventoDAO = new EventoDAO();

    public void cadastrarEvento(Evento evento) {
        if (evento != null) {
            boolean cadastrado = eventoDAO.CadastrarEvento(evento);
            if (cadastrado) {
                database.add(evento);
            }
        }
    }
    //public void gravar(Evento evento){
        //database.add(evento);
    //}
    public void alterarEvento(Evento evento){
        int index = database.indexOf(evento);
        database.set(index, evento);
    }

    public Evento buscarPorEvento(int id){
        for (Evento evento : database) {
            if (evento.getId() == id) {
                return evento;
            }
        }
        return null;
    }

    public List<Evento> listaDeEventos(){
        return database;
    }

    public void excluirEvento(int id){
        Evento evento = buscarPorEvento(id);
        if (evento != null) {
            database.remove(evento);
        }
    }
}

