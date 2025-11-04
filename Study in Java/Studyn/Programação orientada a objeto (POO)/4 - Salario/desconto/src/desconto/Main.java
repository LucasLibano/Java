package desconto;

import java.util.Scanner;
import entidade.dados;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		entidade.dados dados = new dados();
		
		
		System.out.printf("Digite o nome do cliente: ");
		dados.nome = sc.nextLine();
		System.out.printf("\n");
		
		System.out.printf("Digite o valor bruto do salario: ");
		dados.salario = sc.nextDouble();
		System.out.printf("\n");
		
		System.out.printf("Digite o valor do imposto:R$");
		double imposto = sc.nextDouble();
		dados.salarioDesconto(imposto);
		System.out.printf("\n");
		
		System.out.printf("Dados: " + dados);
		
		System.out.printf("\n");
		
		System.out.printf("Digite a porcentagem de aumento salarial:" );
		double aumento = sc.nextDouble();
		dados.salarioAumento(aumento);
		System.out.printf("\n");
		
		System.out.printf("Dados atualizados: " + dados);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
