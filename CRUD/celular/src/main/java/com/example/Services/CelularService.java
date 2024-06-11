package com.example.Services;

import com.example.db.CriarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CelularService {

    public void inserirCelular(String marca, String modelo, String cor, String preco) {
        String sql = "INSERT INTO celular (marca, modelo, cor, preco) VALUES (?, ?, ?, ?)";
        
        CriarBanco criarBanco = new CriarBanco(); // Criando uma instância de CriarBanco
        try (Connection conn = criarBanco.ConectarBanco(); // Usando a instância para chamar o método
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, marca);
            pstmt.setString(2, modelo);
            pstmt.setString(3, cor);
            pstmt.setString(4, preco);
            
            pstmt.executeUpdate();
            System.out.println("Celular inserido com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}