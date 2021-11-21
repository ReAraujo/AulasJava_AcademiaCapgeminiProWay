package Modulo02.Aula19.P1;

public class StringsMain {
    public static void main(String[] args) {
        String nome = "Inês";
        String nome2 = "inês";

        //nome = nome.replace('s', 'z');
        // nome = nome.toUpperCase();
        // nome2 = nome2.toUpperCase();

        boolean igual = nome.toUpperCase().equals(nome2.toUpperCase());

        System.out.println(igual);
        System.out.println(nome);
        System.out.println(nome2);

        


        // String[] lista = "Renata, Tozatti, 31".split(",");
        // for(String l : lista){
        //     System.out.println(l);
        // }

        // String n = "      Renata Tozatti       ";
        // System.out.println(n.strip());
        // System.out.println(n.trim());
        
    }
    
}
