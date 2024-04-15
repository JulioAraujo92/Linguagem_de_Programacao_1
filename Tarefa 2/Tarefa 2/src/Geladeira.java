public class Geladeira {
    private int capacidadeLitros;
    private int temperaturaAtual;
    private boolean aberta;
    private boolean resfriando;

    public Geladeira(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
        this.temperaturaAtual = 5; // Temperatura inicial em graus Celsius
        this.aberta = false; // Inicialmente, a geladeira está fechada
        this.resfriando = false; // Inicialmente, a geladeira não está resfriando
    }

    public void status() {
        String estadoPorta = aberta ? "aberta" : "fechada";
        String estadoResfriamento = resfriando ? "resfriando" : "não resfriando";
        System.out.println("Capacidade da geladeira: " + capacidadeLitros + " litros");
        System.out.println("Temperatura atual: " + temperaturaAtual + "°C");
        System.out.println("A geladeira está " + estadoPorta);
        System.out.println("A geladeira está " + estadoResfriamento);
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("Abrindo a geladeira...");
        } else {
            System.out.println("A geladeira já está aberta!");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("Fechando a geladeira...");
        } else {
            System.out.println("A geladeira já está fechada!");
        }
    }

    public void ligarResfriamento() {
        if (!resfriando) {
            resfriando = true;
            System.out.println("Ligando o resfriamento da geladeira...");
        } else {
            System.out.println("O resfriamento já está ligado!");
        }
    }

    public void desligarResfriamento() {
        if (resfriando) {
            resfriando = false;
            System.out.println("Desligando o resfriamento da geladeira...");
        } else {
            System.out.println("O resfriamento já está desligado!");
        }
    }
}
