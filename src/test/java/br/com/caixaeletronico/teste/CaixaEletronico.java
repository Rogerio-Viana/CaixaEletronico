package br.com.caixaeletronico.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.caixaeletronico.model.DadosProcessamento;
import br.com.caixaeletronico.service.ProcessamentoService;
import br.com.caixaeletronico.service.ProcessamentoServiceImpl;

public class CaixaEletronico {

	private final ProcessamentoService processService = new ProcessamentoServiceImpl();

	private DadosProcessamento dados = processService.processarNotas(135);

	@Test
	public void notas100Disponiveis() {
		assertEquals(1, dados.getNotas().getN100());
	}

	@Test
	public void notas50Disponiveis() {
		assertEquals(0, dados.getNotas().getN50());
	}

	@Test
	public void notas20Disponiveis() {
		assertEquals(1, dados.getNotas().getN20());
	}

	@Test
	public void notas10Disponiveis() {
		assertEquals(1, dados.getNotas().getN10());
	}

	@Test
	public void valorSobra() {
		assertTrue(dados.getValorSobra() == 5);
	}

}
