package dwbe.shopping.View;

import dwbe.shopping.Controller.TerceirizadoService;
import dwbe.shopping.Model.Terceirizado;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TerceirizadoComponent implements CommandLineRunner {

    private final TerceirizadoService service = new TerceirizadoService();
    @Override
    public void run(String... args) throws Exception {
        for (int x = 1; x <= 5; x++) {
            service.gravar(new Terceirizado(x));
        }
        Terceirizado terceirizado2 = service.buscarPorTerceirizado(2);
        terceirizado2.setId(10);
        service.alterar(terceirizado2);

        for (Terceirizado terceirizado : service.listar()) {
            System.out.println(terceirizado);
        }
    }
}