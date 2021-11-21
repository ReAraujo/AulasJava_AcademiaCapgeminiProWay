package Modulo01.Aula04;

public class a4_1_condicionalsimplesecomposta {
    public static void main(String[] args) {

        boolean verdade = true; //1 - com sinal eletrico - pulso eletrico
        boolean falso = false; //0 - sem sinal eletrico

        int n1 = 5;
        int n2 = 6;

        if(n1 > n2) {
            System.out.println("Maior");
        } else if (n1 < n2) {
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }
}
