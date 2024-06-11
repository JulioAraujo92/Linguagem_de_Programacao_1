package com.example.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.db.CriarBanco;
import com.example.model.Produto;

public class ProdutoService {

    public List<Produto> buscarTodosProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM celular";
        
        CriarBanco criarBanco = new CriarBanco();
        try (Connection conn = criarBanco.ConectarBanco();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setMarca(rs.getString("marca"));
                produto.setModelo(rs.getString("modelo"));
                produto.setCor(rs.getString("cor"));
                produto.setPreco(rs.getString("preco"));
                produtos.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void deletarProduto(String modeloString) {
        String sql = "DELETE FROM celular WHERE modelo = ?";
        
        CriarBanco criarBanco = new CriarBanco();
        try (Connection conn = criarBanco.ConectarBanco();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, modeloString);
            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows > 0) {
                System.out.println("Produto deletado com sucesso.");
            } else {
                System.out.println("Nenhum produto foi deletado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarProduto(String modeloString, Produto produto) {
        String sql = "UPDATE celular SET cor = ?, preco = ?, marca = ? WHERE modelo = ?";
    
        CriarBanco criarBanco = new CriarBanco();
        try (Connection conn = criarBanco.ConectarBanco();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, produto.getCor());
            pstmt.setString(2, produto.getPreco());
            pstmt.setString(3, produto.getMarca());
            pstmt.setString(4, modeloString);
            
            int affectedRows = pstmt.executeUpdate();
            
            if (affectedRows > 0) {
                System.out.println("Produto atualizado com sucesso.");
            } else {
                System.out.println("Nenhuma alteração foi realizada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
