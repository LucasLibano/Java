package codigo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, quantidade1, quantidade2;
		double valor1,valor2,total;
		
		System.out.println("Digite o codigo da peça 1: ");
		codigo1 = sc.nextInt();
		System.out.println("Digite a quantidade da peça 1: ");
		quantidade1 = sc.nextInt();
		System.out.println("Digite o valor unitario da peça 2: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça: ");
		codigo2 = sc.nextInt();
		System.out.println("Digite a quantidade da peça 2: ");
		quantidade2 = sc.nextInt();
		System.out.println("Digite o Valor unitario da peça 1: ");
		valor2 = sc.nextDouble();
		
		total = (quantidade1 * valor1) + (quantidade2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f\n", total);
		
		sc.close();
		
	}

}
