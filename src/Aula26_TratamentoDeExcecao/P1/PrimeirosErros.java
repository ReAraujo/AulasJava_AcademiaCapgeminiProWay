package Modulo02.Aula26_TratamentoDeExcecao.P1;

public class PrimeirosErros {
    public static void main(String[] args) {
        String nome = null;
        //nome.length();
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "nome" is null

        int idade = Integer.parseInt("-10abc"); // NumberFormatException

        if(idade <= 0 || idade > 150){
            throw new IllegalArgumentException("Idade inválida!"); // Lançando uma exceção
        }
        // Exception in thread "main" java.lang.IllegalArgumentException: Idade inválida!
        



    }
    
}
