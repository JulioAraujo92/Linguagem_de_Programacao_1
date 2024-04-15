public class App {

    public static void main(String[] args) {
        // Criando uma instância de bicicleta
        Bicicleta bicicleta1 = new Bicicleta("Caloi", "Azul");
        bicicleta1.status();
        bicicleta1.pedalar();
        bicicleta1.pedalar();
        bicicleta1.parar();



        // Criando duas instâncias de caneta
        Caneta caneta1 = new Caneta("Faber Castell", "Vermelha");
        Caneta caneta2 = new Caneta("Bic", "Azul");
        System.out.println("Status da Caneta 1:");
        caneta1.status();
        caneta1.destampar();
        System.out.println("\nStatus atualizado da Caneta 1:");
        caneta1.status();

        System.out.println("\nStatus da Caneta 2:");
        caneta2.status();
        caneta2.tampar();
        System.out.println("\nStatus atualizado da Caneta 2:");
        caneta2.status();



        // Criando duas instâncias de tênis
        Tenis tenis1 = new Tenis("Sola Esportiva", "Cadarço Branco");
        Tenis tenis2 = new Tenis("Sola Casual", "Cadarço Preto");
        System.out.println("Status do Tênis 1:");
        tenis1.status();
        tenis1.desamarrar();
        System.out.println("\nStatus atualizado do Tênis 1:");
        tenis1.status();

        System.out.println("\nStatus do Tênis 2:");
        tenis2.status();
        tenis2.amarrar();
        System.out.println("\nStatus atualizado do Tênis 2:");
        tenis2.status();



        // Criando uma instância de garrafa
        Garrafa garrafa = new Garrafa("Guaraná");
        System.out.println("Status da Garrafa:");
        garrafa.status();
        garrafa.colocar();
        garrafa.colocar();
        garrafa.abrir();
        garrafa.fechar();
        garrafa.fechar();



        // Criando uma instância de geladeira
        Geladeira geladeira = new Geladeira(180);
        System.out.println("Status da Geladeira:");
        geladeira.status();
        geladeira.abrir();
        geladeira.ligarResfriamento();
        System.out.println("\nStatus atualizado da Geladeira:");
        geladeira.status();



        // Criando uma instância de celular
        Celular celular = new Celular("Samsung", "Galaxy S21");
        System.out.println("Status do Celular:");
        celular.status();
        celular.ligar();
        celular.desbloquear();
        System.out.println("\nStatus atualizado do Celular:");
        celular.status();
        celular.bloquear();
        celular.desligar();



        // Criando uma instância de camisa
        Camisa camisa = new Camisa("Armani", "Creme", "Social");
        System.out.println("Status da Camisa:");
        camisa.status();
        camisa.vestirCamisa();
        camisa.retirarCamisa();
        String tipoCamisa = camisa.descobrirTipoCamisa();
        System.out.println("Tipo de camisa: " + tipoCamisa);



        // Criando uma instância de headset
        Headset headset = new Headset("Vermelho", "HyperX");
        System.out.println("Status do Headset:");
        headset.status();
        headset.ligar();
        headset.tocar();
        System.out.println("\nStatus atualizado do Headset:");
        headset.status();
        headset.desligar();



        // Criando uma instância de controle
        Controle controle = new Controle("TV Samsung", 2);
        System.out.println("Status do Controle:");
        controle.status();
        controle.ligar();
        controle.troca();
        System.out.println("\nStatus atualizado do Controle:");
        controle.status();
        controle.desligar();

    }
}
