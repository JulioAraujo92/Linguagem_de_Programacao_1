package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class CriarBanco {
    
    private static String nomeBanco = "celular";
    private static final String URL = "jdbc:postgresql://localhost:5432/" + nomeBanco;
    private String usuario = "postgres";
    private String senha = "root";
    private Connection conexao;

    public CriarBanco() {
        this.conexao = ConectarBanco();
    }

    public Connection ConectarBanco() {
        try {
            conexao = DriverManager.getConnection(URL, usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
        return conexao;
    }

    public void fecharConexao() {
        try {
            conexao.close();
            System.out.println("Conexão fechada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }

    public void criarTabela() {
        try {
            String sql = "CREATE TABLE celular (id SERIAL PRIMARY KEY, marca VARCHAR(50), modelo VARCHAR(50), cor VARCHAR(50), preco FLOAT)";
            conexao.createStatement().execute(sql);
            System.out.println("Tabela criada com sucesso!");
            fecharConexao();
        } catch (Exception e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }


}
