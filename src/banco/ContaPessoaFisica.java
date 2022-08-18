package banco;

public class ContaPessoaFisica extends Conta {
	private Double gastoSaude;

	public ContaPessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return this.gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double valorImposto() {
		double valortotal=0;
		double rendaMundacaDeAlicota = 20000.00;
		if (getRendaAnual() < rendaMundacaDeAlicota) {
			valortotal=getRendaAnual() * 0.15;
			return valortotal;
		} else if (getRendaAnual() > rendaMundacaDeAlicota && getGastoSaude() > 0) {
			valortotal= (getRendaAnual() * 0.25 - (getGastoSaude()/2)) ;
			return valortotal;
		} else {
			valortotal=(getRendaAnual() * 0.25);
			return valortotal;
		}
	}

}
