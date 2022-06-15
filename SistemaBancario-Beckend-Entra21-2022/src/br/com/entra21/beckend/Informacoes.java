package br.com.entra21.beckend;

import java.util.ArrayList;

public class Informacoes {

	public static void sobre() {

		System.out.println("\n\t######################| SOBRE O GREEN BANK |######################\n");
		System.out.println("O Green Bank surgiu a partir do Projeto Entra 21 - Java -> Turma do Prof. Oliota\n");
	System.out.println("\t\t\tIntegrantes:\n");
		
		ArrayList<String> nomes = new ArrayList<>(); //TODO Java Avançado - Lambda
		nomes.add(new String("\tRafael")); 
		nomes.add(new String("\tErick Gabriel"));
		nomes.add(new String("\tArthur Estevan"));
		nomes.add(new String("\tThabata Santos"));
		nomes.sort(String::compareTo);
		nomes.forEach(System.out::println);
	
		System.out.println("\n\t\t\tHistorico \n");
		System.out.println("\tProjeto 1.0:\n ");
		System.out.println("\tResumo - Implementa��o do Sistema com a gera��o de uma regra de neg�cio\n");
		System.out.println("\t- Cadastro Admin\n");
		System.out.println("\t- Cadastro Cliente\n");
		System.out.println("\t- Regra de Neg�cio\n");
		System.out.println(
				"\n\n ## Foram utilizado todos os t�picos e assuntos utilizandos at� o momento dentro do curso de Java\n");
		System.out.println("\n______________________________________________________________________________");
	}

}
