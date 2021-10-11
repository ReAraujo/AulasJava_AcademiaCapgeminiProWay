package Modulo02.Aula13.aula13A;

public class ArrayStrings {
    public static void main(String[] args) {

        String[] nomes = new String[7];

        // Valor default para string == null
        System.out.println(nomes[0]);

        nomes[0] = "Renata";
        nomes[1] = "Vagner";
        nomes[2] = "Baguera";
        nomes[3] = "Mia";
        nomes[4] = "Mora";
        nomes[5] = "Apolo";
        nomes[6] = "Cherie";

        // Percorrendo o array através do laço for
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
    
}
