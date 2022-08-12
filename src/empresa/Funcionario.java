package empresa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	private Level nivel;
	private Double BaseSalarial;
	
	private Departamento departamento;
	private List<Contratos> listaDeContratos = new ArrayList<>();
	
	
	
	public void adcionaContratos(Contratos contrato) {
		listaDeContratos.add(contrato);
	}
	
	public void removeContrato(Contratos contrato) {
		listaDeContratos.remove(contrato);
	}
	
	public Funcionario(String nome, Level nivel, Double baseSalarial,Departamento departamento) {
		this.departamento=departamento;
		this.nome = nome;
		this.nivel = nivel;
		this.BaseSalarial = baseSalarial;
	}
	
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contratos> getListaDeContratos() {
		return listaDeContratos;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Level getNivel() {
		return nivel;
	}
	public void setNivel(Level nivel) {
		this.nivel = nivel;
	}
	public Double getBaseSalarial() {
		return BaseSalarial;
	}
	public void setBaseSalarial(Double baseSalarial) {
		BaseSalarial = baseSalarial;
	}
	
	public double salarioTotal(int ano , int mes) {
		
		double somaContratos=0;
		for (Contratos contratos : listaDeContratos) {
			
			int anoContrato=contratos.getDate().getYear();
			int mesContrato=contratos.getDate().getMonthValue();
			if (anoContrato==ano && mesContrato ==mes) {
				 somaContratos = somaContratos+contratos.valorTotal();
				
			}
		}
		double totalSalarial= getBaseSalarial()+somaContratos;
		return totalSalarial;
	}
	
}
