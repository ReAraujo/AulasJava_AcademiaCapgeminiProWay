package Modulo02.Aula25.view;

import Modulo02.Aula25.model.PessoaFisica;
import Modulo02.Aula25.model.Endereco;


public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.id = 10;
        pf.nome = "Inex";

        Endereco  end1 = new Endereco();
        end1.logradouro = "Av JK";
        end1.numero = "123";
        end1.complemento = "31A";
        end1.cep = "56.326-89";
        end1.cidade = "Cidadelândia";
        end1.estado = "Estadolândia";

        pf.enderecoResidencial = end1; // Atribuição do objeto Endereço (end1) ao objeto de PessoaFisica de endereço Residencial
        pf.enderecoComercial = end1; // Atribuição do objeto Endereço (end1) ao objeto de PessoaFisica de endereço Comercial

        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        System.out.println("Alterações");
        end1.logradouro = "Av Brasil";

        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);


        end1 = new Endereco();
        System.out.println(end1.logradouro);
        System.out.println(pf.enderecoResidencial.logradouro);
        System.out.println(pf.enderecoComercial.logradouro);

        
        




    }
    
}
