package br.com.entra21.beckend.login;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.beckend.ConfirmandoLogin;
import br.com.entra21.beckend.Menu;

public class Login extends Menu {

	ArrayList<String> opcoes = new ArrayList<String>(Arrays.asList("| DADOS BANCÁRIOS |", "| DEPÓSITO |", "| SACAR |",
			"| TRANSFERÊNCIA GREEN BANK |", "| PIX |", "| INVESTIMENTOS |", "| SALDO |"));

	public Login(String titulo, ArrayList<String> opcoes) {
		super(titulo, opcoes);

	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			new MenuPrincipalPF("MENU PRINCIPAL", opcoes, ConfirmandoLogin.buscar()).executarMenu();
			break;

		case 3:

			break;

		default:
			break;
		}

		return opcao;
	}

}
