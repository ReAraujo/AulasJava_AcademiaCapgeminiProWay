package Modulo03.Aula32_.view;

import Modulo03.Aula32_.controller.PessoaController;
import Modulo03.Aula32_.model.Pessoa;

public class PessoaView {
    public static void main(String[] args) {
        PessoaController pc= new PessoaController();
        //Pessoa p1 = new Pessoa();
        //p1.id = 1;
        //p1.nome = "Inex";
        //p1.sobrenome = "Brasilix";

        //pc.create(p1);

        for (Pessoa p : pc.read()) {
            System.out.println(p);
        }
        







    }
    
}
