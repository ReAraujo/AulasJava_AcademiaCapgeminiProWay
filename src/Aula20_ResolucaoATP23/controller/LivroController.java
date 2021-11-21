package Modulo02.Aula20_ResolucaoATP23.controller;

import java.util.ArrayList;
import Modulo02.Aula20_ResolucaoATP23.model.Livro;

public class LivroController {
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    //CRUD
    public void create(Livro livro){
        this.livros.add(livro);
    }
    public ArrayList<Livro> read(){
        return this.livros;
    }
    public void update(Livro livro){
        
    }
    public void delete(Livro livro){
        this.livros.remove(livro);
    }



    
}
