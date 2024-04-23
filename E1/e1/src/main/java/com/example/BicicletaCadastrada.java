package com.example;

public class BicicletaCadastrada {
    private String marca;
    private String cor;
    private int marchas;

    public BicicletaCadastrada(String marca, String cor, int marchas) {
        this.marca = marca;
        this.cor = cor;
        this.marchas = marchas;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getMarchas() {
        return marchas;
    }
}
