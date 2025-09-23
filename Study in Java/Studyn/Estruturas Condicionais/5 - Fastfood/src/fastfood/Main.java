package fastfood;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int codigo,quantidade;
	double total;
	
	System.out.printf("--- Fastfood do bidu --- \n");
	System.out.printf("--- CARDAPIO --- \n");
	System.out.printf("Codigo |  Produto | Valor");
	System.out.printf("\n");
	System.out.printf("1 | Cachorro quente | R$ 4,00 \n");
	System.out.printf("2 | X-Salada | R$ 4,50\n" );
	System.out.printf("3 | X-Bacon | R$ 5,00 \n");
	System.out.printf("4 | Torrada simples | R$ 2,00 \n");
	System.out.printf("5 | Refrigerante | R$ 1.50\n");
	System.out.printf("\n");
	
	System.out.printf("Digite o codigo do produto: \n");
	codigo = sc.nextInt();
	
	System.out.printf("Digite a quantidade do produto: \n");
	quantidade = sc.nextInt();
	
	if(codigo == 1) {
		total = 4.00 * quantidade;
	System.out.printf("Total: R$ %.2f", total);
	} else if (codigo == 2) {
		total = 4.50 * quantidade;
	System.out.printf("Total: R$ %.2f", total);
	} else if (codigo == 3) {
		total = 5.00 * quantidade;
	System.out.printf("Total: R$ %.2f", total);
	} else if (codigo == 4) {
		total = 2.00 * quantidade;
	System.out.printf("Total: R$ %.2f", total);
	} else if (codigo == 5) {
		total = 1.50 * quantidade;
		System.out.printf("Total: R$ %.2f", total);
	} else {
		System.out.printf("Operação invalida");
	}
	
	sc.close();
	
	
	

	}

}
