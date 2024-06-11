package com.example.model;

public class Produto {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private String preco;


    public int getId() {
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getPreco() {
        return preco;
    }   
    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
public String toString() {
    return "Produto{" +
           "id=" + id +
           ", cor='" + cor + '\'' +
           ", modelo='" + modelo + '\'' +
           ", preco='" + preco + '\'' +
           ", marca='" + marca + '\'' +
           '}';
}
}



