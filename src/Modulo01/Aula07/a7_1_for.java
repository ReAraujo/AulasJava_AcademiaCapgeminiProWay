package Modulo01.Aula07;

import java.util.Scanner;

public class a6_6_atividadepraticafor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Seja bem-vindo(a) ao ambiente de cadastro!");
        for (int i=1; i<=4; i++){
            System.out.println("Informe o nome: ");
            String nome = sc.next();
            System.out.println("Informe o sobrenome: ");
            String sobrenome = sc.next();

            System.out.printf("Nome: %s. Sobrenome: %s.", nome, sobrenome);

        }
    }
}
