package banco;

public class ContaPessoaJuridica extends Conta {

	private Integer numeroDefuncionarios;

	public ContaPessoaJuridica() {
		super();

	}

	public ContaPessoaJuridica(String nome, Double rendaAnual, Integer numeroDefuncionarios) {
		super(nome, rendaAnual);
		this.numeroDefuncionarios = numeroDefuncionarios;
	}

	public double getNumeroDefuncionarios() {
		return numeroDefuncionarios;
	}

	public void setNumeroDefuncionarios(Integer numeroDefuncionarios) {
		this.numeroDefuncionarios = numeroDefuncionarios;
	}

	@Override
	public double valorImposto() {
		double valorApagar = 0;
		if (numeroDefuncionarios > 10) {
			valorApagar = (getRendaAnual() * 0.14);
			return valorApagar;
		} else {
			valorApagar = (getRendaAnual() * 0.16);
			return valorApagar;
		}
	}

}
