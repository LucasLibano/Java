package intervalos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
	double numero;
	
	System.out.printf("Digite um numero: \n");
	numero = sc.nextDouble();
	
	if (numero < 0 || numero > 100) {
		System.out.printf("Fora do intervalo");
	} else if (numero <= 25.0) {
		System.out.printf("Dentro do intervalo: 0,25");
	} else if (numero <= 50.0) {
		System.out.printf("Dentro do intervalo: 25.50");
	} else if (numero <= 75.0) {
		System.out.printf("Dentro do intervalo: 50,75");
    } else {
	System.out.printf("Dentro do intervalo: 75,100");
	
    }
	
	sc.close();
	
	}
}
