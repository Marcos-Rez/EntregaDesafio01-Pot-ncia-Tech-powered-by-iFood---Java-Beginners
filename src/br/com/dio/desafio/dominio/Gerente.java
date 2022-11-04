package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gerente extends Funcionario {
    public Gerente(String nome, Integer senha) {
        super(nome, senha);
    }

    @Override
    public LocalDateTime controleDePonto() {
        return null;
    }
}
