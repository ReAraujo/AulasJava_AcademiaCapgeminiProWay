package Modulo02.Aula12.aula12_04_10;

public class TelaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Renata");
        String n = p1.getNome();
        System.out.println(n);

        p1.setSobrenome("Tozatti");
        String s = p1.getSobrenome();
        System.out.println(s);

        p1.setIdade(31);
        int i = p1.getIdade();
        System.out.println(i);

        p1.setCpf("123.456.789-56");
        String c = p1.getCpf();
        System.out.println(c);




        

    }
    
}
