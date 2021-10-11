package Modulo02.Aula14.P4;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Michael");
        p1.setSobrenome("Douglas");
    
        Funcionario f1 = new Funcionario();
        f1.setNome("Catherine");
        f1.setSobrenome("Zeta-Jones");

        System.out.println(f1);
        System.out.println(p1);

    }
    
}
