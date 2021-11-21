package Modulo02.Aula11;

public class a011 {
    public static void main(String[] args) {
        int numero = -10;
        // Criando uma instância da classe Produto, ou seja, um objeto
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "TV da Xuxa";
        produto1.valor = 99.98;

        Produto produto2 = new Produto();
        produto2.nome = "Smartfone";
        produto2.descricao = "Telefone caro";
        produto2.valor = 13899.99;

        System.out.println(numero);
        System.out.println(produto1.nome);
        System.out.println(produto2.nome);
    }
    
}
