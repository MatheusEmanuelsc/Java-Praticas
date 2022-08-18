package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBanco {
	public static void main(String[] args) {
		
	Scanner entraDedados= new Scanner(System.in);
	List <Conta>lista = new ArrayList<>();
	
	System.out.println("Digite  quantas pessoas vocẽ pretende cadastrar");
	int quantidadePessoas= entraDedados.nextInt();
	
	for (int i = 0; i < quantidadePessoas; i++) {
		entraDedados.nextLine();
		System.out.println("Qual Tipo de conta vocẽ Deseja abrir:");
		System.out.println("Digite 'J' para Juridica");
		System.out.println("Digite 'F' Para Fisica");
		String tipo = entraDedados.nextLine();
		
		System.out.println("Qual o nome? ");
		String nome=entraDedados.nextLine();
		
		System.out.println("Qual renda anual? ");
		double rendaAnual= entraDedados.nextDouble();
		
		
		if (tipo.equalsIgnoreCase("j")) {
			System.out.println("Quantos Funcionarios? ");
			int numeroFuncionarios= entraDedados.nextInt();
			lista.add(new ContaPessoaJuridica(nome, rendaAnual, numeroFuncionarios));
		} else if(tipo.equalsIgnoreCase("f")){
			System.out.println("Qual o valor do gasto com saude?");
			double gastoComSaude= entraDedados.nextDouble();
			lista.add(new ContaPessoaFisica(nome, rendaAnual, gastoComSaude));
		}else {
			System.out.println("Letra incorreta!!!");
			i--;
		}
		
		
	}
	entraDedados.close();
	for (Conta conta : lista) {
		System.out.println(conta);
	}
	}
}
