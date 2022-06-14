package br.com.entra21.beckend;

import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.modelos.Cliente;
import br.com.entra21.beckend.modelos.Empresa;

public class ConfirmandoLogin {
	
	static Scanner input = new Scanner(System.in);
	static HashMap<String, Cliente> senhaClientes = new Armazenar().clientes;
	
	static HashMap<String, Empresa> senhaEmpresas = new Armazenar().empresas;

	public static Cliente buscar() {
		
		Cliente informacoes = new Cliente();
				
		System.out.println("1/3");
		System.out.print("\n\tInforme Usuario: ");
		informacoes.setCpf(input.nextLine());
	
		System.out.print("\n\tInforme Senha: ");
		informacoes.setSenha(input.nextLine());
		
		if(informacoes.getSenha().equals(senhaClientes.get(informacoes.getCpf()).getSenha())) {
			return senhaClientes.get(informacoes.getCpf());
		}
					
		try {	
			
			System.out.println("2/3");
			
			System.out.print("\n\tInforme Usuario: ");
			informacoes.setCpf(input.nextLine());
		
			System.out.print("\n\tInforme Senha: ");
			informacoes.setSenha(input.nextLine());
			
			if(informacoes.getSenha().equals(senhaClientes.get(informacoes.getCpf()).getSenha())) {
				return senhaClientes.get(informacoes.getCpf());
			}

		} catch (java.lang.NullPointerException e) {
			
				System.out.println("3/3");
			
				System.out.println("\n\t-senha ou usuario incorreto tente novamente-");
				
				System.out.print("\n\tInforme Usuario: ");
				informacoes.setCpf(input.nextLine());
			
				System.out.print("\n\tInforme Senha: ");
				informacoes.setSenha(input.nextLine());
				
				if(informacoes.getSenha().equals(senhaClientes.get(informacoes.getCpf()).getSenha())) {
					return senhaClientes.get(informacoes.getCpf());
				}
		} 
		
		return null;
	}

}

