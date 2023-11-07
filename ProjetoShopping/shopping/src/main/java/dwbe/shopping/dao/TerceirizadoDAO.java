package dwbe.shopping.dao;

import dwbe.shopping.Model.Terceirizado;

import java.util.ArrayList;
import java.util.List;

public class TerceirizadoDAO {
    public boolean CadastrarTerceirizado(Terceirizado terceirizado) {
        return true;
    }

    public boolean AlterarTerceirizado(Terceirizado terceirizado) {
        return true;
    }

    public boolean DeletarTerceirizado(Terceirizado terceirizado) {
        return true;
    }

    public List<Terceirizado> BuscarTodosTerceirizados() {
        return new ArrayList<Terceirizado>();
    }

    public Terceirizado BuscarTerceirizadoId(int id) {
        return new Terceirizado();
    }
}
