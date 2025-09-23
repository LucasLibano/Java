package eixos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		System.out.printf("Digite o valor de X: ");
		x = sc.nextDouble();
		
		System.out.printf("Digite o valor de y: ");
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.printf("Origem\n");			
		} else if (x == 0.0) {
			System.out.printf("Eixo Y\n");
		} else if (x > 0.0 && y > 0.0) {
			System.out.printf("Q1\n");
		} else if ( x < 0.0 && y < 0.0) {
			System.out.printf("Q3\n");
		} else {
			System.out.printf("Q4\n");
		}
		
		sc.close();
		

	}

}
