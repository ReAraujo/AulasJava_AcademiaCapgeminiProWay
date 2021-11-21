package Modulo03.Aula36_Dao.view;

import java.sql.Connection;
import java.sql.SQLException;
import Modulo03.Aula35_Pool_ConnectionFactory.utils.ConnectionFactory;
import Modulo03.Aula36_Dao.dao.CategoriaDao;
import Modulo03.Aula36_Dao.model.Categoria;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDao dao  = new CategoriaDao(conn);
            Categoria model = new Categoria(30, "TesteAlteracaoDao");
            System.out.println(dao.update(model));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
