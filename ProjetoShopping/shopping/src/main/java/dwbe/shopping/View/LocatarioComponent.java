package dwbe.shopping.View;

import dwbe.shopping.Controller.LocatarioService;
import dwbe.shopping.Model.Locatario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LocatarioComponent implements CommandLineRunner {
    private final LocatarioService service = new LocatarioService();
    @Override
    public void run(String... args) throws Exception{
        for (int x=1; x<=5; x++){
            service.gravar(new Locatario(x));
        }
        Locatario locatario2  = service.buscarPorLocatario(3);
        locatario2.setId(100);
        service.alterar(locatario2);

        for(Locatario locatario: service.listar()){
            System.out.println(locatario);
        }
    }
}
