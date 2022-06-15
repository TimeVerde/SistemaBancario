package br.com.entra21.beckend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.beckend.annotation.EstouImplementando;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<String> opcoes;

	
	@EstouImplementando
	public static void main(String[] args) {
		
		geradorConta_Data();
				
		byte option; //TODO Lógica - Variaveis
		final byte ZERO = 0; //TODO Lógica - Constante
						
		do { //TODO Lógica - do-while
			
			System.out.println(montarMenu());
			System.out.print("\tEscolha uma opcao: ");
			option = input.nextByte();
			
			switch(option) { //TODO Lógica - Switch
			case ZERO:
				System.out.println("\n\tObrigado por usar o Green Bank, VOLTE SEMPRE!");
				
				break;
				
			case 1:
				Principal.login();
				break;
				
			case 2:
				Principal.cadastrar();	
				break;
				
			case 3:
				//Principal.alterarSenha();
				break;
				
			case 4:
				Informacoes.sobre();
				break;


				
				default:
					System.out.println("\n\tPor favor, insira um op��o v�lida");
					break;
			}
		}while(option!=0);
		

	}
		
	public static String montarMenu() {

		if (opcoes == null) {
			opcoes = new ArrayList<>(Arrays.asList("| FECHAR APP |", "| ENTRAR CONTA GREEN |", "| CADASTRAR CONTA GREEN |", "| ALTERAR SENHA |", "| SOBRE |"));
		}

		String menu = "\n\t################| GREEN BANK |################\n";
		for (int opcao = 0; opcao < opcoes.size(); opcao++) {
			menu += "\n\t" + (opcao) + " > " + opcoes.get(opcao);
		}
		menu += "\n\t______________________________________________\n";

		return menu;

	}
	
//	public static void confirmandoLogin() {
//		String nomeUsuario, senhaUsuario;
//		do {			
//			System.out.print("\tQual seu nome de usuario: ");
//			nomeUsuario = input.next(); 
//			
//			System.out.print("\tQual sua senha: ");
//			senhaUsuario = input.next();
//			
//		}while(!nomeUsuario.equals("Admin") && !senhaUsuario.equals("Admin"));
//		System.out.println("\n\tAcesso Liberado");
//	}
	
	
	public static void geradorConta_Data() {
		
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("\n\tBem-Vindo seu acesso ocorreu no dia: "+formatar.format(hoje)+"\n");
		
		Armazenar.gerarClientes();
		Armazenar.gerarEmpresas();

	}
	

}
