package Modulo02.Aula23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Object> a = new ArrayList<Object>();
        // a.size();

        Pessoa p1 = new Pessoa();
        p1.nome = "Jojo";
        p1.sobrenome = "DoCalypso";

        Carro c1 = new Carro();
        c1.marca = "VW";
        c1.modelo = "BrasiliaAmarela";
        
        Dados dados = new Dados();
        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));

        System.out.println(dados.contains(p1));
        System.out.println(dados.contains(c1));

        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));
        System.out.println(dados.add(p1));
        System.out.println(dados.add(c1));
        System.out.println(dados.size());

        //Como a lista é definida como um tipo da mãe (Object), ela aceita as duas filhas
        



        
    }
    
}
