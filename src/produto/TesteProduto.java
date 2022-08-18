package produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner (System.in);
		System.out.println("Quantos produtos pretende cadastrar? ");
		int numero= entradaDeDados.nextInt();
		List<Produto> produtos = new ArrayList<>();
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Qual e o tipo de produto?");
			System.out.println("Digite 'i' para importado");
			System.out.println("Digite'c' para comum");
			System.out.println("Digite 'u' usado");
			entradaDeDados.nextLine();
			String tipoProduto =entradaDeDados.nextLine();
			if (tipoProduto.equalsIgnoreCase("i")|| tipoProduto.equalsIgnoreCase("c") || tipoProduto.equalsIgnoreCase("u")) {
				
				System.out.println("Escreva o nome do produto: ");
				String nome = entradaDeDados.nextLine();
				
				System.out.println("Digite o preço do produto: ");
				double preco = entradaDeDados.nextDouble();
				
				
				if (tipoProduto.equalsIgnoreCase("i")) {
					
					System.out.println("Digite o custo  De importação do produto");
					double custoDeImportacao=entradaDeDados.nextDouble();
					
					produtos.add( new ProdutoImportado(nome, preco, custoDeImportacao));
					
				} else if (tipoProduto.equalsIgnoreCase("u")){
					System.out.println("digite o ano de fabricacação");
					int ano= entradaDeDados.nextInt();
					
					System.out.println("digite o mes de fabricacação");
					int mes= entradaDeDados.nextInt();
					
					System.out.println("digite o dia de fabricacação");
					int dia= entradaDeDados.nextInt();
					
					produtos.add(new ProdutoUsado(nome, preco, ano, mes, dia)) ;
				
				}else {
					produtos.add( new Produto(nome, preco));
				}
			} else {
				System.out.println("Letra invalida!!!");
				System.out.println("Digite 'i' para importado");
				System.out.println("Digite'c' para comum");
				System.out.println("Digite 'u' usado");
				System.out.println("tente novamente");
				i--;
			}
		}
		
		entradaDeDados.close();
		for (Produto produto : produtos) {
			System.out.println(produto.precoTag());
		}
	}

}
