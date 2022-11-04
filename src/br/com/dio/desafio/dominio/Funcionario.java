package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Funcionario {
    private String nome;
    private Integer senha;

    private LocalDateTime horario;

    public abstract LocalDateTime controleDePonto();

    public Funcionario(String nome, Integer senha) {
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
