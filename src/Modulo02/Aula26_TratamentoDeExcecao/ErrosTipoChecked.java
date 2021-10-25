package Modulo02.Aula26_TratamentoDeExcecao;

import java.io.File;
import java.io.IOException;

public class ErrosTipoChecked {
    public static void main(String[] args) {
        File arquivo = new File("teste.txt");

        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            System.out.println("Deu ruim!");
        }
    }
}
