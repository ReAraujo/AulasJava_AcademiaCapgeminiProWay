package Modulo02.Aula16.P4;

public class Tela1 {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        double r1 = c.soma(10, 20);
        double r2 = c.soma(10, 20, 30);
        double r3 = c.soma(10.2, 50.89);
        double r4 = c.soma("10", "20");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


    }
    
}
