package com.example.controller;


import com.example.Services.CelularService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CelularController {

    @FXML
    private TextArea TextAreaMarcaCelular;

    @FXML
    private TextArea TextAreaCorCelular;

    @FXML
    private TextArea TextAreaModeloCelular;

    @FXML
    private TextArea TextAreaPrecoCelular;

    @FXML
    private Button btnCadastroCelular;


    @FXML
    void cadastrarCelular(ActionEvent event) { 
        String marca = TextAreaMarcaCelular.getText();
        String modelo = TextAreaModeloCelular.getText();
        String cor = TextAreaCorCelular.getText();
        String preco = TextAreaPrecoCelular.getText();
    
        // Verificar se algum campo está vazio
        if (marca.isEmpty() || modelo.isEmpty() || cor.isEmpty() || preco.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campos Vazios");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos para cadastrar o celular.");
            alert.showAndWait();
        } else {
            // Se todos os campos estiverem preenchidos, prosseguir com o cadastro
            CelularService celularService = new CelularService();
            celularService.inserirCelular(marca, modelo, cor, preco);
            
            // Limpar os campos de texto após a inserção
            TextAreaMarcaCelular.setText("");
            TextAreaModeloCelular.setText("");
            TextAreaCorCelular.setText("");
            TextAreaPrecoCelular.setText("");
    
            // Mostrar um alerta de sucesso
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Cadastro Realizado");
            alert.setHeaderText(null);
            alert.setContentText("O celular foi cadastrado com sucesso!");
            alert.showAndWait();
        }
    }
}
