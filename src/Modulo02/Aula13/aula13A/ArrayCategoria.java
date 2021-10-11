package Modulo02.Aula13.aula13A;

public class ArrayCategoria {
    public static void main(String[] args) {

        Categoria[] categorias = new Categoria[2];

        Categoria cat1 = new Categoria();
        cat1.setNome("Eletro");
        cat1.setDescricao("Eletroeletrônico");

        Categoria cat2 = new Categoria();
        cat2.setNome("Smartphones");
        cat2.setDescricao("Telefones que tem apps");

        categorias[0] = cat1;
        categorias[1] = cat2;

        for (Categoria c : categorias){
            System.out.printf("%s - %s\n", c.getNome(), c.getDescricao());

        }
        
    }
    
}
