//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

import java.util.Scanner;

public class SalarioMensal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário mensal: ");
        int salario = scanner.nextInt();

        System.out.print("Digite o percentual do reajuste: ");
        int reajuste = scanner.nextInt();

        double salarioReajustado = (double) (reajuste/100.0+1)*salario;
        
        System.out.printf("O seu salário é : %.2f", salarioReajustado);



        scanner.close();
    }
}
