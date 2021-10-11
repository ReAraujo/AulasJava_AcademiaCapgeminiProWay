package Modulo01.Aula04;

import java.util.Scanner;

public class a4_3_swithCaseExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de clientes");
        System.out.println("\t 1 - Cadastar");
        System.out.println("\t 2 - Listar");
        System.out.println("\t 0 - Sair");
        System.out.println("Escolha uma opção no menu:");

        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Opção escolhida: Cadastrar clientes");

                System.out.println("Opção escolhida: Cadastrar clientes");
                break;
            case 2:
                System.out.println("Opção escolhida: Listar clientes");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
        }

    }

}
