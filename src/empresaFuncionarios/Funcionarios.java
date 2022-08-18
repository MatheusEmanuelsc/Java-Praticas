package empresaFuncionarios;

public class Funcionarios {
	private String name;
	private Integer horas;
	private Double valorPorHoras;
	
	
	public Funcionarios(String name, Integer horas, Double valorPorHoras) {
		
		this.name = name;
		this.horas = horas;
		this.valorPorHoras = valorPorHoras;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public Double getValorPorHoras() {
		return valorPorHoras;
	}
	public void setValorPorHoras(Double valorPorHoras) {
		this.valorPorHoras = valorPorHoras;
	}
	
	public double pagamento() {
		Double pagamento = getValorPorHoras()*getHoras();
		return pagamento;
	}
	
}
