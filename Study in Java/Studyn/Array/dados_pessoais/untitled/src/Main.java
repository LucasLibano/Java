import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, i, contM = 0, contF = 0;
        double somaF = 0.0;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for(i = 0; i < n; i++){
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            altura[i] = sc.nextDouble();

            System.out.print("Genero da " + (i+1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        double menor = altura[0];
        double maior = altura[0];

        for(i = 1; i < n; i++){
            if(altura[i] < menor){
                menor = altura[i];
            }
            if(altura[i] > maior){
                maior = altura[i];
            }
        }

        for(i = 0; i < n; i++){
            if(genero[i] == 'F'){
                somaF += altura[i];
                contF++;
            } else {
                contM++;
            }
        }

        double mediaF = somaF / contF;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaF);
        System.out.println("Numero de homens = " + contM);

        sc.close();
    }
}