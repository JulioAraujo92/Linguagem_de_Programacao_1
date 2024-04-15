public class Controle {
    private String marca;
    private int pilhas;
    private boolean ligado;

    public Controle(String marca, int pilhas) {
        this.marca = marca;
        this.pilhas = pilhas;
        this.ligado = false; // Inicialmente, o controle está desligado
    }

    public void status() {
        String estadoLigado = ligado ? "ligado" : "desligado";
        System.out.println("Marca do controle: " + marca);
        System.out.println("Quantidade de pilhas: " + pilhas);
        System.out.println("O controle está " + estadoLigado);
    }

    public void ligar() {
        if (!ligado && pilhas > 0) {
            ligado = true;
            System.out.println("Ligando o controle...");
        } else if (ligado) {
            System.out.println("O controle já está ligado!");
        } else {
            System.out.println("O controle está sem pilhas e não pode ser ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Desligando o controle...");
        } else {
            System.out.println("O controle já está desligado!");
        }
    }

    public void troca() {
        if (ligado) {
            System.out.println("Trocando o canal...");
        } else {
            System.out.println("O controle está desligado, não é possível trocar de canal!");
        }
    }
}
