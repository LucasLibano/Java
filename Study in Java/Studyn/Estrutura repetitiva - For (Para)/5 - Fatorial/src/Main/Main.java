package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,i;
		int fatorial = 1;
		
		N = sc.nextInt();
		
		for (i= 2; i <= N; i++) {
			fatorial*=i;
		}
		
		System.out.printf("%d\n", fatorial);
		sc.close();
		
	}
	
	

}
