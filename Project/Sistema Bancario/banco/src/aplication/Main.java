package aplication;

import banco.Banco;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banco banco = new Banco();

        System.out.print("Entre com o numero da sua conta: ");
        banco.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.print("Entre com o nome do titular da conta: ");
        banco.setTitular(sc.nextLine());

        System.out.print("É depósito inicial? (s/n): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Digite o valor do depósito: R$ ");
            banco.depositar(sc.nextDouble());
        } else {
            banco.depositar(0);
            System.out.println("O seu saldo inicial é R$ 0");
        }

        boolean menu = true;

        while (menu) {

            System.out.println("\nNúmero da conta: " + banco.getNumero() + " | Titular: " + banco.getTitular());
            System.out.println("Saldo: R$ " + banco.getSaldo());
            System.out.println("1 - Depósito");
            System.out.println("2 - Sacar");
            System.out.println("3 - Calcular saldo com taxa");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quanto deseja depositar? R$ ");
                    double deposito = sc.nextDouble();
                    banco.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 2:
                    System.out.print("Quanto deseja sacar? R$ ");
                    double saque = sc.nextDouble();
                    if (saque > banco.getSaldo()) {
                        System.out.println("Saldo insuficiente! Tente novamente.");
                    } else {
                        banco.sacar(saque);
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Saldo com taxa de 5%: R$ " + banco.calcularTaxa());
                    break;

                case 4:
                    menu = false;
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
