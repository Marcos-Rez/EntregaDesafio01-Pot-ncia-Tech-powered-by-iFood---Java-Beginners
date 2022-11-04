package br.com.dio.desafio.dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ProdutosCadastrados {
     HashMap<Integer, Produtos> produtos = new HashMap<>();

    public void setProdutos(Integer codigo, Produtos p){
        produtos.put(codigo, p);
    }
    
    public void getProdutos(Integer codigo){

        System.out.println(produtos.get(codigo).toString());
    }

    public void getLista(){
        Set<Map.Entry<Integer, Produtos>> entries = produtos.entrySet();
        for (Map.Entry<Integer, Produtos> produto : entries){
            System.out.println(produto.toString());

        }
    }

    @Override
    public String toString() {
        return "ProdutosCadastrados{" +
                "produtos=" + produtos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutosCadastrados that = (ProdutosCadastrados) o;
        return Objects.equals(produtos, that.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtos);
    }
}
