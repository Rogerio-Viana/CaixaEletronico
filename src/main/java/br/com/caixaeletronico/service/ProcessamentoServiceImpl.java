package br.com.caixaeletronico.service;

import java.util.Scanner;

import br.com.caixaeletronico.model.DadosProcessamento;
import br.com.caixaeletronico.model.NotasDisponiveis;

public class ProcessamentoServiceImpl implements ProcessamentoService {

	public int lerValorSaque() {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o valor de saque:\n");
		int valorEnt = ler.nextInt();
		return valorEnt;
	}

	public DadosProcessamento processarNotas(int valorEnt) {

		NotasDisponiveis notasDipo = new NotasDisponiveis();

		if (valorEnt / 100 > 0) {
			notasDipo.setN100(valorEnt / 100);
			valorEnt -= (valorEnt / 100) * 100;
		}

		if (valorEnt / 50 > 0) {
			notasDipo.setN50(valorEnt / 50);
			valorEnt -= (valorEnt / 50) * 50;
		}

		if (valorEnt / 20 > 0) {
			notasDipo.setN20(valorEnt / 20);
			valorEnt -= (valorEnt / 20) * 20;
		}

		if (valorEnt / 10 > 0) {
			notasDipo.setN10(valorEnt / 10);
			valorEnt -= (valorEnt / 10) * 10;
		}

		return new DadosProcessamento(notasDipo, valorEnt);

	}

	public void sobraPrintFormater(int valorSobra) {

		if (valorSobra > 0) {
			String valorSobraPrint = String.format("Caixa eletrônico não possui notas para R$%s", valorSobra);
			System.out.println(valorSobraPrint);
			System.out.println("Entre em contato com o gerente responsável");
		}

	}

	public void resultadoPrintFormater(NotasDisponiveis notas) {

		String resultPrint = String.format(
				"Entregar %s nota de R$100,00; %s nota de R$50,00; %s nota de R$20,00; %s nota de R$10,00 ",
				notas.getN100(), notas.getN50(), notas.getN20(), notas.getN10());

		System.out.println(resultPrint);

	}
}
