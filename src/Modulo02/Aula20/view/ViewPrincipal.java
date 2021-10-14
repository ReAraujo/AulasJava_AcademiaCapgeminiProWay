package Modulo02.Aula20.view;

import java.util.Scanner;

public class ViewPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        int opcao = Integer.parseInt(sc.nextLine());

        switch(opcao){
            case 1:
                ProdutoView pv = new ProdutoView();
                pv.executa();
            break;
            case 2: 
                CategoriaView cv = new CategoriaView();
                cv.executa();
            break;    
        }

    }
    
}
