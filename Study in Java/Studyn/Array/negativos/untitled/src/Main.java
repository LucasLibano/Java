import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i, cont = 0;
        double soma = 0.0, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int[] vet = new int[n];

        for(i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();

            if(vet[i] % 2 == 0){
                soma += vet[i];
                cont++;
            }
        }

        if(cont == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            media = soma / cont;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

        sc.close();
    }
}