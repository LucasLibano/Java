import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i, cont = 0;
        double soma = 0.0, media, porcentagem;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            soma += alturas[i];

            if(idades[i] < 16){
                cont++;
            }
        }

        media = soma / n;
        porcentagem = (double) cont * 100 / n;

        System.out.printf("Altura media: %.2f\n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

        for(i = 0; i < n; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}