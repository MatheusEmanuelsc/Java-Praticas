package produto;

public class ProdutoImportado extends Produto {
	private Double custoDeImportacao;

	public Double getCustoDeImportacao() {
		return custoDeImportacao;
	}

	public void setCustoDeImportacao(double custoDeImportacao) {
		this.custoDeImportacao = custoDeImportacao;
	}

	
	public ProdutoImportado (String nome, double preco, Double custoDeImpotacao) {
		super(nome,preco);
		this.custoDeImportacao=custoDeImpotacao;
	}
	

	public double precoTotal() {
		double total= getCustoDeImportacao()+getPreco();
		return total;
	}

	@Override
	public String precoTag() {
		return getNome()+ "  $ "+precoTotal()+"(Custo de importação: " + getCustoDeImportacao() +")";
	}

	
	
	
}
