package br.com.caixaeletronico;

import br.com.caixaeletronico.model.DadosProcessamento;
import br.com.caixaeletronico.service.ProcessamentoService;
import br.com.caixaeletronico.service.ProcessamentoServiceImpl;

public class CaixaEletronico {

	public static void main(String[] args) {

		ProcessamentoService processService = new ProcessamentoServiceImpl();

		int valorSaque = processService.lerValorSaque();
		DadosProcessamento dados = processService.processarNotas(valorSaque);
		processService.resultadoPrintFormater(dados.getNotas());
		processService.sobraPrintFormater(dados.getValorSobra());

	}

}
