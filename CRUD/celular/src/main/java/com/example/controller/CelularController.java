package com.example.controller;


import com.example.Services.CelularService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    CelularService celularService = new CelularService();
    celularService.inserirCelular(marca, modelo, cor, preco);

}

}
