package br.com.entra21.beckend;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private Scanner input;
	private String titulo;
	private ArrayList<String> opcoes;

	public Menu(String titulo, ArrayList<String> opcoes) {
		super();
		this.input = new Scanner(System.in);
		this.titulo = titulo;
		this.opcoes = opcoes;
	}

	public void executarMenu() {
		do {
			System.out.println("\n\t################| GREEN BANK " + this.titulo + "|################\n");
			System.out.println("\t0 > | FECHAR APP |");
			System.out.println("\t1 > | MENU PRINCIPAL |");

			if (opcoes != null && !opcoes.isEmpty()) {
				for (int contador = 0; contador < opcoes.size(); contador++) {
					System.out.println("\t" + (contador + 2) + " > " + opcoes.get(contador));
				}
			} else {
				System.out.println("Não há itens especificos para esse menu???");
			}
			System.out.println("\t______________________________________________\n");
			System.out.print("\tEscolha uma opção: ");

		} while (capturarOpcao() != 1);
	}

	public byte capturarOpcao() {

		byte opcao = input.nextByte();

		switch (opcao) {

		case 0:
			System.out.println("\n\tObrigado por usar o Green Bank, VOLTE SEMPRE!");
			System.exit(0);
			break;

		case 1:
			break;

		}
		return opcao;
	}

	public String getTitulo() {
		return titulo;
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

}
