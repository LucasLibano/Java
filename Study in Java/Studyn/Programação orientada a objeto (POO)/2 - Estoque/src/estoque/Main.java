package estoque;

import java.util.Scanner;
import entidade.produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		entidade.produto produto = new produto();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.printf("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto:" + produto);
		
		System.out.println();
		System.out.printf("Quantidade de produtos a ser adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualização do estoque: " + produto);
		
		System.out.println();
		System.out.printf("Quantidade de produtos a ser removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.printf("Atualização do estoque: " + produto);

		
		sc.close();
			

		
	}

}
