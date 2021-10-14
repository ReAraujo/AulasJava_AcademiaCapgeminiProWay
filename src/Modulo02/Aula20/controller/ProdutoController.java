package Modulo02.Aula20.controller;

import java.util.ArrayList;
import Modulo02.Aula20.model.Produto;

public class ProdutoController {
    private ArrayList<Produto>  produtos = new ArrayList<Produto>();

    public void salvar(Produto p){
        this.produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return produtos;

    }



    
}
