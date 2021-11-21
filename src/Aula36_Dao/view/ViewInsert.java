package Modulo03.Aula36_Dao.view;

import java.sql.Connection;
import java.sql.SQLException;

import Modulo03.Aula36_Dao.dao.CategoriaDao;
import Modulo03.Aula36_Dao.dao.ConnectionFactory;
import Modulo03.Aula36_Dao.model.Categoria;

public class ViewInsert {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria cat1 = new Categoria("TesteDao1");
            Categoria cat2 = new Categoria("TesteDao2");

            dao.create(cat1);
            dao.create(cat2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
