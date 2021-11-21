package Modulo03.Aula32_Dao_Interface.Resolucao_ATP40.Ex2;

public class PontoTuristico {
    public String nome;
    public String descricao;
    public String localizacao;

    @Override
    public String toString() {        
        return String.format("%s;%s;%s", this.nome, this.descricao, this.localizacao);
    }
}
