package com.example.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import com.example.model.Bicicleta;
import com.example.service.ProdutoService;




public class BicicletaController {

    @FXML
    private Button btnCadastroBicicleta;
    
    @FXML
    public void cadastrarBicicleta(ActionEvent event) {
        // Obter os dados dos campos de texto e etiquetas
        String nome = TextAreaNomeBicicleta.getText();
        String marca = TextAreaMarcaBicicleta.getText();
        String cor = TextAreaCorBicicleta.getText();
        int marchas = Integer.parseInt(TextAreaMarchasBicicleta.getText());
        double preco = Double.parseDouble(TextAreaPrecoBicicleta.getText());

        // Criar um objeto Bicicleta
        Bicicleta bicicleta = new Bicicleta(nome, preco, marca, "", cor, 0, marchas);

        // Adicionar a bicicleta ao ProdutoService
        ProdutoService.getInstancia().adicionarProduto(bicicleta);

        // Exibir uma mensagem de sucesso
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cadastro realizado");
        alert.setHeaderText(null);
        alert.setContentText("Produto cadastrado com sucesso!");

        alert.showAndWait();

        // Limpar os campos de texto
        TextAreaNomeBicicleta.clear();
        TextAreaMarcaBicicleta.clear();
        TextAreaCorBicicleta.clear();
        TextAreaMarchasBicicleta.clear();
        TextAreaPrecoBicicleta.clear();
    }


    @FXML
    private TextArea TextAreaMarchasBicicleta;

    @FXML
    private TextArea TextAreaNomeBicicleta;

    @FXML
    private Label lblPrecoBicicleta;

    @FXML
    private TextArea TextAreaCorBicicleta;

    @FXML
    private Label lblCorBicicleta;

    @FXML
    private TextArea TextAreaMarcaBicicleta;

    @FXML
    private TextArea TextAreaPrecoBicicleta;

    @FXML
    private Label lblNomeBicicleta;

    @FXML
    private Label lblMarchasBicicleta;

    @FXML
    private ImageView imgBicicleta;

    @FXML
    private Label lblMarcaBicicleta;

    // @FXML
    // void cadastrarBicicleta(ActionEvent event) {

    // }
}
