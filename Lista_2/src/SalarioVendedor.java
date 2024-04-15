
//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();
        
        System.out.print("Digite o valor total de vendas: ");
        double valorTotalVendas = scanner.nextDouble();
        
        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();
        

        double comissaoFixaPorCarro = numCarrosVendidos * valorPorCarro;
        double comissaoPorVendas = valorTotalVendas * 0.05; 
        double salarioFinal = salarioFixo + comissaoFixaPorCarro + comissaoPorVendas;
        

        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);
        
        scanner.close();
    }
}
