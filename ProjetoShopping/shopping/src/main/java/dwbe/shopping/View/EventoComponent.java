package dwbe.shopping.View;

import dwbe.shopping.Controller.EventoService;
import dwbe.shopping.Model.Evento;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EventoComponent implements CommandLineRunner {

    private final EventoService service = new EventoService();
    @Override
    public void run(String... args) throws Exception{
        for (int x=1; x<=5; x++){
            service.gravar(new Evento(x));
        }
        Evento evento2  = service.buscarPorEvento(2);
        evento2.setId(20);
        service.alterar(evento2);

        for(Evento evento: service.listar()){
            System.out.println(evento);
        }
    }
}
