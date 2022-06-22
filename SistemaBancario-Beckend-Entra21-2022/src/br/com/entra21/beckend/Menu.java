package br.com.entra21.beckend;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.entra21.beckend.annotation.Informacao;

@Informacao(value = "Gerador de Menus")
public class Menu {

	private Scanner input;
	private String titulo;
	private ArrayList<String> opcoes;
	static Instant start;

	public Menu(String titulo, ArrayList<String> opcoes) {
		super();
		this.input = new Scanner(System.in);
		this.titulo = titulo;
		this.opcoes = opcoes;
	}

	@Informacao(value = "Gera Menus Seguindo um Padr�o")
	public void executarMenu() {
		start = Instant.now();
		do {
			System.out.println("\n\t################| GREEN BANK " + this.titulo + "|################\n");
			System.out.println("\t0 > | FECHAR APP");
			System.out.println("\t1 > | MENU PRINCIPAL");

			if (opcoes != null && !opcoes.isEmpty()) {
				for (int contador = 0; contador < opcoes.size(); contador++) {
					System.out.println("\t" + (contador + 2) + " > " + opcoes.get(contador));
				}
			} else {
				System.out.println("N�o h� itens especificos para esse menu???");
			}
			System.out.println("\t______________________________________________\n");
			System.out.print("\tEscolha uma op��o: ");
			
		} while (capturarOpcao() != 1);
		
		
	}

	@Informacao(value = "Captura Op��o do Usu�rio")
	public byte capturarOpcao() {

		byte opcao = input.nextByte();
		
		switch (opcao) {

		case 0:
			System.out.println("\n\t- Obrigado por usar o Green Bank, VOLTE SEMPRE!");
			TempoNoPrograma.fim(start);
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
