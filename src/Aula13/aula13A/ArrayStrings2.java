package Modulo02.Aula13.aula13A;

public class ArrayStrings2 {
    public static void main(String[] args) {

        String[] nomes = new String[7];

        nomes[0] = "Renata";
        nomes[1] = "Vagner";
        nomes[2] = "Baguera";
        nomes[3] = "Mia";
        nomes[4] = "Mora";
        nomes[5] = "Apolo";
        nomes[6] = "Cherie";

        // Percorrendo o array através do laço for it 
        // essa forma é mais fácil para impressões, porém não permite varredura do array
        // imprime uma lista inteira
        for (String n : nomes){
            System.out.println(n);

        }

    }
    
}