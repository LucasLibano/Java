package combustivel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int codigo;
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while (true) {
			codigo = sc.nextInt();
		
			if(codigo == 4) {
				break;
			}
			
			switch (codigo) {
			case 1:
			alcool++;
			break;
			
			case 2:
			gasolina++;
			break;
			
			case 3:
			diesel++;
			break;
			
			default:
			break;
				
				
			}
		}
		
		System.out.println("Muito obrigado");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
		
		
		
		sc.close();

	
	}
}
