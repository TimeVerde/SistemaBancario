package br.com.entra21.beckend.login;

import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.modelos.Cliente;
import br.com.entra21.beckend.modelos.Empresa;

public class ConfirmandoLogin {

	static Scanner input = new Scanner(System.in);
	static HashMap<String, Cliente> senhaClientes = new Armazenar().clientes;
	static HashMap<String, Empresa> senhaEmpresas = new Armazenar().empresas;

	public static Cliente buscarCliente() {

		Cliente informacoes = new Cliente();

		try {

			System.out.println("\n\t2/3");

			System.out.println("\n\t-senha ou usuario incorreto tente novamente-");

			System.out.print("\n\tInforme CPF: ");
			informacoes.setCpf(input.nextLine());

			System.out.print("\tInforme Senha: ");
			informacoes.setSenha(input.nextLine());

			if (informacoes.getSenha().equals(senhaClientes.get(informacoes.getCpf()).getSenha())) {
				return senhaClientes.get(informacoes.getCpf());
			}

		} catch (NullPointerException e) {

			System.out.println("\t3/3");

			System.out.println("\n\t-senha ou usuario incorreto tente novamente-");

			System.out.print("\n\tInforme CPF: ");
			informacoes.setCpf(input.nextLine());

			System.out.print("\tInforme Senha: ");
			informacoes.setSenha(input.nextLine());

			if (informacoes.getSenha().equals(senhaClientes.get(informacoes.getCpf()).getSenha())) {
				return senhaClientes.get(informacoes.getCpf());
			}
			
		}
		return null;
	}

	public static Empresa buscarEmpresa() {

		Empresa informacoes = new Empresa();

		try {

			System.out.println("\n\t2/3");

			System.out.println("\n\t-senha ou usuario incorreto tente novamente-");

			System.out.print("\n\tInforme CNPJ: ");
			informacoes.setCnpj(input.nextLine());

			System.out.print("\tInforme Senha: ");
			informacoes.setSenha(input.nextLine());

			if (informacoes.getSenha().equals(senhaEmpresas.get(informacoes.getCnpj()).getSenha())) {
				return senhaEmpresas.get(informacoes.getCnpj());
			}

		} catch (java.lang.NullPointerException e) {

			System.out.println("\n\t3/3");

			System.out.println("\n\t-senha ou usuario incorreto tente novamente-");

			System.out.print("\n\tInforme CNPJ: ");
			informacoes.setCnpj(input.nextLine());

			System.out.print("\tInforme Senha: ");
			informacoes.setSenha(input.nextLine());

			if (informacoes.getSenha().equals(senhaEmpresas.get(informacoes.getCnpj()).getSenha())) {
				return senhaEmpresas.get(informacoes.getCnpj());
			}
		}

		return null;
	}

}
