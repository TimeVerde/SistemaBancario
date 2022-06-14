package br.com.entra21.beckend.cadastro;

import java.util.ArrayList;

import br.com.entra21.beckend.Menu;

public class Cadastros extends Menu {

	public Cadastros(String titulo, ArrayList<String> opcoes) {
		super(titulo, opcoes);
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			new ContaFisicaCrud().executarMenu();
			break;

		case 3:
			new ContaJuridicaCrud().executarMenu();
			break;
				
		}

		return opcao;
	}

}
