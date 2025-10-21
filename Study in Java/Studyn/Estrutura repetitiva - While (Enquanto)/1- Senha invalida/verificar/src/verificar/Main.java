package verificar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	int senha;
	
	System.out.println("Digite a senha: ");
	
	senha = sc.nextInt();
	
	 while (senha != 2002) {
		System.out.printf("Senha incorreta, digite a senha novamente.\n");
		senha = sc.nextInt();
		
	}
	
	System.out.printf("Senha correta, bem vindo", senha);
	
	sc.close();
	

	}

}
