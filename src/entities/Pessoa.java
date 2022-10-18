package entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String profissao;
    private String email;

    public Pessoa(String nome, String cpf, String dataNascimento, String profissao, String email) throws ParseException {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = formatador.parse(dataNascimento);
        this.profissao = profissao;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
