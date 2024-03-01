//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

import java.util.Scanner;

public class ResultadoEleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        
        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;
        
        System.out.println("\nResultados da Eleição:");
        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        
        scanner.close();
    }
}

