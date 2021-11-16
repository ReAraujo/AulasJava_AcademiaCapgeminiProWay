package Modulo03.Aula33_Connection.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class View4 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            
            Statement statement = conn.createStatement();
            String sql = "UPDATE Categoria SET nome = 'Teste10' where nome = 'Teste1'";
            statement.execute(sql);
            
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
