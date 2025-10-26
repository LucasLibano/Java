package Main;

import java .util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int i;
		double a,b;
		
		for(i = 0; i <numero;i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if ( b == 0) {
				System.out.printf("Divisão impossivel\n");
			} else {
				System.out.printf("%.1f\n", a / b);
				
			}
			
		}
		
		sc.close();
		
		
		
		

	}

}
