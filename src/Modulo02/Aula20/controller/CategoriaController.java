package Modulo02.Aula20.controller;

import java.util.ArrayList;
import Modulo02.Aula20.model.Categoria;

public class CategoriaController {
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();   
    
    public void salvar(Categoria c){
        this.categorias.add(c);
    }

    public ArrayList<Categoria> listar(){
        return categorias;

    }
}
