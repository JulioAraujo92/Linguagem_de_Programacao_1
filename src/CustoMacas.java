//As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;
public class CustoMacas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o número de maças compradas: ");
        int quantidade = scanner.nextInt();

        double custoTotal;

        if (quantidade < 12) {
            custoTotal = quantidade * 1.30;
        } else {
            custoTotal = quantidade * 1.00;
        }
    
        System.out.println("O custo total da compra é: R$ " + custoTotal);

        scanner.close();
    }


}
