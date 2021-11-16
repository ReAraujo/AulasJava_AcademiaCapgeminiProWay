package Modulo03.Aula33_Connection.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1 {
    public static void main(String[] args) {
        try {
            //Connection conn = DriverManager.getConnection("url", "user", "password");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            
            // Statment - query SQL
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM categoria");
            // Result = retorno da consulta
            ResultSet result = statement.getResultSet();

            // Imprimir resultado
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("%d - %s - %s \n", id, nome, descricao);
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }
    }
    
}




    
