package br.com.dio.desafio.dominio;

import java.util.HashMap;
import java.util.Map;

public class ProdutosCadastrados {
     HashMap<Integer, Produtos> produtos = new HashMap<>();

    public void setProdutos(Integer codigo, Produtos p){
        produtos.put(codigo, p);
    }
    
    public void getProdutos(Integer codigo){
        System.out.println(produtos.get(codigo));

    }

    @Override
    public String toString() {
        return "ProdutosCadastrados{" +
                "produtos=" + produtos +
                '}';
    }
}
