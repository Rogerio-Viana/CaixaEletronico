package br.com.caixaeletronico.service;

import br.com.caixaeletronico.model.DadosProcessamento;
import br.com.caixaeletronico.model.NotasDisponiveis;

public interface ProcessamentoService {

	public int lerValorSaque();

	public DadosProcessamento processarNotas(int valorEnt);

	public void sobraPrintFormater(int valorSobra);

	public void resultadoPrintFormater(NotasDisponiveis notas);

}
