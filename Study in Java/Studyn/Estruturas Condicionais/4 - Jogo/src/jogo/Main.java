package jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	
	int horas,jogo,duracao;
	
	
	System.out.printf("Digite a hora inicial: \n");
	horas = sc.nextInt();
	
	System.out.printf("Digite a hora final: \n");
	jogo = sc.nextInt();
	
	duracao = (horas-jogo+24) % 24;
	
	if (duracao == 0) {
		duracao = 24;
		
	} 
	
	System.out.printf("O JOGO DUROU: %d(S) HORAS\n", duracao);
	
	sc.close();
}
	
}
