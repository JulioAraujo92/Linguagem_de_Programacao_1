
public class Ex2_1 {
    public static void main(String[] args) {
        int gastoJan = 15000;
        int gastoFev = 23000;
        int gastoMar = 17000;

        int gastoTotalTrimestre = gastoJan + gastoFev + gastoMar;

        double mediaMensal = gastoTotalTrimestre / 3.0;

        // Imprime os resultados
        System.out.printf("Gasto trimestre: " + gastoTotalTrimestre + " reais\n"+"Média trimestre: "+mediaMensal + " reais");

}
}

