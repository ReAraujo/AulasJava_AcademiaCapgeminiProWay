package Modulo03.Aula37.dao;

import java.sql.Statement;

import Modulo03.Aula37.model.Categoria;
import Modulo03.Aula37.utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDao {
    public void insert(Categoria model){
        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());

            prepStatement.execute();            
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Categoria> read() {
        ArrayList<Categoria> list = new ArrayList<Categoria>();

        try(Connection conn = new ConnectionFactory().getConnection()) {            
            
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();
            while(result.next()){
                Categoria model = new Categoria();                
                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                list.add(model);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
