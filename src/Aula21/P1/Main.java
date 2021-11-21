package Modulo02.Aula21.P1;

public class Main {
    public static void main(String[] args) {
        Mae mae = new Mae();
        Filha filha = new Filha();
        Neta neta = new Neta();


        Mae mae2 =  new Filha(); // id nome
        Mae mae3 =  new Neta();
        Mae mae4 = filha;
        Filha filha2 = new Neta();

        //mae.Falar();
        //filha.Falar();
        neta.Falar();

      

    }
    
}
