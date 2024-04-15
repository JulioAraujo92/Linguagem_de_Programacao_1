public class Tenis {
    private String tipoSola;
    private String corCadarco;
    private boolean amarrado;

    public Tenis(String tipoSola, String corCadarco) {
        this.tipoSola = tipoSola;
        this.corCadarco = corCadarco;
        this.amarrado = true; // Inicialmente, o tênis está amarrado
    }

    public void status() {
        String estado = amarrado ? "amarrado" : "desamarrado";
        System.out.println("O tipo de sola do tênis é " + tipoSola);
        System.out.println("A cor do cadarço do tênis é " + corCadarco);
        System.out.println("O tênis está " + estado);
    }

    public void amarrar() {
        if (!amarrado) {
            amarrado = true;
            System.out.println("Amarrando o tênis...");
        } else {
            System.out.println("O tênis já está amarrado!");
        }
    }

    public void desamarrar() {
        if (amarrado) {
            amarrado = false;
            System.out.println("Desamarrando o tênis...");
        } else {
            System.out.println("O tênis já está desamarrado!");
        }
    }
}
