package app;

import entities.Atendente;
import entities.Chamado;
import entities.Cliente;
import entities.NivelSuporte;

import java.text.ParseException;
import java.util.Scanner;

public class TesteSuporte {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações do cliente:");

        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("CPF: ");
        String cpfCliente = sc.next();

        System.out.print("Data de nascimento: ");
        String nascimentoCliente = sc.next();

        System.out.print("Profissão: ");
        String profissaoCliente = sc.next();

        System.out.print("E-mail: ");
        String emailCliente = sc.next();

        System.out.println();

        System.out.println("Insira as informações do atendente:");

        System.out.print("Nome: ");
        sc.nextLine();
        String nomeAtendente = sc.nextLine();

        System.out.print("CPF: ");
        String cpfAtendente = sc.next();

        System.out.print("Data de nascimento: ");
        String nascimentoAtendente = sc.next();

        System.out.print("Profissão: ");
        String profissaoAtendente = sc.next();

        System.out.print("E-mail: ");
        String emailAtendente = sc.next();

        System.out.print("Nível de suporte: ");
        NivelSuporte ns = NivelSuporte.valueOf(sc.next());


        Cliente c1 = new Cliente(nomeCliente, cpfCliente, nascimentoCliente, profissaoCliente, emailCliente);
        Atendente a1 = new Atendente(nomeAtendente, cpfAtendente, nascimentoAtendente, profissaoAtendente, emailAtendente, ns);

        Chamado chamado  = c1.abrirChamado(a1);
        a1.assumirChamado(chamado);

        System.out.println();
        System.out.println("INFORMAÇÕES DO CHAMADO:");
        System.out.println(chamado);

    }
}
