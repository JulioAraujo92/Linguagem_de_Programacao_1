//Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

import java.util.Scanner;


public class Nota {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("A média do aluno é: "+media+". O aluno foi aprovado");
        } else {
            System.out.println("A média do aluno é: "+media+ ". O aluno não foi aprovado.");
        }

        scanner.close();

    }
}
