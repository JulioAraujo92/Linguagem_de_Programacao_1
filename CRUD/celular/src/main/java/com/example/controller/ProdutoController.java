package com.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.ButtonBar;
import com.example.model.Produto;
import com.example.Services.ProdutoService;

import java.util.List;
import java.util.Optional;

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
    private TableColumn<Produto, String> ColumnMarca; 

    @FXML
    private TableColumn<Produto, Void> ColumnDeletar;

    @FXML
    private Button atualizar;

    private ProdutoService produtoService = new ProdutoService();

    @FXML
    public void initialize() {
        configurarTabela();
        carregarProdutos();
        ColumnCor.setCellFactory(TextFieldTableCell.forTableColumn());
        ColumnModelo.setCellFactory(TextFieldTableCell.forTableColumn());
        ColumnPreco.setCellFactory(TextFieldTableCell.forTableColumn());
        ColumnMarca.setCellFactory(TextFieldTableCell.forTableColumn());
        tabelaProdutos.setEditable(true);
        gerenciarAlteracoes();
    }

    private void configurarTabela() {
        ColumnCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
        ColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        ColumnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        ColumnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));

        ColumnDeletar.setCellFactory(param -> new TableCell<Produto, Void>() {
            private final Button btn = new Button("Deletar");

            {
                btn.setOnAction(event -> {
                    Produto produto = getTableView().getItems().get(getIndex());
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confirmação de Exclusão");
                    alert.setHeaderText("Você tem certeza que deseja excluir este produto?\nEsta ação não pode ser desfeita.");

                    ButtonType ButtonTypeSim = new ButtonType("Sim", ButtonBar.ButtonData.YES);
                    ButtonType ButtonTypeNao = new ButtonType("Não", ButtonBar.ButtonData.NO);

                    alert.getButtonTypes().setAll(ButtonTypeSim, ButtonTypeNao);

                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.isPresent() && result.get() == ButtonTypeSim) {
                        System.out.println("Deletando produto: " + produto.getModelo());
                        produtoService.deletarProduto(produto.getModelo());
                        getTableView().getItems().remove(produto);
                    }
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(btn);
                }
            }
        });
    }

    
    public void atualizarTabelaProdutos() {
        carregarProdutos();
    }

    public void carregarProdutos() {
        List<Produto> produtos = produtoService.buscarTodosProdutos();
        System.out.println(produtos);
        tabelaProdutos.getItems().setAll(produtos);
    }

    @FXML
    void atualizar(ActionEvent event) {
        carregarProdutos();
    }

    private void gerenciarAlteracoes() {
    ColumnCor.setOnEditCommit(event -> {
        Produto produto = event.getRowValue();
        produto.setCor(event.getNewValue());
        produtoService.atualizarProduto(produto.getModelo(), produto);

    });

    ColumnModelo.setOnEditCommit(event -> {
        Produto produto = event.getRowValue();
        produto.setModelo(event.getNewValue());
        produtoService.atualizarProduto(produto.getModelo(), produto);

    });

    ColumnPreco.setOnEditCommit(event -> {
        Produto produto = event.getRowValue();
        // Supondo que o preço é um String que precisa ser convertido para um tipo numérico, por exemplo, BigDecimal
        produto.setPreco(event.getNewValue());
        produtoService.atualizarProduto(produto.getModelo(), produto);

    });

    ColumnMarca.setOnEditCommit(event -> {
        Produto produto = event.getRowValue();
        produto.setMarca(event.getNewValue());
        produtoService.atualizarProduto(produto.getModelo(), produto);

    });

    // Supondo que existe um método para recarregar os produtos na tabela
    carregarProdutos();
}

}