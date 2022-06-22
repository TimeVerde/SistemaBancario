package br.com.entra21.beckend;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.beckend.annotation.Informacao;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> opcoes;

	
	public static void main(String[] args) {
		
		Armazenar.gerarMassaTeste();
		gerarData();
		
		Instant start = Instant.now();

		byte option; // TODO L�gica - Variaveis
		final byte ZERO = 0; // TODO L�gica - Constante

		do { // TODO L�gica - do-while

			System.out.println(montarMenu());
			System.out.print("\tEscolha uma opcao: ");
			option = input.nextByte();

			switch (option) { // TODO L�gica - Switch

			case ZERO:
				System.out.println("\n\t- Obrigado por usar o Green Bank, VOLTE SEMPRE!");
				break;

			case 1:
				Principal.login();
				break;

			case 2:
				Principal.cadastrar();
				break;
				
			case 3:
				// Estou Atualizando
				Principal.alterarSenha();
				break;

			case 4:
				Principal.sobre();
				break;

			default:
				System.out.println("\n\t- Por favor, insira um op��o v�lida.");
				break;
			}
		} while (option != 0);
		
		TempoNoPrograma.fim(start);
	}

	public static String montarMenu() {
		if (opcoes == null) {
			opcoes = new ArrayList<>(Arrays.asList("| FECHAR APP", "| ENTRAR CONTA GREEN", "| CADASTRAR CONTA GREEN", "| ALTERAR SENHA", "| SOBRE"));
		}
		String menu = "\n\t################| GREEN BANK |################\n";
		for (int opcao = 0; opcao < opcoes.size(); opcao++) {
			menu += "\n\t" + (opcao) + " > " + opcoes.get(opcao);
		}
		menu += "\n\t______________________________________________\n";
		return menu;
	}

	@Informacao(value = "Gera Data Atual")
	public static void gerarData() {
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("\n\t" + formatar.format(hoje));
	}
}
