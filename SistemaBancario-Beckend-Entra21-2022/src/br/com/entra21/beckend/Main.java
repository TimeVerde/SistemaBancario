package br.com.entra21.beckend;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> opcoes;

	public static void main(String[] args) {

		geradorConta_Data();

		Instant inicio = Instant.now();

		byte option; // TODO Logica - Variaveis
		final byte ZERO = 0; // TODO Logica - Constante

		do { // TODO Logica - do-while

			System.out.println(montarMenu());
			System.out.print("\tEscolha uma opcao: ");
			option = input.nextByte();

			switch (option) { // TODO Logica - Switch

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
				// Principal.alterarSenha();
				break;

			case 4:
				Informacoes.sobre();
				break;

			default:
				System.out.println("\n\t- Por favor, insira um opcao valida.");
				break;
			}
		} while (option != 0);

		Instant fim = Instant.now();

		Duration duracao = Duration.between(inicio, fim); //TODO Java Avancado - Dates

		System.out.println("\t______________________________________________\n");
		System.out.println("\tMilisegundos Passado no Programa = " + duracao.toMillis());
		System.out.println("\tSegundos Passado no Programa = " + duracao.toSeconds());
		System.out.println("\tMinutos Passado no Programa = " + duracao.toMinutes());
		System.out.println("\tHoras Passado no Programa = " + duracao.toHours());
		System.out.println("\t______________________________________________");

	}

	public static String montarMenu() { //TODO Logica - Modularizacao
		if (opcoes == null) { //TODO Logica - IF
			opcoes = new ArrayList<>(Arrays.asList("| FECHAR APP", "| ENTRAR CONTA GREEN", "| CADASTRAR CONTA GREEN", "| ALTERAR SENHA", "| SOBRE"));
		}
		String menu = "\n\t################| GREEN BANK |################\n";
		for (int opcao = 0; opcao < opcoes.size(); opcao++) { //TODO Logica - For
			menu += "\n\t" + (opcao) + " > " + opcoes.get(opcao);
		}
		menu += "\n\t______________________________________________\n";
		return menu;
	}

	public static void geradorConta_Data() {

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY"); //TODO Java Avancado - Wrapper
		System.out.println("\n\t" + formatar.format(hoje));

		Armazenar.gerarClientes();
		Armazenar.gerarEmpresas();

	}

}
