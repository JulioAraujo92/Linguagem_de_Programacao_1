package com.example.service;

import com.example.model.Produto;
import java.util.List;
import java.util.ArrayList;

public class ProdutoService {
    private static ProdutoService instancia;
    private List<Produto> produtos;

    public ProdutoService() {
        this.produtos = new ArrayList<>();
    }

    public static ProdutoService getInstancia() {
        if (instancia == null) {
            instancia = new ProdutoService();
        }
        return instancia;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }
}
