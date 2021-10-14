package Modulo02.Aula20.view;

import java.util.ArrayList;
import Modulo02.Aula20.model.Produto;
import Modulo02.Aula20.controller.ProdutoController;

public class ProdutoView {
    
    public static void executa() {
        Produto p = new Produto("TV", 1999.99);

        p.setMarca("Samsurg");

        ProdutoController controller = new ProdutoController();
        controller.salvar(p);
        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods) {
            System.out.println(prodSalvo);
            
        }

    }
    
}
