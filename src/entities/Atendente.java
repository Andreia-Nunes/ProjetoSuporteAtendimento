package entities;

import java.text.ParseException;
import java.util.Date;

public class Atendente extends Pessoa {
    private NivelSuporte nivelSuporte;

    public Atendente(String nome, String cpf, String dataNascimento, String profissao, String email, NivelSuporte nivelSuporte) throws ParseException {
        super(nome, cpf, dataNascimento, profissao, email);
        this.nivelSuporte = nivelSuporte;
    }

    public NivelSuporte getNivelSuporte() {
        return nivelSuporte;
    }

    public void setNivelSuporte(NivelSuporte nivelSuporte) {
        this.nivelSuporte = nivelSuporte;
    }

    public void assumirChamado(Chamado chamado){
        chamado.setStatus(StatusSuporte.TRATAMENTO);
    }

    public void finalizarChamado(Chamado chamado){
        chamado.setStatus(StatusSuporte.RESOLVIDO);
    }
}
