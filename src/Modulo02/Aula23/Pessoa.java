package Modulo02.Aula23;

public class Pessoa {
    public String nome;
    public String sobrenome;

    @Override
    public boolean equals(Object obj) {
        Pessoa outraPessoa = (Pessoa)obj;
        if(this.nome.equals(outraPessoa.nome) && this.sobrenome.equals(outraPessoa.sobrenome)){
            return true;
        }
    return false;
    }
}
