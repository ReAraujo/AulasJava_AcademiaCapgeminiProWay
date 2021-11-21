package Modulo02.Aula25.model;

public abstract class Pessoa extends Base { // Herança
    public String nome;
    public Endereco enderecoResidencial; // Composição (trazendo outra classe como parâmetro)
    public Endereco enderecoComercial;

    
}