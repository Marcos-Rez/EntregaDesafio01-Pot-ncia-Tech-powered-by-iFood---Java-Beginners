package br.com.dio.desafio.dominio;

public class Usuario {
    private String nome;
    private Integer senha;

    public Usuario(String nome, Integer senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
