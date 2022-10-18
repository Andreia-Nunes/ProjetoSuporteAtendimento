package entities;

import java.text.ParseException;
import java.util.Date;

public class Cliente extends Pessoa{

    public Cliente(String nome, String cpf, String dataNascimento, String profissao, String email) throws ParseException {
        super(nome, cpf, dataNascimento, profissao, email);
    }

    public Chamado abrirChamado(Atendente atendente){
        return new Chamado(this, atendente);
    }

}
