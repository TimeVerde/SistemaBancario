package br.com.entra21.beckend.login;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.annotation.EstouImplementando;
import br.com.entra21.beckend.annotation.NaoEsquecerAmanha;
import br.com.entra21.beckend.modelos.Cliente;

public class MenuPrincipalPF extends Menu {

	static Scanner input = new Scanner(System.in);

	static HashMap<String, Cliente> transferenciaCliente = new Armazenar().clientes;
	
	static LocalDate datasOperacoes = LocalDate.now();

	private Cliente cliente;
	private double saldo;

	public MenuPrincipalPF(String titulo, ArrayList<String> opcoes, Cliente cliente) {
		super(titulo, opcoes);
		this.cliente = cliente;
	}

	@Override
	public byte capturarOpcao() {

		byte opcao = super.capturarOpcao();

		switch (opcao) {

		case 2:
			dadosBancarios();
			break;

		case 3:
			deposito(realizarOperacoes());
			break;

		case 4:
			sacar(realizarOperacoes());
			break;

		case 5:
			transferencia(realizarOperacoes());
			break;

		case 6:
			pix();
			break;

		case 7:
			investimentos();
			break;

		case 8:
			saldo();
			break;

		}

		return opcao;
	}

	private void saldo() {
		System.out.println("\tSaldo: " +this.saldo);
	}

	@EstouImplementando
	private void investimentos() {

	}

	private void pix() {

	}

	@NaoEsquecerAmanha
	private void transferencia(double pValor) {
		System.out.println("\n\t____| REALIZANDO TRANSFERÊNCIA |____");
		System.out.println("\n\t____| ....     aguarde    .... |____");
		Cliente informacoes = new Cliente();

		if (pValor <= this.saldo) {

			System.out.print("\n\t-Informe CPF: ");
			informacoes.setNome(input.nextLine());
			informacoes.setNome(input.nextLine());
			if (transferenciaCliente.get(informacoes.getNome()) != null) {
				this.saldo -= pValor;
				System.out.println("\t-Transferência Realizada com Sucesso");
				System.out.println("\t-Data: " +datasOperacoes);
				System.out.println("\t-CPF Destinatário: " +transferenciaCliente.get(informacoes.getNome()).getNome());
			}

		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t______| FIM TRANSFERÊNCIA |______");
	}

	private void sacar(double pValor) {
		System.out.println("\n\t___| REALIZANDO SAQUE |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		if (pValor <= this.saldo) {
			this.saldo -= pValor;
		} else {
			System.out.println("\t-Saldo Insuficente");
		}
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t______| FIM SAQUE |______");

	}

	private void deposito(double pValor) {

		System.out.println("\n\t___| REALIZANDO DEPÓSITO |___");
		System.out.println("\t-Saldo Anterior: " + this.saldo);
		this.saldo += pValor;
		System.out.println("\t-Saldo Posterior: " + this.saldo);
		System.out.println("\t______| Fim Deposito |______");

	}

	private void dadosBancarios() {
		System.out.println(cliente.toString());
	}

	private static double realizarOperacoes() {

		double pValor;

		System.out.print("\n\tInforme o valor: ");
		pValor = input.nextDouble();

		return pValor;

	}

}
