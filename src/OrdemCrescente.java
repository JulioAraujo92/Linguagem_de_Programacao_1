//Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 


import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        double menor, maior;

        // Determinando o menor e o maior valor
        if (valor1 < valor2) {
            menor = valor1;
            maior = valor2;
        } else {
            menor = valor2;
            maior = valor1;
        }

        System.out.println("Os valores em ordem crescente são: " + menor + ", " + maior);

        scanner.close();
    }
}

