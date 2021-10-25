package Modulo02.Aula26_TratamentoDeExcecao;

import java.util.ArrayList;

public class MaisAlgunsErros {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        //System.out.println(numeros[6]);
        // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Renata");
        nomes.add("Vagner");
        nomes.add("Mora");

        System.out.println(nomes.get(5));
        // java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 3






    }
    
}
