package aplicacao;

import java.util.Scanner;
import entidade.aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		entidade.aluno aluno = new aluno();
		
		System.out.printf("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.printf("Digite as três notas do aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println(" Reprovado");
			System.out.printf("Faltaram %.2f pontos", aluno.pontosFaltando());
		} else {
			System.out.println(" Aprovado");
		}
		
		
		sc.close();
		 

	}

}
