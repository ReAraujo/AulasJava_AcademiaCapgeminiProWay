package Modulo03.Aula32_Dao_Interface.P3;

public class View {
    public static void main(String[] args) {
        IController c = new Controller();
        String retorno = c.salvar("sasdasdsada");
        System.out.println(retorno);


    }
    
}
