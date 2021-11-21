package Modulo02.Aula11;

public class Calculadora {

    int somar(int n1, int n2){
        int s = n1 + n2;
        return s;
    }

    int subtrair(int n1, int n2){
        int s = n1 - n2;
        return s;
    }

    int multiplicar(int n1, int n2){
        int s = n1 * n2;
        return s;
    }

    int dividir(int n1, int n2){
        int s = n1 / n2;
        return s;
    }
    private boolean valida(int n){
        if (n < 0){
            return false;
        }
        return true;
    }
    
}
