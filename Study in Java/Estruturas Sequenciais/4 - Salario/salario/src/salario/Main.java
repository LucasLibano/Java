package salario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	double salario, valor_horas, horas_trabalho;
	
	
	System.out.printf("Digite o valor por horas: \n");
	valor_horas = sc.nextDouble();
	
	System.out.printf("\n");
	
	System.out.printf("Digite as horas trabalhadas: \n");
	horas_trabalho = sc.nextDouble();
	
	System.out.printf("\n");
	
	salario = horas_trabalho * valor_horas;
	
	System.out.printf("Horas = %.2f\n", horas_trabalho);
	
	System.out.printf("Salario = %.2f\n", salario);
	
	sc.close();
	
	
	
	}

}
