package Modulo02.Aula14.P4;

public class Funcionario extends Pessoa {
    private double salario;
    private double departamento;

    @Override
    public void setNome(String nome){
        if (nome.length() > 0){
            super.setNome(nome);
        } 
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }

    public void setDepartamento(double departamento) {
        this.departamento = departamento;
    }
    public double getDepartamento() {
        return this.departamento;
    }
    
}
