package Modulo03.Aula33_Connection.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View2 {
    public static void main(String[] args) {
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String pwd = "123789";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

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




    
