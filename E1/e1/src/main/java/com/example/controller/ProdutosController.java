package com.example.controller;

import com.example.model.Produto;
import com.example.service.ProdutoService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ProdutosController {

    @FXML
    private ListView<Produto> listaProdutos;

    private ProdutoService produtoService;

    private ObservableList<Produto> produtos;

    @FXML
    public void initialize() {
        this.produtoService = ProdutoService.getInstancia();
        this.produtos = FXCollections.observableArrayList(produtoService.getProdutos());
        listaProdutos.setItems(produtos);
        listaProdutos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        System.out.println("Produtos: " + produtoService.getProdutos());
    }

}