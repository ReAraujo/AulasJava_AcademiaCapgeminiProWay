package Modulo03.Aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modulo03.Aula37.model.Categoria;
import Modulo03.Aula37.utils.ConnectionFactory;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            Categoria model = new Categoria();
            model.setId(4);
            model.setNome("Teste aula 37 - Update");
            
            String sql = "UPDATE Categoria SET nome = ? where id = ? ";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, model.getNome());
            prepStatement.setInt(2, model.getId());

            prepStatement.execute();
            
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);      
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
