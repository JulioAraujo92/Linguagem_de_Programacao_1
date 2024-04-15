    import java.util.Scanner;
public class Ex2_2 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10P1: ");
        double p1 = scanner.nextDouble();
        System.out.print("E1: ");
        double e1 = scanner.nextDouble();
        System.out.print("E2: ");
        double e2 = scanner.nextDouble();
        System.out.print("API: ");
        double api = scanner.nextDouble();
        System.out.print("SUB: ");
        double sub = scanner.nextDouble();
        System.out.print("Extras: ");
        double ex = scanner.nextDouble();


        double notaFinal = 0.0;
        double primeiraParte = (p1 * 0.6 + ((e1 + e2) / 2) * 0.4) * 0.5;
        double segundaParte = Math.max(((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9), 0) / ((p1 * 0.6 + ((e1 + e2) / 2) * 0.4) - 5.9);
        notaFinal = primeiraParte + segundaParte * (api*0.5) + ex + (sub * 0.2);

        System.out.println("A nota final é: " + notaFinal);

        scanner.close();
}
}