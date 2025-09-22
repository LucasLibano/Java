package valores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;
		double pi = 3.14159;
		
		System.out.printf("Digite um valor de A: ");
		A = sc.nextDouble();
		
		System.out.printf("Digite um valor de B: ");
		B = sc.nextDouble();
		
		System.out.printf("Digite um valor de C: ");
		C = sc.nextDouble();
		
		triangulo = (A*C) / 2.0;
		circulo = pi*C*C;
		trapezio = ((A+B)*C) / 2.0;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("Triangulo: %.3f\n", triangulo);
		System.out.printf("Circulo: %.3f\n", circulo);
		System.out.printf("Trapezio: %.3f\n", trapezio);
		System.out.printf("Quadrado: %.3f\n", quadrado);
		System.out.printf("Retangulo: %.3f\n", retangulo);
		
		sc.close();
		
		
		
		
		
	}

}
