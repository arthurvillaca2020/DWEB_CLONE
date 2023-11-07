package dwbe.shopping.Controller;



import dwbe.shopping.Model.Contrato;
import dwbe.shopping.Model.Locatario;
import dwbe.shopping.dao.ContratoDAO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {

    private List<Contrato> database = new ArrayList<>();
    private ContratoDAO contratoDAO = new ContratoDAO();

    public void cadastrarContrato(Contrato contrato) {
        if (contrato != null) {
            boolean cadastrado = contratoDAO.CadastrarContrato(contrato);
            if (cadastrado) {
                database.add(contrato);
            }
        }
    }
    public void alterarContrato(Contrato contrato){
        int index = database.indexOf(contrato);
        database.set(index, contrato);
    }

    public Contrato buscarPorContrato(int id){
        for (Contrato contrato : database) {
            if (contrato.getId() == id) {
                return contrato;
            }
        }
        return null;
    }
    public List<Contrato> listaDeContratos(){
        return database;
    }

    public void excluirContrato(int id){
        Contrato contrato = buscarPorContrato(id);
        if (contrato != null) {
            database.remove(contrato);
        }
    }
}

