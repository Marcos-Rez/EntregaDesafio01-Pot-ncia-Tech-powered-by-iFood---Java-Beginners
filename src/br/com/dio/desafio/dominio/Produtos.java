package br.com.dio.desafio.dominio;

import java.util.*;

public class Produtos{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(codigo, produtos.codigo) && Objects.equals(marca, produtos.marca) && Objects.equals(descricao, produtos.descricao) && Objects.equals(quantidade, produtos.quantidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, marca, descricao, quantidade);
    }
}
