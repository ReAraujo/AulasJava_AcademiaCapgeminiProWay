package Modulo02.Aula14.P1;

import java.util.Date;

public class Pessoa {
    private int codigo;
    private String nome;
    private Date data_nascimento;
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public Date getData_nascimento() {
        return this.data_nascimento;
    }


    
}
