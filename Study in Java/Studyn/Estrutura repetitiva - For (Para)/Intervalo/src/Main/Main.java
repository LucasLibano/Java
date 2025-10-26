package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int x,n,i;
		int dentro = 0, fora =0;
		
		
		n = sc.nextInt();
		
		for(i=0;i < n ;i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
				
			}
		}
		
		System.out.printf("Dentro do valor: %d.\n", dentro);
		System.out.printf("Fora do valor: %d.", fora);
		
		
		sc.close();

	}
	
	

}
