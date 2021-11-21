package Modulo03.Aula37.view;

import java.util.Scanner;
import Modulo03.Aula37.model.Categoria;
import Modulo03.Aula37.dao.*;


public class ViewUpdate {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("\nDigite o id para alterar: ");
            int id = Integer.parseInt(sc.nextLine());            
            model.setId(id); 

            System.out.printf("\nDigite o novo nome da categoria: ");
            String nome = sc.nextLine();            
            model.setNome(nome);

        } catch (Exception e) {
            System.out.println("Não foi possivel ler");
        } 

        int linhasAfetadas = dao.update(model);
        System.out.println(linhasAfetadas);
    }
    
}
