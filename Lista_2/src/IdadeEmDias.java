//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade da pessoa em anos, meses e dias:");
        System.out.print("Anos: ");
        int anos = scanner.nextInt();
        System.out.print("Meses: ");
        int meses = scanner.nextInt();
        System.out.print("Dias: ");
        int dias = scanner.nextInt();
        
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("A idade da pessoa em dias é: " + idadeEmDias + " dias");
        
        scanner.close();
    }
}
