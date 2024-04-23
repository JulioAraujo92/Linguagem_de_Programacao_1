package com.example;

public class Celular {
    private String marca;
    private String modelo;
    private String cor;
    private boolean bloqueado;
    private boolean ligado;

    public Celular(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.bloqueado = true; // Inicialmente, o celular está bloqueado
        this.ligado = false; // Inicialmente, o celular está desligado
    }

    public void status() {
        String estadoBloqueio = bloqueado ? "bloqueado" : "desbloqueado";
        String estadoLigado = ligado ? "ligado" : "desligado";
        System.out.println("Marca do celular: " + marca);
        System.out.println("Modelo do celular: " + modelo);
        System.out.println("Cor do celular: " + cor);
        System.out.println("O celular está " + estadoBloqueio);
        System.out.println("O celular está " + estadoLigado);
    }

    public void desbloquear() {
        if (bloqueado && !ligado) {
            bloqueado = false;
            System.out.println("Desbloqueando o celular...");
        } else if (ligado) {
            System.out.println("O celular está ligado, não é possível desbloquear!");
        } else {
            System.out.println("O celular já está desbloqueado!");
        }
    }

    public void bloquear() {
        if (!bloqueado && !ligado) {
            bloqueado = true;
            System.out.println("Bloqueando o celular...");
        } else if (ligado) {
            System.out.println("O celular está ligado, não é possível bloquear!");
        } else {
            System.out.println("O celular já está bloqueado!");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ligando o celular...");
        } else {
            System.out.println("O celular já está ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            bloqueado = true; // Se desligar o celular, ele fica bloqueado automaticamente
            System.out.println("Desligando o celular...");
        } else {
            System.out.println("O celular já está desligado!");
        }
    }
}
