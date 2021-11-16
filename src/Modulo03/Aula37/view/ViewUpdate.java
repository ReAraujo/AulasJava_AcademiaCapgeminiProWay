package Modulo03.Aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modulo03.Aula35_Pool_ConnectionFactory.utils.ConnectionFactory;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            String nome = "UpdatePrepStatment";
            int id = 25;
            
            String sql = "UPDATE Categoria SET nome = ? where id = ? ";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

            prepStatement.execute();
            
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);      
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
