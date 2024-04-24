import java.util.Scanner;

public class SomarFracao {
    // Cria um objeto Scanner para ler a entrada do usuário
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Solicita ao usuário que insira a primeira fração
        System.out.println("Digite a primeira fração:");
        Fracao fracao1 = lerFracao();

        // Solicita ao usuário que insira a segunda fração
        System.out.println("Digite a segunda fração:");
        Fracao fracao2 = lerFracao();

        // Soma a primeira fração com a segunda
        Fracao resultado = fracao1.somar(fracao2);

        // Simplifica a fração resultante
        resultado.simplificar();

        // Exibe a fração resultante
        System.out.println("A soma das frações é: " + resultado);
    }

    // Método para ler uma fração do usuário
    public static Fracao lerFracao() {
        // Solicita ao usuário que insira o numerador
        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();

        // Solicita ao usuário que insira o denominador
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        // Retorna uma nova instância de Fracao com o numerador e o denominador fornecidos
        return new Fracao(numerador, denominador);
    }

    // Classe interna para representar uma fração
    static class Fracao {
        private int numerador;
        private int denominador;

        // Construtor para criar uma nova fração com o numerador e o denominador fornecidos
        public Fracao(int numerador, int denominador) {
            this.numerador = numerador;
            this.denominador = denominador;
        }

        // Método para somar esta fração com outra fração
        public Fracao somar(Fracao outra) {
            // O numerador da fração resultante é a soma dos produtos do numerador desta fração e do denominador da outra fração e do numerador da outra fração e do denominador desta fração
            int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
            // O denominador da fração resultante é o produto dos denominadores das duas frações
            int novoDenominador = this.denominador * outra.denominador;
            // Retorna uma nova fração com o numerador e o denominador calculados
            return new Fracao(novoNumerador, novoDenominador);
        }

        // Método para simplificar a fração
        public void simplificar() {
            // Calcula o máximo divisor comum (gcd) do numerador e do denominador
            int gcd = gcd(numerador, denominador);
            // Divide o numerador e o denominador pelo gcd para simplificar a fração
            numerador /= gcd;
            denominador /= gcd;
        }

        // Método para calcular o máximo divisor comum (gcd) de dois números
        private int gcd(int a, int b) {
            // Se b é 0, a é o gcd
            if (b == 0) {
                return a;
            } else {
                // Caso contrário, calcula o gcd de b e o resto da divisão de a por b
                return gcd(b, a % b);
            }
        }

        // Método para converter a fração em uma string
        @Override
        public String toString() {
            // Retorna a fração como uma string no formato "numerador/denominador"
            return numerador + "/" + denominador;
        }
    }
}