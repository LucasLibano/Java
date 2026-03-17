import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        double[] n1 = new double[n];
        double[] n2 = new double[n];

        for(i = 0; i < n; i++){
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for(i = 0; i < n; i++){
            double media = (n1[i] + n2[i]) / 2;
            if(media >= 6.0){
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}