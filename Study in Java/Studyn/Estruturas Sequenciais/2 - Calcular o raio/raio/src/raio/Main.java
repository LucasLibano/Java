package raio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	double raio,area;
	double pi = 3.14159;
	
	
	System.out.printf("Digite um numero: \n");
	raio = sc.nextDouble();
	
	area = pi * raio * raio; 
	
	System.out.printf("A = %.4f", area);
	
	sc.close();

	}

}
