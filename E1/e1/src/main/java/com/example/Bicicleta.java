package com.example;

public class Bicicleta {
    private String marca;
    private String cor;
    private boolean emMovimento;

    public Bicicleta(String marca, String cor) {
        setMarca(marca);
        setCor(cor);
        this.emMovimento = false;
    }

    public void status() {
        String estado = emMovimento ? "andando" : "parada";
        System.out.println("A marca da bicicleta é " + marca);
        System.out.println("A cor da bicicleta é " + cor);
        System.out.println("A bicicleta está " + estado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void pedalar() {
        if (!emMovimento) {
            System.out.println("A bicicleta começou a andar, Pedalando...");
            emMovimento = true;
        } else {
            System.out.println("A bicicleta já está em movimento! Pedalando mais forte!!!");
        }
    }

    public void parar() {
        if (emMovimento) {
            System.out.println("Parando a bicicleta...");
            emMovimento = false;
            System.out.println("Bicicleta parada.");
        } else {
            System.out.println("A bicicleta já está parada!");
        }
    }
}
