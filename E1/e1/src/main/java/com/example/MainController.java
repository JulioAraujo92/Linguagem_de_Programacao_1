// package com.example;

// import javafx.fxml.FXML;
// import javafx.scene.control.Label;
// import javafx.scene.control.Tab;
// import javafx.scene.control.TabPane;
// import javafx.scene.control.TextArea;

// public class MainController {

//     @FXML
//     private Tab tabCadastrados;

//     @FXML
//     private TabPane tabPane;

//     @FXML
//     private Label lblMarcaBicicleta;

//     @FXML
//     private Label lblCorBicicleta;

//     @FXML
//     private Label lblMarchasBicicleta;

//     @FXML
//     private Label lblMarcaCamisa;

//     @FXML
//     private Label lblCorCamisa;

//     @FXML
//     private Label lblTipoCamisa;

//     @FXML
//     private Label lblMarcaCelular;

//     @FXML
//     private Label lblModeloCelular;

//     @FXML
//     private Label lblCorCelular;

//     @FXML
//     private TextArea TextAreaMarcaBicicleta;

//     @FXML
//     private TextArea TextAreaCorBicicleta;

//     @FXML
//     private TextArea TextAreaMarchasBicicleta;

//     @FXML
//     private TextArea TextAreaMarcaCamisa;

//     @FXML
//     private TextArea TextAreaCorCamisa;

//     @FXML
//     private TextArea TextAreaTipoCamisa;

//     @FXML
//     private TextArea TextAreaMarcaCelular;

//     @FXML
//     private TextArea TextAreaModeloCelular;

//     @FXML
//     private TextArea TextAreaCorCelular;

//     @FXML
//     void cadastrarBicicleta() {
//         String marca = TextAreaMarcaBicicleta.getText();
//         String cor = TextAreaCorBicicleta.getText();
//         String marchas = TextAreaMarchasBicicleta.getText();

//         Bicicleta bicicleta = new Bicicleta(marca, cor);
//         bicicleta.status();

//         lblMarcaBicicleta.setText("Marca: " + marca);
//         lblCorBicicleta.setText("Cor: " + cor);
//         lblMarchasBicicleta.setText("Marchas: " + marchas);
//         tabPane.getSelectionModel().select(tabCadastrados);
//     }

//     @FXML
//     void cadastrarCamisa() {
//         String marca = TextAreaMarcaCamisa.getText();
//         String cor = TextAreaCorCamisa.getText();
//         String tipo = TextAreaTipoCamisa.getText();

//         Camisa camisa = new Camisa(marca, cor, tipo);
//         camisa.status();

//         lblMarcaCamisa.setText("Marca: " + marca);
//         lblCorCamisa.setText("Cor: " + cor);
//         lblTipoCamisa.setText("Tipo: " + tipo);
//         tabPane.getSelectionModel().select(tabCadastrados);
//     }

//     @FXML
//     void cadastrarCelular() {
//         String marca = TextAreaMarcaCelular.getText();
//         String modelo = TextAreaModeloCelular.getText();
//         String cor = TextAreaCorCelular.getText();

//         Celular celular = new Celular(marca, modelo, cor);
//         celular.status();

//         lblMarcaCelular.setText("Marca: " + marca);
//         lblModeloCelular.setText("Modelo: " + modelo);
//         lblCorCelular.setText("Cor: " + cor);
//         tabPane.getSelectionModel().select(tabCadastrados);
//     }
// }








package com.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.TableView;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


public class MainController {
    @FXML
    private Button btnCadastroCamisa;

    @FXML
    private ImageView imgBicicleta1;

    @FXML
    private TextField TextAreaCorCelular;

    @FXML
    private TextField TextAreaModeloCelular;

    @FXML
    private ImageView imgBicicleta11;

    @FXML
    private Label lblModeloCelular;

    @FXML
    private Button btnCadastroCelular;

    @FXML
    private Button btnCadastroBicicleta;

    @FXML
    private TextField TextAreaMarchasBicicleta;

    @FXML
    private Label lblCorCamisa;

    @FXML
    private Label lblCorCelular;

    @FXML
    private TextField TextAreaCorCamisa;

    @FXML
    private Label lblTipoCamisa;

    @FXML
    private TextField TextAreaTipoC;

    @FXML
    private TextField TextAreaCorBicicleta;

    @FXML
    private TextField TextAreaMarcaCelular;

    @FXML
    private Label lblCorBicicleta;

    @FXML
    private TextField TextAreaMarcaCamisa;

    @FXML
    private Label lblMarcaCelular;

    @FXML
    private TextField TextAreaMarcaBicicleta;

    @FXML
    private Label lblMarchasBicicleta;

    @FXML
    private ImageView imgBicicleta;

    @FXML
    private Label lblMarcaBicicleta;

    @FXML
    private Label lblMarcaCamisa;
    
    @FXML
    private void cadastrarBicicleta() {
        String marca = TextAreaMarcaBicicleta.getText();
        String cor = TextAreaCorBicicleta.getText();
        int marchas = Integer.parseInt(TextAreaMarchasBicicleta.getText());

        BicicletaCadastrada bicicleta = new BicicletaCadastrada(marca, cor, marchas);
        mostrarNaAbaCadastrados(bicicleta);


        TextAreaMarcaBicicleta.clear();
        TextAreaCorBicicleta.clear();
        TextAreaMarchasBicicleta.clear();
    }

    @FXML
    private Tab tabCadastrados; // Declare and initialize the tabCadastrados variable

    private void mostrarNaAbaCadastrados(BicicletaCadastrada bicicleta) {
        // Lógica para exibir a bicicleta cadastrada na aba "Cadastrados"
        // Você pode adicionar os dados da bicicleta em uma TableView ou ListView, por exemplo
        // Neste exemplo, suponha que você tenha um método para adicionar a bicicleta em uma TableView
        AnchorPane anchorPane = (AnchorPane) tabCadastrados.getContent();
        TableView<BicicletaCadastrada> tabelaCadastrados = null;
        for (Node node : anchorPane.getChildren()) {
            if (node instanceof TableView) {
                tabelaCadastrados = (TableView<BicicletaCadastrada>) node;
                break;
            }
        }
        if (tabelaCadastrados != null) {
            tabelaCadastrados.getItems().add(bicicleta);
        }
    }

    @FXML
    private TableView<BicicletaCadastrada> tabelaCadastrados;

    @FXML
    private TableColumn<BicicletaCadastrada, String> colMarca;

    @FXML
    private TableColumn<BicicletaCadastrada, String> colCor;

    @FXML
    private TableColumn<BicicletaCadastrada, Integer> colMarchas;

    private void initialize() {
        // Inicializar as colunas da tabela
        colMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
        colMarchas.setCellValueFactory(new PropertyValueFactory<>("marchas"));
    }
}

