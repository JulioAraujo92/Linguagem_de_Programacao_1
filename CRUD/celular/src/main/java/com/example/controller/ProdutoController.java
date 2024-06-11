package com.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
// import javafx.scene.control.Alert;
// import javafx.scene.control.Button;
// import javafx.scene.control.ButtonType;
// import javafx.scene.control.cell.TextFieldTableCell;
// import javafx.util.converter.DoubleStringConverter;
import com.example.model.Produto;
import com.example.Services.ProdutoService;

import java.util.List;
// import java.util.Optional;

public class ProdutoController {

    @FXML
    private TableView<Produto> tabelaProdutos;

    @FXML
    private TableColumn<Produto, String> ColumnCor;

    @FXML
    private TableColumn<Produto, String> ColumnModelo;

    @FXML
    private TableColumn<Produto, String> ColumnPreco;

    @FXML
    private TableColumn<Produto, String> ColunnMarca;

    @FXML
    private TableColumn<Produto, Void> ColumnDeletar;

    private ProdutoService produtoService = new ProdutoService();

    @FXML
    public void initialize() {
        configurarTabela();
        carregarProdutos();
    }

    private void configurarTabela() {
        ColumnCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
        ColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        ColumnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        ColunnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));

        // ColumnDeletar.setCellFactory(param -> new TableCell<Produto, Void>() {
        //     private final Button btn = new Button("Deletar");

        //     {
        //         btn.setOnAction(event -> {
        //             Produto produto = getTableView().getItems().get(getIndex());
        //             Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        //             alert.setTitle("Confirmação de Exclusão");
        //             alert.setHeaderText("Você tem certeza que deseja excluir este produto?\nEsta ação não pode ser desfeita.");

        //             ButtonType ButtonTypeSim = new ButtonType("Sim", ButtonBar.ButtonData.YES);
        //             ButtonType ButtonTypeNao = new ButtonType("Não", ButtonBar.ButtonData.NO);

        //             alert.getButtonTypes().setAll(ButtonTypeSim, ButtonTypeNao);

        //             Optional<ButtonType> result = alert.showAndWait();
        //             if (result.isPresent() && result.get() == ButtonTypeSim) {
        //                 produtoService.deletarProduto(produto.getId());
        //                 getTableView().getItems().remove(produto);
        //             }
        //         });
        //     }

        //     @Override
        //     protected void updateItem(Void item, boolean empty) {
        //         super.updateItem(item, empty);
        //         if (empty) {
        //             setGraphic(null);
        //         } else {
        //             setGraphic(btn);
        //         }
        //     }
        // });
    }

    private void carregarProdutos() {
        List<Produto> produtos = produtoService.buscarTodosProdutos();
        tabelaProdutos.getItems().setAll(produtos);
    }
}