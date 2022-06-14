package br.com.entra21.beckend.login;

import java.util.ArrayList;

import br.com.entra21.beckend.Menu;

public class MenuPrincipalPJ extends Menu {

	public MenuPrincipalPJ(String titulo, ArrayList<String> opcoes) {
		super(titulo, opcoes);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			break;

		case 3:
			break;

		case 4:
			break;

		case 5:
			break;

		case 6:
			break;

		case 7:
			break;

		default:
			System.out.println("\n\tPor favor, insira um opção válida");
			break;
		}

		return opcao;
	}

}
