package Modulo02.Aula20.model;

public class Produto {
    private String nome;
    private double valor;
    private String marca;

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    @Override
    public String toString() {
        return this.nome + "," + this.valor;
    }
    
}
