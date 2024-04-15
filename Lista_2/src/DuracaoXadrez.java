//Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.


import java.util.Scanner;

public class DuracaoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo:");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora de fim do jogo:");
        int horaFim = scanner.nextInt();

        int duracao;

        // Verificando se o jogo ultrapassa a meia-noite
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo foi de " + duracao + " horas.");

        scanner.close();
    }
}
