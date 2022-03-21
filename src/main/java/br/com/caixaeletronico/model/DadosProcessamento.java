package br.com.caixaeletronico.model;

public class DadosProcessamento {

	private NotasDisponiveis notas;
	private int valorSobra;

	public DadosProcessamento(NotasDisponiveis notas, int valorSobra) {
		super();
		this.notas = notas;
		this.valorSobra = valorSobra;
	}

	public NotasDisponiveis getNotas() {
		return notas;
	}

	public void setNotas(NotasDisponiveis notas) {
		this.notas = notas;
	}

	public int getValorSobra() {
		return valorSobra;
	}

	public void setValorSobra(int valorSobra) {
		this.valorSobra = valorSobra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notas == null) ? 0 : notas.hashCode());
		result = prime * result + valorSobra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosProcessamento other = (DadosProcessamento) obj;
		if (notas == null) {
			if (other.notas != null)
				return false;
		} else if (!notas.equals(other.notas))
			return false;
		if (valorSobra != other.valorSobra)
			return false;
		return true;
	}

}
