package Modulo03.Aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Modulo03.Aula35_Pool_ConnectionFactory.utils.ConnectionFactory;

public class ViewCreate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            String nome = "TestePrepared";
            
            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);

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
}
    
