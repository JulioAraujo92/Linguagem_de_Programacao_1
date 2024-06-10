package com.celular;

import com.celular.db.CriarBanco;

public class Main {
    public static void main(String[] args) {
        CriarBanco banco = new CriarBanco();
        banco.criarTabela();
    }
}