package Modulo02.Aula16.P3;

public class Tela2 {
    public static void main(String[] args) {

        Pessoa[] lista = new Pessoa[7];
        Pessoa p1 = new Pessoa("Renata", "Tozatti");
        Pessoa p2 = new Pessoa("Vagner", "Tozatti");
        Pessoa p3 = new Pessoa("Mora", "Tozatti");
        Pessoa p4 = new Pessoa("Mia", "Tozatti");
        Pessoa p5 = new Pessoa("Baguera", "Tozatti");
        Pessoa p6 = new Pessoa("Cherie", "Tozatti");
        Pessoa p7 = new Pessoa("Apolo", "Tozatti");
        lista[0] = p1;
        lista[1] = p2;
        lista[2] = p3;
        lista[3] = p4;
        lista[4] = p5;
        lista[5] = p6;
        lista[6] = p7;
        
        for(Pessoa p: lista){
            System.out.println(p);
        }




        




    }
    
}
