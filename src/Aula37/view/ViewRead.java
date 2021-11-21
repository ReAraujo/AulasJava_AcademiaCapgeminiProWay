package Modulo03.Aula37.view;

import Modulo03.Aula37.dao.CategoriaDao;
import Modulo03.Aula37.model.Categoria;

public class ViewRead {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        for (Categoria c : dao.read()) {
            System.out.printf("%d - %s\n", c.getId(), c.getNome());  
        }
    }
    
}
