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
}
