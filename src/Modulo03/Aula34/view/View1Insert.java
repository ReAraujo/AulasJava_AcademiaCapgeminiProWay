package Modulo03.Aula34.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View1Insert {
    public static void main(String[] args) {
        try {
            // SQL Injection 
            String nome = "Eletro');delete from categoria; INSERT INTO categoria(nome) values('otario";

            // Utilizar o PreparedStatement faz com que o que foi colocado na variável 'nome' seja lido como String e não como comando dentro do Banco de Dados
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO Categoria (nome) values (?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                System.out.println(id);
            }
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }

}
    
