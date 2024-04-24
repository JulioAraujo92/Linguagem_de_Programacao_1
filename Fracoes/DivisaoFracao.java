import java.util.Scanner;

public class DivisaoFracao {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite a primeira fração:");
        Fracao fracao1 = lerFracao();

        System.out.println("Digite a segunda fração:");
        Fracao fracao2 = lerFracao();

        Fracao divisao = fracao1.dividir(fracao2);

        divisao.simplificar();

        System.out.println("A divisão das frações é: " + divisao);
    }

    public static Fracao lerFracao() {
        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();
        return new Fracao(numerador, denominador);
    }

    static class Fracao {
        private int numerador;
        private int denominador;

        public Fracao(int numerador, int denominador) {
            this.numerador = numerador;
            this.denominador = denominador;
        }

        public Fracao dividir(Fracao outra) {
            int novoNumerador = this.numerador * outra.denominador;
            int novoDenominador = this.denominador * outra.numerador;
            return new Fracao(novoNumerador, novoDenominador);
        }

        public void simplificar() {
            int gcd = gcd(numerador, denominador);
            numerador /= gcd;
            denominador /= gcd;
        }

        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return gcd(b, a % b);
            }
        }

        @Override
        public String toString() {
            return numerador + "/" + denominador;
        }
    }
}
