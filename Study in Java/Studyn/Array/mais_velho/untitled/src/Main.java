import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, pos = 0;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for(i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maior = idades[0];

        for(i = 1; i < n; i++){
            if(idades[i] > maior){
                maior = idades[i];
                pos = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[pos]);

        sc.close();
    }
}