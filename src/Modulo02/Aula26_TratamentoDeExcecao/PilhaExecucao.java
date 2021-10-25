package Modulo02.Aula26_TratamentoDeExcecao;

import java.util.Scanner;

public class PilhaExecucao {
    public static void main(String[] args) {
        System.out.println("Entrando na main...");

        metodo1();

        System.out.println("Saindo na main...");
    }

    // Pilha de execução
    public static void metodo1() {
        System.out.println("Entrando no método 1...");
        metodo2();
        System.out.println("Saindo do método 1...");
    }

    public static void metodo2(){
        System.out.println("Entrando no método 2...");
        int idade = 0; // A variável precisa ser inicializada para ser testada no try + catch
        do{
            try{
                System.out.print("Digite sua idade: ");
                Scanner sc = new Scanner(System.in);
                idade = Integer.parseInt(sc.nextLine()); 

                if(idade < 0 || idade > 150){
                    throw new IllegalArgumentException("Idade inválida! Deve ser maior que zero e menor que 150!");
                }
            }
            catch(NumberFormatException ex){
                System.out.println("Dado inválido! Preencha novamente: ");
                idade = -1;
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage() + " Preencha novamente: ");
                idade = -1;
            }
        }while(idade == -1);

        System.out.println("Saindo do método 2...");
    }
    
}
