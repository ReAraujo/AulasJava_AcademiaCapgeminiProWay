package Modulo03.Aula36_Dao.view;

import java.sql.Connection;
import java.sql.SQLException;
import Modulo03.Aula36_Dao.dao.CategoriaDao;
import Modulo03.Aula36_Dao.dao.ConnectionFactory;

public class ViewDelete{
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) 
        {            
            CategoriaDao dao = new CategoriaDao(conn);
            dao.delete(25);   
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
