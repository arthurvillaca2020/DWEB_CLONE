package dwbe.shopping.View;


import dwbe.shopping.Controller.ContratoService;
import dwbe.shopping.Model.Contrato;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContratoComponent implements CommandLineRunner {

    private final ContratoService service = new ContratoService();
    @Override
    public void run(String... args) throws Exception{
        for (int x=1; x<=5; x++){
            service.cadastrarContrato(new Contrato(x));
        }
        Contrato contrato2  = service.buscarPorContrato(1);
        contrato2.setValor(34);
        service.alterarContrato(contrato2);

        for(Contrato contrato: service.listaDeContratos()){
            System.out.println(contrato);
        }
    }
}
