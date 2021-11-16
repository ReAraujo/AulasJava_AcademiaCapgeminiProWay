package Modulo03.Aula37.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Modulo03.Aula37.utils.ConnectionFactory;
import Modulo03.Aula37.model.Categoria;

public class ViewCreate {
    public static void main(String[] args) {
        Categoria model = new Categoria();
        Categoria model2 = new Categoria();

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("\nDigite a cat1: ");
            model.setNome(sc.nextLine());
    
            System.out.print("\nDigite a cat2: ");
            model.setNome(sc.nextLine());            
        } catch (Exception e) {
            System.out.println("Erro ao ler");
        }

        insert(model);
        insert(model2);
        
    }

    private static void insert(Categoria model){ 
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
}
    
