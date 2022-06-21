package br.com.entra21.beckend;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.beckend.annotation.Informacao;
import br.com.entra21.beckend.annotation.Responsavel;
import br.com.entra21.beckend.cadastro.Cadastros;
import br.com.entra21.beckend.login.Login;

@Informacao(value = "Gera meus SubMenus")
public class Principal {
	
	@Informacao(value = "Faz o Login")
	public static void login() {
		new Login("LOGIN ", new ArrayList<String>(Arrays.asList("| ENTRAR CONTA PF", "| ENTRAR CONTA PJ"))).executarMenu();
	}

	@Informacao(value = "Faz o Cadastro")
	public static void cadastrar() {
		new Cadastros("CADASTRO ", new ArrayList<String>(Arrays.asList("| CADASTRAR CONTA PF", "| CADASTRAR CONTA PJ"))).executarMenu();
	}

	@Responsavel (
					ordemDePrioridade = Responsavel.OrdemDePrioridade.IMPORTANTE,
					toDo = "Adicionar método de atualização de senha.",
					responsavel = "Arthur"
	)
	public static void alterarSenha() {
		System.out.println("Desculpe esse método ainda não foi implatado, espere próximas atualizações.");
	}
	
	@Informacao(value = "Informações do Projeto")
	public static void sobre() {
		
		System.out.println("\t____________________________________________________________________________________\n");

		System.out.println("\t\t ######################| SOBRE O GREEN BANK |######################\n");
		
		System.out.println("\n\t\t\t\t       Integrantes | Funções");
		System.out.println("\t\t\t\t       ---------------------\n");

		ArrayList<String> nomes = new ArrayList<>(); //TODO Java Avançado - Lambda
		nomes.add(new String("\tThabata Santos - Git | Documentação"));
		nomes.add(new String("\tRafael - Main | Menus")); 
		nomes.add(new String("\tErick Gabriel - CR-(UD) Read | Creat"));
		nomes.add(new String("\tArthur Estevan - CR-(UD) Update | Delete"));
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
		
		System.out.println("\t____________________________________________________________________________________\n");
		
		System.out.println("\tO Green Bank surgiu a partir do Projeto Entra 21 - Java -> Turma do Prof. Oliota\n");

		System.out.println("\tResumo - Implementação do Sistema com a geração de uma Regra de Negócios.");
		
		System.out.println("\n\t## Foram utilizado todos os tópicos e assuntos dentro do curso de Java ##");
		System.out.println("\t____________________________________________________________________________________\n");
	}

}
