//Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).


import java.util.Scanner;

public class VerificacaoVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você poderá votar este ano.");
        } else {
            System.out.println("Você não poderá votar este ano.");
        }

        scanner.close();
    }
}
