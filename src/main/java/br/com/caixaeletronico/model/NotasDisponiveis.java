package br.com.caixaeletronico.model;

public class NotasDisponiveis {

	private int n100;
	private int n50;
	private int n20;
	private int n10;

	public int getN100() {
		return n100;
	}

	public void setN100(int n100) {
		this.n100 = n100;
	}

	public int getN50() {
		return n50;
	}

	public void setN50(int n50) {
		this.n50 = n50;
	}

	public int getN20() {
		return n20;
	}

	public void setN20(int n20) {
		this.n20 = n20;
	}

	public int getN10() {
		return n10;
	}

	public void setN10(int n10) {
		this.n10 = n10;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + n10;
		result = prime * result + n100;
		result = prime * result + n20;
		result = prime * result + n50;
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
		NotasDisponiveis other = (NotasDisponiveis) obj;
		if (n10 != other.n10)
			return false;
		if (n100 != other.n100)
			return false;
		if (n20 != other.n20)
			return false;
		if (n50 != other.n50)
			return false;
		return true;
	}

}
