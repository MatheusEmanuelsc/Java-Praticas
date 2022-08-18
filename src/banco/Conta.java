package banco;

public abstract class Conta {

	private String nome;
	private Double rendaAnual;

	public Conta() {

	}

	public Conta(String nome, Double rendaAnual) {

		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract double valorImposto();

	@Override
	public String toString() {
		return getNome() + " $ " + valorImposto();
	}
}
