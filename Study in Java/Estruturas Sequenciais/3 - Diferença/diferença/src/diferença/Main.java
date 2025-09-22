package diferença;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,num4,diferenca;
		
		System.out.printf("Digite um numero: \n");
		num1 = sc.nextInt();
		
		System.out.printf("Digite o segundo numero; \n");
		num2 = sc.nextInt();
		
		System.out.printf("Digite o terceiro numero: \n");
		num3 = sc.nextInt();
		
		System.out.printf("Digite o quarto numero: \n");
		num4 = sc.nextInt();
		
		diferenca = num1*num2-num3*num4;
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();
		
		

	}

}
