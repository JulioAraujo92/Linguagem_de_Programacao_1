public class Headset {
    private String cor;
    private String modelo;
    private boolean ligado;
    private boolean tocando;

    public Headset(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
        this.ligado = false; // Inicialmente, o headset está desligado
        this.tocando = false; // Inicialmente, o headset não está tocando
    }

    public void status() {
        String estadoLigado = ligado ? "ligado" : "desligado";
        String estadoTocando = tocando ? "tocando" : "parado";
        System.out.println("Cor do headset: " + cor);
        System.out.println("Modelo do headset: " + modelo);
        System.out.println("O headset está " + estadoLigado);
        System.out.println("O headset está " + estadoTocando);
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ligando o headset...");
        } else {
            System.out.println("O headset já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            tocando = false; // Se desligar o headset, ele para de tocar automaticamente
            System.out.println("Desligando o headset...");
        } else {
            System.out.println("O headset já está desligado!");
        }
    }

    public void tocar() {
        if (ligado && !tocando) {
            tocando = true;
            System.out.println("Iniciando a reprodução de áudio...");
        } else if (!ligado) {
            System.out.println("O headset está desligado, não é possível reproduzir áudio!");
        } else {
            System.out.println("O áudio já está sendo reproduzido!");
        }
    }
}
