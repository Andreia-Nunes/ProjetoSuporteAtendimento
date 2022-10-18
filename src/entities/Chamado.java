package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Chamado {
    private int id;
    private Date dataAbertura;
    private StatusSuporte status;
    private Cliente cliente;
    private Atendente atendente;

    public Chamado(Cliente cliente, Atendente atendente){
        this.id = new Random().nextInt();
        this.dataAbertura = new Date();
        this.status = StatusSuporte.ABERTO;
        this.cliente = cliente;
        this.atendente = atendente;
    }

    public int getId() {
        return id;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public StatusSuporte getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setStatus(StatusSuporte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        return  "ID: " + id + "\n" +
                "Data de abertura: " + formatador.format(dataAbertura) + "\n" +
                "Status: " + status + "\n" +
                "Cliente: " + cliente + "\n" +
                "Atendente: " + atendente + "\n";
    }
}
