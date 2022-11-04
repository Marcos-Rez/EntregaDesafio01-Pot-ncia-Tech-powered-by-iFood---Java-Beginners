package br.com.dio.desafio.dominio;

import java.util.*;

public class Produtos {
    private Integer codigo;
    private String marca;
    private String descricao;
    private Integer quantidade;

    public Produtos(Integer codigo, String marca, String descricao, Integer quantidade) {
        this.codigo = codigo;
        this.marca = marca;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    public Produtos(){

    }

    Map<Integer, Produtos> produtos = new HashMap<>();

    public Produtos getCodigo(Integer codigo){
        return produtos.get(codigo);
    }

    public void setProdutos(Integer codigo, String marca, String descricao, Integer quantidade ){
        Map<Integer, Produtos> produtos = new HashMap<>();
        produtos.put(codigo, new Produtos(codigo, marca, descricao, quantidade));
    }



    /*public void setProdutos(Produtos produtos.codigo) {
        produtos.put(codigo);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos1 = (Produtos) o;
        return Objects.equals(descricao, produtos1.descricao) && Objects.equals(codigo, produtos1.codigo) && Objects.equals(quantidade, produtos1.quantidade) && Objects.equals(produtos, produtos1.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, codigo, quantidade, produtos);
    }
}
