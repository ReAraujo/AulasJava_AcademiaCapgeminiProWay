package Modulo02.Aula22.P2;

public class PessoaFisica extends Pessoa {
    public String cpf;

    @Override
    public String toString() {
        return this.nome + " " + this.cpf;
    }
    
}
