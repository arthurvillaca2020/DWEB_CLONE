package dwbe.shopping.dao;

import dwbe.shopping.Model.Locatario;

import java.util.ArrayList;
import java.util.List;

public class LocatarioDAO {

    public boolean CadastrarLocatario(Locatario locatario) {
        return true;
    }

    public boolean AlterarLocatario(Locatario locatario) {
        return true;
    }

    public boolean DeletarLocatario(Locatario locatario) {
        return true;
    }

    public List<Locatario> BuscarTodosLocatarios() {
        return new ArrayList<Locatario>();
    }

    public Locatario BuscarLocatarioId(int id) {
        return new Locatario();
    }
}

