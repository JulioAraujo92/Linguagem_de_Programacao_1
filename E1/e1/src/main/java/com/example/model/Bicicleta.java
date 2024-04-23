package com.example.model;

public class Bicicleta extends Produto{
    private String marca;
    private String cor;
    private int marchas;
    
    public Bicicleta(String nome, double preco, String marca, String modelo, String cor, int aro, int marchas) {
        super(nome, preco, "Bicicleta");
        this.marca = marca;
        this.cor = cor;
        this.marchas = marchas;
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
    
    public int getMarchas() {
        return marchas;
    }
    
    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", marca = " + marca + ", cor = " + cor + ", marchas = " + marchas;
    }

}
