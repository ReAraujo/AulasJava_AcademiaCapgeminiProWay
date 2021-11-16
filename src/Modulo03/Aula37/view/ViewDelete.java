package Modulo03.Aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modulo03.Aula37.utils.ConnectionFactory;
import Modulo03.Aula37.model.Categoria;

public class ViewDelete {
    public static void main(String[] args) {
        // Try with resources - desta forma, não é necessário o fechamento com o 'cnn.close();'
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {
            Categoria model = new Categoria();
            model.setId(4);

            String sql = "DELETE FROM Categoria WHERE nome = ? ";

            try(PreparedStatement prepStatement = conn.prepareStatement(sql)){ 
                prepStatement.setInt(1, model.getId());
                prepStatement.execute();
                int linhasAfetadas = prepStatement.getUpdateCount(); 
                System.out.println(linhasAfetadas);
            } catch (Exception e ){
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar.");
        }

    }
    
}
