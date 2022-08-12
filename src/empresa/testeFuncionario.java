package empresa;

import java.util.Scanner;

public class testeFuncionario {

	public static void main(String[] args) {
		
		
		Scanner entraDedados= new Scanner(System.in);
		
		System.out.println("nome do departamento:");
		String nomeDepartamento= entraDedados.nextLine();
		
		System.out.println("nome Do funcionario: ");
		String nomeFuncionario= entraDedados.nextLine();
		
		System.out.println("nivel do funcionario: ");
		String nivel = entraDedados.nextLine();
		
		System.out.println("Qual a base salarial Do funcionario: ");
		double baseSalarial= entraDedados.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeFuncionario, Level.valueOf(nivel), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos Contratos ele vai ter ? ");
		int quantidadeContratos=entraDedados.nextInt();
		
		for(int i = 0 ; i<quantidadeContratos;i++) {
			System.out.println("Digite o contrato #"+(i+1));
			System.out.println("Ditige o ano: ");
			int ano= entraDedados.nextInt();
			
			System.out.println("Digite o mes: ");
			int mes= entraDedados.nextInt();
			
			System.out.println("Digite o dia: ");
			int dia= entraDedados.nextInt();
			
			System.out.println("Digite  a quantidade horas: ");
			int horas= entraDedados.nextInt();
			
			System.out.println("Valor da hora: ");
			double valorHorario= entraDedados.nextDouble();
			
			Contratos contratos = new Contratos(valorHorario, horas);
			contratos.setDate(dia, mes, ano);
			
			funcionario.adcionaContratos(contratos);
			
			
			
		}
		
		System.out.println("Qual o ano do contrato?");
		int ano=entraDedados.nextInt();
		
		System.out.println("Qual o mes ? ");
		int mes = entraDedados.nextInt();
		
		System.out.println("nome do funcionario: "+ funcionario.getNome());
		System.out.println("nome do departamento: "+ funcionario.getDepartamento());
		System.out.println("valor recebido do mes: "+ funcionario.salarioTotal(ano, mes));
		entraDedados.close();

		
		
	}

}
