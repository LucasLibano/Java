import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  soma = 0.0;
        double media;
        int i,n;

        System.out.println("Quantos numeros vai digitar? ");
        n = sc.nextInt();

        double[] vet = new double[n];

        for(i = 0;i < n; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();

            soma += vet[i];

        }

        media = soma / n;

        System.out.printf("" );
        for(i=0;i<n;i++){
            System.out.printf(vet[i] + " Valores: ");
        }

        System.out.printf("\n" );

        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("\n");
        System.out.printf("Media = %.2f\n",  media);

        sc.close();










    }
}