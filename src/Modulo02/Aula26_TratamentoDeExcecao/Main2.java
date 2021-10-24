package Modulo02.Aula26_TratamentoDeExcecao;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Entrando na main");
        metodo1();
        System.out.println("Saindo na main");

    }

    // Pilha de execução
    public static void metodo1(){
        System.out.println("Entrando no método 1");
        metodo2();
        System.out.println("Saindo do método 1");
    }

    public static void metodo2(){
        System.out.println("Entrando no método 2");
        System.out.println("Saindo do método 2");
    }


    
}
