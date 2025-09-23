package multiplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0) {
		System.out.printf("Numero multiplo.");
		
		} else if (num2 % num1 == 0) {
			System.out.printf("Numero multiplo.");
		} else {
			
			System.out.printf("Não multiplo.");
		}
		
		sc.close();
		
		} 
		
		

	}
