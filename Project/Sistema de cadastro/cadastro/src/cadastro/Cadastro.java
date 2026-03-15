package cadastro;

import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    public String usuario,aluno,turma;
    public int senha,nota;


public void CadastrarAluno(){

    System.out.println("Cadastrar aluno");
    aluno = sc.nextLine();

    System.out.println("");

    System.out.println("Digite a turma do aluno");
    turma = sc.nextLine();

    System.out.println("");

    System.out.println("Digite a nota do Aluno");
    nota = sc.nextInt();
    sc.nextLine();

    System.out.println("Aluno cadastrado com sucesso");
}

public void EditarAluno() {
    int opcao_editar;

    System.out.println("Editar Aluno\n");

    System.out.printf("\nAlunos cadastrados: %s\nTurma: %s\n Nota: %d\n", aluno,turma,nota);

    System.out.println("1 - Editar nome");
    System.out.println("2 - Editar turma");
    System.out.println("3 - Editar nota");
    opcao_editar = sc.nextInt();
    sc.nextLine();

    String aluno_editar;


    switch (opcao_editar) {

        case 1:
            System.out.println("1 - Digite um novo nome: ");
            aluno = sc.nextLine();
            System.out.printf("Novo nome atualizado com sucesso %s\n", aluno);
            break;

        case 2:
            System.out.printf("2 - Digite uma Turma: %s \n", turma);
            turma = sc.nextLine();
            System.out.printf("Novo turma atualizado com sucesso: %s\n", turma);
            break;

        case 3:
            System.out.printf("2 - Digite uma nota: %d\n", nota);
            nota = sc.nextInt();
            System.out.printf("2 - Nova nota atualizada com sucesso: %d\n", nota);
            break;

        default:
            System.out.printf("Opcao invalida");


    }

}

    public void MostrarAluno(){


            System.out.println("Mostrar aluno");
            System.out.printf("\nAluno: %s", aluno);
            System.out.printf("\nTurma: %s", turma);
            System.out.printf("\nNota: %d\n", nota);

    }

    public void SairPrograma(){

        System.out.println ("Saindo do Edu School...");
        sc.close();

    }
}








