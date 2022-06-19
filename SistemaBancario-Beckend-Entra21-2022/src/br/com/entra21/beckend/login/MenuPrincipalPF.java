package br.com.entra21.beckend.login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.modelos.Cliente;

public class MenuPrincipalPF extends Menu implements OperacoesBancarias  {

	static Scanner input = new Scanner(System.in);
	static HashMap<String, Cliente> clientes = new Armazenar().clientes;
	static LocalDate dataOperacoes = LocalDate.now();
	private Cliente cliente;
	private double saldo;

	public MenuPrincipalPF(String titulo, ArrayList<String> opcoes, Cliente cliente) {
		super("CLIENTES DO BANCO ", opcoes);
		this.cliente = cliente;
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			dadosBancario();
			break;

		case 3:
			deposito(capturandoValor());
			break;

		case 4:
			sacar(capturandoValor());
			break;

		case 5:
			transferencia(capturandoValor());
			break;

		case 6:
			investimento(capturandoValor());
			break;

		case 7:
			saldo();
			break;

		}

		return opcao;
	}

	@Override
	public void dadosBancario() {
		System.out.println(cliente.toString());
	}
	
	@Override
	public void deposito(double pValor) {
		System.out.println("\n\t___| REALIZANDO DEPOSITO |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		this.saldo += pValor;
		cliente.setSaldo(this.saldo);
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t_______| Fim Deposito |______");
	}

	@Override
	public void sacar(double pValor) {
		System.out.println("\n\t___| REALIZANDO SAQUE |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		if (pValor <= this.saldo) {
			this.saldo -= pValor;
			cliente.setSaldo(this.saldo);
		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t_______| FIM SAQUE |______");
	}

	@Override
	public void transferencia(double pValor) {
		System.out.println("\n\t____| REALIZANDO TRANSFERENCIA |____");
		System.out.println("\n\t____| ....     aguarde    .... |____\n");
		
		System.out.println("\n\t_____________| LISTA DE " +getTitulo()+ " |_____________\n");
		for (Cliente cliente : clientes.values()) {
			System.out.println("\t Nome: " +cliente.getNome()+ "\n"
							  +"\t CPF: " +cliente.getCpf()+ "\n"
							  +"\t_______________________________________________________\n");
		}

		Cliente informacoes = new Cliente();

		if (pValor <= this.saldo) {

			System.out.print("\t-Informe CPF: ");
			informacoes.setNome(input.nextLine());
			informacoes.setNome(input.nextLine());
			if (clientes.get(informacoes.getNome()) != null) {
				this.saldo -= pValor;
				cliente.setSaldo(this.saldo);
				clientes.get(informacoes.getNome()).setSaldo(pValor);
				
				System.out.println("\n\t-Transferencia Realizada com Sucesso");
				System.out.println("\t\t\t   -Data: " +dataOperacoes+ "\n");
				
				System.out.println("\t-Origem");
				System.out.println("\t-Nome: " +cliente.getNome());
				System.out.println("\t-Valor: " +pValor);
				System.out.println("\t-CPF: " +cliente.getCpf()+ "\n");
				
				System.out.println("\t-Destinatario");
				System.out.println("\t-Nome: " +clientes.get(informacoes.getNome()).getNome());
				System.out.println("\t-CPF: " +clientes.get(informacoes.getNome()).getCpf()+ "\n");
			}

		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t______| FIM TRANSFERENCIA |______");
	}
	
	@Override
	public void investimento(double pValor) {
		
	}
	
	@Override
	public void saldo() {
		System.out.println("\n\tSaldo: " +cliente.getSaldo());
		
	}
	
	@Override
	public double capturandoValor() {
		double pValor;
		System.out.print("\n\tInforme o valor: ");
		pValor = input.nextDouble();
		return pValor;
	}

}
