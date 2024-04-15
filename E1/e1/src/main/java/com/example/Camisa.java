package com.example;

public class Camisa {
    private String marca;
    private String cor;
    private String tipo;

    public Camisa(String marca, String cor, String tipo) {
        this.marca = marca;
        this.cor = cor;
        this.tipo = tipo;
    }

    public void status() {
        System.out.println("Marca da camisa: " + marca);
        System.out.println("Cor da camisa: " + cor);
        System.out.println("Tipo de camisa: " + tipo);
    }

    public void vestirCamisa() {
        System.out.println("Vestindo a camisa " + marca + " " + cor);
    }

    public void retirarCamisa() {
        System.out.println("Retirando a camisa " + marca + " " + cor);
    }

    public String descobrirTipoCamisa() {
        return tipo;
    }
}
