package empresa;

import java.time.LocalDate;


public class Contratos {
	private LocalDate date;
	private Double ValorPorHora;
	private Integer horas;

	
	public Contratos( Double valorPorHora, Integer horas) {
		
		
		
		this.ValorPorHora = valorPorHora;
		this.horas = horas;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(Integer dia , Integer mes, Integer ano) {
		this.date= LocalDate.of(ano,mes,dia);
		
	}
	public Double getValorPorHora() {
		return ValorPorHora;
	}
	public void setValorPorHora(Double valorPorHora) {
		ValorPorHora = valorPorHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public double valorTotal() {
		double soma = getHoras()*getValorPorHora();
		return soma;
	}
	
	@Override
	public String toString() {
		return "Contratos [date=" + date + ", ValorPorHora=" + ValorPorHora + ", horas=" + horas + "]";
	}
}
