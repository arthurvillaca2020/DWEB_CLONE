package dwbe.shopping.View;


import dwbe.shopping.Controller.LogradouroService;
import dwbe.shopping.Model.Logradouro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LogradouroComponent implements CommandLineRunner {

    private final LogradouroService service = new LogradouroService();

    @Override
    public void run(String... args) throws Exception {
        for (int x = 1; x <= 5; x++) {
            service.gravar(new Logradouro("2" + x));
        }
        Logradouro logradouro2 = service.buscarPorLogradouro("22");
        logradouro2.setCep("2");
        service.alterar(logradouro2);

        for (Logradouro logradouro : service.listar()) {
            System.out.println(logradouro);
        }
    }
}