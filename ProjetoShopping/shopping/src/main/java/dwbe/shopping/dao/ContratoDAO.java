package dwbe.shopping.dao;

import dwbe.shopping.Model.Contrato;
import dwbe.shopping.Model.Locatario;

import java.util.ArrayList;
import java.util.List;

public class ContratoDAO {

    public boolean CadastrarContrato(Contrato contrato) {
        return true;
    }

    public boolean AlterarContrato(Contrato contrato) {
        return true;
    }

    public boolean DeletarContrato(Contrato contrato) {
        return true;
    }

    public List<Contrato> BuscarTodosContratos() {
        return new ArrayList<Contrato>();
    }

    public Contrato BuscarContratoId(int id) {
        return new Contrato();
    }
}