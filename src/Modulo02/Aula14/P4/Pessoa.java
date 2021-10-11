package Modulo02.Aula14.P4;

public class Pessoa {
    private String nome;
    private String sobrenome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }

    @Override
    public String toString(){
        String retorno = this.nome + ", " + this.sobrenome;
        return retorno;
    }
    
}
