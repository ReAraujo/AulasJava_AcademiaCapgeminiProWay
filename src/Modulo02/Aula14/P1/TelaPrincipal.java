package Modulo02.Aula14.P1;

public class TelaPrincipal {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Renata");
        System.out.println(pf.getNome());


        Cariopse c = new Cariopse();
        c.folha = "as";

        Moto m = new Moto();
        m.marca = "Honda";

        Carro car = new Carro();
        car.marca = "Fiat";
    }
    
}
