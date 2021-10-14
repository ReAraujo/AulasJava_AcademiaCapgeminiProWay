package Modulo02.Aula20_1.controller;

import java.util.ArrayList;
import Modulo02.Aula20_1.model.Artista;

public class ArtistaController {
    private ArrayList<Artista> artistas = new ArrayList<Artista>();

    public void salvar(Artista a){
        artistas.add(a);
    }

    public ArrayList<Artista> listar(){
        return artistas;
        
    }
    
}
