public class Caneta {
    private String marca;
    private String cor;
    private boolean tampada;

    public Caneta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.tampada = true; // Inicialmente, a caneta está tampada
    }

    public void status() {
        String estado = tampada ? "tampada" : "destampada";
        System.out.println("A marca da caneta é " + marca);
        System.out.println("A cor da caneta é " + cor);
        System.out.println("A caneta está " + estado);
    }

    public void destampar() {
        if (tampada) {
            tampada = false;
            System.out.println("Destampando a caneta...");
        } else {
            System.out.println("A caneta já está destampada!");
        }
    }

    public void tampar() {
        if (!tampada) {
            tampada = true;
            System.out.println("Tampando a caneta...");
        } else {
            System.out.println("A caneta já está tampada!");
        }
    }
}
