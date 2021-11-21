package Modulo03.Aula36_Dao.view;

import java.sql.Connection;
import java.sql.SQLException;
import Modulo03.Aula36_Dao.dao.CategoriaDao;
import Modulo03.Aula36_Dao.dao.ConnectionFactory;
import Modulo03.Aula36_Dao.model.Categoria;


public class ViewSelect {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {            
           CategoriaDao dao = new CategoriaDao(conn);

           for (Categoria c : dao.list()) {
               System.out.println(c);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}    
    

