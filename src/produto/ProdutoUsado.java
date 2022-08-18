package produto;

import java.time.LocalDate;

public class ProdutoUsado extends Produto{
	private  LocalDate data;
	
	
	
	

	public ProdutoUsado(String nome, double preco,int ano, int mes,int dia) {
		super(nome, preco);
		this.data= LocalDate.of(ano, mes, dia);
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(int ano, int mes,int dia) {
		this.data= LocalDate.of(ano, mes, dia);
	}

	@Override
	public String precoTag() {
		return getNome()+"(Usado) $ "+ getPreco()+ "(Fabricado: "+getData()+")";
	}
	
	
}
