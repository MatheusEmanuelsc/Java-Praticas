package empresaFuncionarios;

public class FuncionariosTerceirizados  extends Funcionarios{
	
	private Double despesaAdcional; 

	public FuncionariosTerceirizados(String name, Integer horas, Double valorPorHoras, Double despesa_Adcional) {
		super(name, horas, valorPorHoras);
		this.setDespesaAdcional(despesa_Adcional);
	}
	
	
	public Double getDespesaAdcional() {
		return despesaAdcional;
	}


	public void setDespesaAdcional(Double despesaAdcional) {
		this.despesaAdcional = despesaAdcional;
	}


	@Override
	public double pagamento() {
		double pagamento=despesaAdcional+(despesaAdcional*0.1)+(super.getHoras()*super.getValorPorHoras());
		return	pagamento;
	}
	
	
	
}
