package Modulo03.Aula37.view;

import java.util.Scanner;
import Modulo03.Aula37.model.Categoria;
import Modulo03.Aula37.dao.*;

public class ViewDelete {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("\nDigite o id para deletar");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id); 
            
        } catch (Exception e) {
            System.out.println("Não foi possivel ler");
        }        

        int lAfetadas = dao.delete(model);
        System.out.println(lAfetadas);  
    }
    
}
