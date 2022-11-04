package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Caixa extends Funcionario {

    @Override
    public LocalDateTime controleDePonto() {
        return null;
    }

    public Caixa(String nome, Integer senha) {
        super(nome, senha);

    }
}