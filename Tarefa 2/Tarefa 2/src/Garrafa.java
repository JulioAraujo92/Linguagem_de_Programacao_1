public class Garrafa {
    private String bebida;
    private boolean aberta;

    public Garrafa(String bebida) {
        this.bebida = bebida;
        this.aberta = false; // Inicialmente, a garrafa está fechada
    }

    public void status() {
        String estado = aberta ? "aberta" : "fechada";
        System.out.println("A garrafa contém " + bebida);
        System.out.println("A garrafa está " + estado);
    }

    public void colocar() {
        if (!aberta) {
            aberta = true;
            System.out.println("Colocando " + bebida + " na garrafa...");
        } else {
            System.out.println("A garrafa já está aberta, não é possível colocar mais " + bebida + ".");
        }
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("Abrindo a garrafa...");
        } else {
            System.out.println("A garrafa já está aberta!");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("Fechando a garrafa...");
        } else {
            System.out.println("A garrafa já está fechada!");
        }
    }
}
