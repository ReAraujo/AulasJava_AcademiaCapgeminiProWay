package Modulo03.Aula34.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View2Update {
    public static void main(String[] args) {
        try {
            String nome = "UpdatePrepStatment";
            int id = 25;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "123789");
            
            String sql = "UPDATE Categoria SET nome = ? where id = ? ";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();
            
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }



    }
}
