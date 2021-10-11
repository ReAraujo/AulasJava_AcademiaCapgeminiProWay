// dia 21.09.2021
// Módulo 2 - Aula 9 - Procedimentos, Funções e Métodos
// SRP - Single Responsability Principle: Princípio da responsabilidade única
package Modulo02.Aula09;

import java.util.Scanner;

public class a9_1_metodos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    static void cabecalho(){
        System.out.println("========== Cabeçalho ==========\n");
    }
    static void imprime_menu(){
        System.out.println("Menu: ");
        System.out.println("\t1 - Soma");
        System.out.println("\t2 - Subtração");
        System.out.println("\t3 - Divisão");
        System.out.println("\t4 - Multiplicação");
        System.out.println("\t0 - Sair");
    }
    static void escolha_menu(){
        int op = ler_numero("Digite uma opção do menu: ");
        int n1=0, n2=0, r=0;

        if(op > 0) {
            n1 = ler_numero("Digite o primeiro numero: ");
            n2 = ler_numero("Digite o segundo numero: ");
        }
        switch (op){
            case 1: //soma
                r = soma(n1, n2);
                break;
            case 2: // subtração
                r = subtracao(n1, n2);
                break;
            case 3: // divisão
                r = divisao(n1, n2);
                break;
            case 4: // multiplicação
                r = multiplicacao(n1, n2);
                break;
            case 0: // sair
                return;
        }
        System.out.printf("O resultado da soma é %d ", r);
    }
    static int ler_numero(String mensagem){
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;

    }
    // ========= operações
    static int soma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    static int subtracao(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }
    static int divisao(int numero1, int numero2) {
        int resultado = numero1 / numero2;
        return resultado;
    }
    static int multiplicacao(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }
}
