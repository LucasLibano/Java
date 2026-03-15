package application;

import cadastro.Cadastro;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tentativas = 3, senha_login;
        String usuario_login;

        Cadastro cadastro = new Cadastro();

        System.out.println("Bem vindo ao sistema Edu School");
        System.out.println("\n");

        System.out.println("Realize o seu cadastro para continuar: ");
        System.out.println("\n");

        System.out.println("Crie um nome de usuario: ");
        cadastro.usuario = sc.nextLine();

        System.out.println("Crie uma senha: ");
        cadastro.senha = sc.nextInt();
        sc.nextLine();

        boolean loginSucesso = false;

        while (tentativas > 0) {
            System.out.println("Digite o usuario: ");
            usuario_login = sc.nextLine();

            System.out.println("Digite o senha: ");
            senha_login = sc.nextInt();
            sc.nextLine();

            if (cadastro.usuario.equals(usuario_login) && cadastro.senha == senha_login) {
                System.out.println(" Login realizado com sucesso");
                loginSucesso = true;
                break;

            }

            tentativas--;
            System.out.printf(" Tentativas restante: %d", tentativas);

        }

        if (!loginSucesso) {

            System.out.printf("Acesso Bloqueado");
            return;
        }

        //Menu

        boolean sair = true;

        while (sair){

            int opcao;

            System.out.println("Escola: Edu School");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Editar Aluno");
            System.out.println("3 - Mostrar aluno");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma das opcoes");

            opcao = sc.nextInt();


            switch(opcao){
                case 1:
                    cadastro.CadastrarAluno();
                    break;

                case 2:
                    cadastro.EditarAluno();
                    break;

                case 3:
                    cadastro.MostrarAluno();
                    break;

                case 4:
                    cadastro.SairPrograma();
                    sair = false;
                    break;

                default:

             System.out.println("Opcao invalida");
            }



        }
    }








    }


