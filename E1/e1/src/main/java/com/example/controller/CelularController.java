package com.example.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import com.example.model.Celular;
import com.example.service.ProdutoService;



public class CelularController {
    @FXML
    private Button btnCadastroCelular;

    private ProdutoService produtoService = new ProdutoService();

    @FXML
    public void cadastrarCelular(ActionEvent event) {
        // Obter os dados dos campos de texto e etiquetas
        String nome = TextAreaNomeCelular.getText();
        String modelo = TextAreaMarcaCelular.getText();
        String cor = TextAreaCorCelular.getText();
        String armazenamento = TextAreaArmazenamentoCelular.getText();
        double preco = Double.parseDouble(TextAreaPrecoCelular.getText());

        // Criar um objeto Celular
        Celular celular = new Celular(nome, preco, armazenamento, modelo, cor);

        // Adicionar o celular ao ProdutoService
        // ProdutoService.getInstancia().adicionarProduto(celular);
        produtoService.adicionarProduto(celular);

        // Exibir uma mensagem de sucesso
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cadastro realizado");
        alert.setHeaderText(null);
        alert.setContentText("Produto cadastrado com sucesso!\nMarca: " + celular.getNome() + "\nModelo: " + celular.getModelo() + "\nCor: " + celular.getCor() + "\nArmazenamento: " + celular.getArmazenamento() + "\nPreço: " + celular.getPreco());

        alert.showAndWait();

        // Limpar os campos de texto
        TextAreaNomeCelular.clear();
        TextAreaMarcaCelular.clear();
        TextAreaCorCelular.clear();
        TextAreaArmazenamentoCelular.clear();
        TextAreaPrecoCelular.clear();
    }


    @FXML
    private TextArea TextAreaNomeCelular;

    @FXML
    private TextArea TextAreaCorCelular;

    @FXML
    private Label lblCorCelular;

    @FXML
    private Label lblArmazenamentoCelular;

    @FXML
    private TextArea TextAreaMarcaCelular;

    @FXML
    private TextArea TextAreaPrecoCelular;

    @FXML
    private Label lblPrecoCelular;

    @FXML
    private Label lblMarcaCelular;

    @FXML
    private TextArea TextAreaArmazenamentoCelular;


    @FXML
    private Label lblNomeCelular;

    @FXML
    private ImageView imgBicicleta;


}
