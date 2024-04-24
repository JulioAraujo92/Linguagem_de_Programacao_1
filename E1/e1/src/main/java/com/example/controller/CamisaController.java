package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import com.example.model.Camisa;
import com.example.service.ProdutoService;


public class CamisaController {
    @FXML
    private Button btnCadastroCamisa;

    private ProdutoService produtoService = new ProdutoService();

    @FXML
    public void cadastrarCamisa(ActionEvent event) {
        // Obter os dados dos campos de texto e etiquetas
        String nome = TextAreaNomeCamisa.getText();
        String marca = TextAreaMarcaCamisa.getText();
        String cor = TextAreaCorCamisa.getText();
        String tamanho = TextAreaTamanhoCamisa.getText();
        double preco = Double.parseDouble(TextAreaPrecoCamisa.getText());

        // Criar um objeto Camisa
        Camisa camisa = new Camisa(nome, preco, marca, "", cor, tamanho);

        // Adicionar a camisa ao ProdutoService
        // ProdutoService.getInstancia().adicionarProduto(camisa);
        produtoService.adicionarProduto(camisa);

        // Exibir uma mensagem de sucesso
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cadastro realizado");
        alert.setHeaderText(null);
        alert.setContentText("Produto cadastrado com sucesso!\nNome: " + camisa.getNome() + "\nMarca: " + camisa.getMarca() + "\nCor: " + camisa.getCor() + "\nTamanho: " + camisa.getTamanho() + "\nPreço: " + camisa.getPreco());

        alert.showAndWait();

        // Limpar os campos de texto
        TextAreaNomeCamisa.clear();
        TextAreaMarcaCamisa.clear();
        TextAreaCorCamisa.clear();
        TextAreaTamanhoCamisa.clear();
        TextAreaPrecoCamisa.clear();
    }

    @FXML
    private TextArea TextAreaPrecoCamisa;

    @FXML
    private Label lblCorCamisa;

    @FXML
    private Label lblNomeCamisa;

    @FXML
    private TextArea TextAreaCorCamisa;

    @FXML
    private Label lblTamanhoCamisa;

    @FXML
    private TextArea TextAreaMarcaCamisa;

    @FXML
    private TextArea TextAreaTamanhoCamisa;

    @FXML
    private TextArea TextAreaNomeCamisa;

    @FXML
    private ImageView imgBicicleta;

    @FXML
    private Label lblMarcaCamisa;

    @FXML
    private Label lblPrecoCamisa;

    // @FXML
    // void cadastrarBicicleta(ActionEvent event) {

    // }
}
