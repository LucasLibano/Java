package retangulo;

import java.util.Scanner;

import entidade.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        
        if (areaX > areaY) {
        	System.out.println("Maior area: Triangulo X");
        } else {
        	System.out.println("Maior area: Triangulo Y");
        }
        
        sc.close();
		
		
		

	}

}
