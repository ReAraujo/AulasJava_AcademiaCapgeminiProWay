package Modulo03.Aula33_Connection.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            
            Statement statement = conn.createStatement();
            String sql = "INSERT INTO Categoria (nome, descricao) values ('Teste1', 'Teste2')";
            
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            ResultSet ids = statement.getGeneratedKeys();

            while (ids.next()) {
                // Começa em 1 (não em 0 como começam as listas)
                int id = ids.getInt(1);
                System.out.println(id);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
