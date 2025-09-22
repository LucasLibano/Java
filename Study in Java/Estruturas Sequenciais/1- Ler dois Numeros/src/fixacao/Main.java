package fixacao;

import java.util.Locale;

public class Main {
	
public static void main(String[] args) {
String produto1 = "computador";
String produto2 = "mesa escritorio";

int idade = 30;
int codigo = 5290;
char genero = 'F';

double preco1 = 2100.0;
double preco2 = 650.50;
double medir = 53.234567;

System.out.println("Produtos: ");
System.out.printf("%s, O preco e:R$ %.2f\n", produto1, preco1);
System.out.printf("%s, O preco e:R$ %.2f\n", produto2, preco2);
System.out.printf("Registro: %d anos de idade, codigo %d e genero %c\n", idade, codigo, genero);
System.out.printf("%.8f\n", medir);
System.out.printf("%.3f\n", medir);

Locale.setDefault(Locale.US);
System.out.printf("%.3f\n", medir);



		
}

}
