import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n,i;

        System.out.println("Quantos numeros vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];

        for(i = 0; i < vect.length;i++){
            System.out.printf("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for(i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                    System.out.println("Numero negativo: "+ vect[i]);

            }
        }





        sc.close();
    }
}