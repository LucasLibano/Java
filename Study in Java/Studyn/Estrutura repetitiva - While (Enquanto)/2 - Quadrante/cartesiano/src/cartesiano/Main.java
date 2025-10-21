package cartesiano;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int x,y;
	
	System.out.printf("Digite um numero para X: ");
	x = sc.nextInt();
	
	System.out.printf("\n");
	
	System.out.printf("Digite um numero para Y: ");
	y = sc.nextInt();
	
	while (x != 0 && y != 0) {
		if (x > 0 && y > 0) {
			System.out.println("Primeiro");	
			break;
	} else if (x < 0 && y < 0) {
		System.out.println("Segundo");
		break;
	} else if (x < 0 && y < 0) {
		System.out.println("Terceiro.");
		break;
	} else {
		System.out.println("Quarto");
		break;
	}
		
	}
	
	
	sc.close();
	
	}

}
