package dwbe.shopping.View;

import dwbe.shopping.Controller.ContratoService;
import dwbe.shopping.Model.Contrato;
import dwbe.shopping.Model.Locatario;
import dwbe.shopping.Model.Logradouro;
import dwbe.shopping.dao.ContratoDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Criando uma instância do ContratoService e do ContratoDAO
		ContratoService contratoService = new ContratoService();
		ContratoDAO contratoDAO = new ContratoDAO();

		// Criando alguns contratos para teste
		Contrato contrato1 = new Contrato(1, 1000.00, "2023-11-06", "2023-12-06",
				new Locatario(1, "Breno", "123", "321", "inscricao1", "segmento1", new Logradouro()), "Objeto 1");
		Contrato contrato2 = new Contrato(2, 1500.00, "2023-11-07", "2023-12-07",
				new Locatario(1, "Arthur", "456", "654", "inscricao2", "segmento2", new Logradouro()), "Objeto 2");

		// Cadastrando contratos
		contratoService.cadastrarContrato(contrato1);
		contratoService.cadastrarContrato(contrato2);

		// Listando contratos
		List<Contrato> contratos = contratoService.listaDeContratos();
		System.out.println("Contratos cadastrados:");
		for (Contrato contrato : contratos) {
			System.out.println("- Contrato:" + contrato.getId() +
					"\nLocatario: " + contrato.getLocatario().getNome() +
							"\nObjeto de locacao: "+ contrato.getObjetoLocacao() +
							"\nValor de R$ " + contrato.getValor() +
					"\nInicia em " + contrato.getDataInicio() + " Termina em " + contrato.getDataTermino());
		}

		// Alterando um contrato
		contrato1.setValor(1200.00);
		contratoService.alterarContrato(contrato1);

		// Listando contratos após edicao
		contratoService.listaDeContratos();
		System.out.println("Contratos cadastrados após edicao:");
		for (Contrato contrato : contratos) {
			System.out.println("- Contrato:" + contrato.getId() +
					"\nLocatario: " + contrato.getLocatario().getNome() +
					"\nObjeto de locacao: "+ contrato.getObjetoLocacao() +
					"\nValor de R$ " + contrato.getValor() +
					"\nInicia em " + contrato.getDataInicio() + " Termina em " + contrato.getDataTermino());
		}

		// Excluindo um contrato
		contratoService.excluirContrato(2);

		// Listando contratos após excluir
		contratoService.listaDeContratos();
		System.out.println("Contratos cadastrados após excluir:");
		for (Contrato contrato : contratos) {
			System.out.println("- Contrato:" + contrato.getId() +
					"\nLocatario: " + contrato.getLocatario().getNome() +
					"\nObjeto de locacao: "+ contrato.getObjetoLocacao() +
					"\nValor de R$ " + contrato.getValor() +
					"\nInicia em " + contrato.getDataInicio() + " Termina em " + contrato.getDataTermino());
		}
	}
}
