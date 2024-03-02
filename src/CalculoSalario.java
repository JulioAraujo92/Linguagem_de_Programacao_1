//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 


import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número de horas trabalhadas em um mês:");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Digite o salário por hora:");
        double salarioPorHora = scanner.nextDouble();


        final int horasSemana = 40;
        final int semanasMes = 4;
        final double horaExtra = salarioPorHora * 1.5;


        double horasExtras = Math.max(0, horasTrabalhadas - (horasSemana * semanasMes));

        double salarioTotal = (horasSemana * semanasMes * salarioPorHora) + (horasExtras * horaExtra);

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }
}
