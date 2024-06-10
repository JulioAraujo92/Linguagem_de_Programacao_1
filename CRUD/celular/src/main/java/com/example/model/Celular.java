package com.example.model;

public class Celular {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private float preco;


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

    public float getPreco() {
        return preco;
    }   
    public void setPreco(float preco) {
        this.preco = preco;
    }
}



