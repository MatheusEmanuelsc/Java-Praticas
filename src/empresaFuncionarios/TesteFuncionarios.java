package empresaFuncionarios;

import java.util.Scanner;

public class TesteFuncionarios {
	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("Quantas pessoas vc deseja cadastrar?");
		int numeroDepessoas = entradaDeDados.nextInt();
		Funcionarios[] quantidadePessoas = new Funcionarios[numeroDepessoas];

		for (int i = 0; i < quantidadePessoas.length; i++) {
			entradaDeDados.nextLine();
			System.out.println("E funcionario terceirizado? Y / N");
			String func = entradaDeDados.nextLine();

			if (func.equalsIgnoreCase("y") || func.equalsIgnoreCase("n")) {
				System.out.println("digite o nome");
				String nome = entradaDeDados.nextLine();

				System.out.println("digite quantidade horas");
				int horas = entradaDeDados.nextInt();

				System.out.println("digite o valor por hora");
				double valorHora = entradaDeDados.nextDouble();

				if (func.equalsIgnoreCase("y")) {

					System.out.println("digite o valor adcional");
					double valorAdcional = entradaDeDados.nextDouble();

					quantidadePessoas[i] = new FuncionariosTerceirizados(nome, horas, valorHora, valorAdcional);

				} else {
					quantidadePessoas[i] = new Funcionarios(nome, horas, valorHora);
				}
			} else {
				System.out.println("letra invalida!!!");
				System.out.println("digite novamente Y ou N");
				i--;
			}
		}

		entradaDeDados.close();
		System.out.println("Pagamentos");
		for (Funcionarios funcionarios : quantidadePessoas) {
			System.out.println(funcionarios.getName() + "- $" + funcionarios.pagamento());
		}
	}
}
