package com.example.model;

public class Celular extends Produto{
    private String armazenamento;
    private String modelo;
    private String cor;


    public Celular(String nome, double preco, String armazenamento, String modelo, String cor) {
        super(nome, preco, "Celular");
        this.armazenamento = armazenamento;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   

    public String getCor() {
        return cor;
    }   

    public void setCor(String cor) {
        this.cor = cor;
    }   

    @Override
    public String toString() {
        return "tipo = " + getTipoProduto() + " id = " + getId() + ", nome = " + getNome() + ", preco = " + getPreco() + ", armazenamento = " + armazenamento + ", modelo = " + modelo + ", cor = " + cor;
    }

}
