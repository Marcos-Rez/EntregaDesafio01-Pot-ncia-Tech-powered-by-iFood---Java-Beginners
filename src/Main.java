import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("fulano", 123);
        System.out.println(g1.getNome());
        System.out.println(g1.getSenha());

        Funcionario c1 = new Caixa("Fulana", 333);
        System.out.println(c1.getNome());
        System.out.println(c1.getSenha());

        Produtos aguaMineral = new Produtos(5555, "indaia", "agua mineral sem gas", 50);
        Produtos sabaoOMO = new Produtos(6363, "OMO", "sabao em pó", 80);
        Produtos sabaoLimpol = new Produtos(2020, "Limpol", "sabao em pó", 45);
        Produtos leiteNinho = new Produtos(3030, "limpol", "desinfetante", 55);

        ProdutosCadastrados p = new ProdutosCadastrados();

        p.setProdutos(5555, aguaMineral);
        p.setProdutos(2020, sabaoLimpol);
        p.setProdutos(6363, sabaoOMO);
        p.setProdutos(3030, leiteNinho);

        p.getProdutos(2020);
        p.getProdutos(3030);









    }
}