package com.example.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class CelularController {

    @FXML
    private TextArea TextAreaNomeCelular;

    @FXML
    private TextArea TextAreaCorCelular;

    @FXML
    private TextArea TextAreaMarcaCelular;

    @FXML
    private TextArea TextAreaPrecoCelular;

    @FXML
    private Button btnCadastroCelular;


    @FXML
    void cadastrarCelular(ActionEvent event) { 
        String nome = TextAreaNomeCelular.getText();
        String marca = TextAreaMarcaCelular.getText();
        String cor = TextAreaCorCelular.getText();
        String preco = TextAreaPrecoCelular.getText();
        System.out.println("Nome: " + nome + "\nMarca: " + marca + "\nCor: " + cor + "\nPreço: " + preco);

    }

}
