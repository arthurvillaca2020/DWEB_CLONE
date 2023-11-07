package dwbe.shopping.View;

import dwbe.shopping.Controller.ServicoService;
import dwbe.shopping.Model.Servico;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServicoComponent implements CommandLineRunner {

    private final ServicoService service = new ServicoService();

    @Override
    public void run(String... args) throws Exception {
        for (int x = 1; x <= 5; x++) {
            service.gravar(new Servico(x));
        }
        Servico servico2 = service.buscarPorServico(1);
        servico2.setId(34);
        service.alterar(servico2);

        for (Servico servico : service.listar()) {
            System.out.println(servico);
        }
    }
}