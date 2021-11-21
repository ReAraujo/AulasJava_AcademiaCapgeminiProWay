package Modulo01.Aula03;

import java.util.Scanner;

public class a3_1_cadastroclientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== Cadastro de Clientes ==========\n");
        System.out.println("\tBem-vindo. Digite as informações do cliente: ");
        System.out.printf("\tDigite o nome do cliente: ");
        String nome = sc.next();
        System.out.print("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("\tO/A cliente %s de idade %d foi cadastrado(a) com sucesso!\n", nome, idade);
    }

}
