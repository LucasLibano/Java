package media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidades,i;
		
		double a,b,c,media;
		
		quantidades = sc.nextInt();
		
		for (i = 0; i < quantidades; i++) {
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = (a*2.0 + b*3.0 + c*5.0) / 10.0;
		
		System.out.printf("%1.f", media);
		}

		sc.close();

	}

}
