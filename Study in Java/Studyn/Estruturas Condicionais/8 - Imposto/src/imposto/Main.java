package imposto;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario,imposto = 0.0;
		
		System.out.printf("Digite o salario: R$ ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			System.out.printf("Isento");
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("R$ %.2f\n", imposto);
		} else if (salario <= 4500.0){
			imposto = 1000.0 *0.08 + (salario - 3000.0) * 0.18;
			System.out.printf("R$ %.2f\n", imposto);
		} else {
			imposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
			
			System.out.printf("R$ %.2f\n", imposto);
		}
		
		
		
		sc.close();
	}
	
	

}
