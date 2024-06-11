package com.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class MainController {

    @FXML
    private TabPane meuTabPane;

    private ProdutoController ProdutoController = new ProdutoController();

    public void initialize() {
        meuTabPane.getSelectionModel().selectedItemProperty().addListener((obs, oldTab, newTab) -> {
            if (newTab != null) {
                switch (newTab.getText()) {
                    case "Celular":
                        atualizarDadosCelular();
                        break;
                    case "Produto":
                        atualizarDadosProduto();
                        break;
                    // Adicione casos adicionais conforme necessário
                }
            }
        });
    }

    private void atualizarDadosCelular() {
        // Código para atualizar os dados da aba Celular
    }

    private void atualizarDadosProduto() {
        // ProdutoController.carregarProdutos();
        // ProdutoController.configurarTabela();
    }

    // Métodos adicionais conforme necessário
}