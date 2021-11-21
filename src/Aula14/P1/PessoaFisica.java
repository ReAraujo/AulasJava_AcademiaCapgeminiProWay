package Modulo02.Aula14.P1;

// Herança - extends 
public class PessoaFisica extends Pessoa {
    private String rg;
    private String cpf;

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return this.rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    
}
