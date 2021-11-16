package Modulo03.Aula34.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View3Delete {
    public static void main(String[] args) {
        try {
            int idDeletado = 26;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            
            String sql = "DELETE FROM Categoria WHERE nome = ? ";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);


            prepStatement.execute(sql);
            int linhasAfetadas = prepStatement.getUpdateCount(); 
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
