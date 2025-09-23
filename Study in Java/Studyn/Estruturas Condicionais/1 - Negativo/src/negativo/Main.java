package negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Digite um numero: \n");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Numero positivo. ");
			
		} else if (numero < 0) {
			System.out.println("Numero negativo.");
			
		} else if (numero == 0){
			System.out.println("Numero neutro.");
			
		} else {
			
			System.out.println("Operação Invalida, tente novamente.");
			
		}
		
		sc.close();
		

	}

}
