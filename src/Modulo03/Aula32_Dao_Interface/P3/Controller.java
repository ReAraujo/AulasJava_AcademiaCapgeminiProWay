package Modulo03.Aula32_Dao_Interface.P3;

public class Controller implements IController{

    public String salvar(String dado) {
        return "Dado: " + dado + "Salvo com sucesso!" ;
    }
    
}
