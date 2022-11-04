import br.com.dio.desafio.dominio.Caixa;
import br.com.dio.desafio.dominio.Funcionario;
import br.com.dio.desafio.dominio.Gerente;
import br.com.dio.desafio.dominio.Produtos;

public class Main {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente("fulano", 123);
        System.out.println(g1.getNome());
        System.out.println(g1.getSenha());

        Funcionario c1 = new Caixa("Fulana", 333);
        System.out.println(c1.getNome());
        System.out.println(c1.getSenha());

        Produtos p = new Produtos(01111, "indaia", "agua mineral", 20);
        Produtos p2 = new Produtos();





    }
}