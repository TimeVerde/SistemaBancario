package br.com.entra21.beckend.cadastro;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.annotation.EstouImplementando;
import br.com.entra21.beckend.modelos.Cliente;

@EstouImplementando
public class ContaFisicaCrud extends Menu implements ICrud<Cliente>{
	
	private HashMap<String, Cliente> lista = new Armazenar().clientes;
	
	public ContaFisicaCrud() {
		super("CLIENTES ", opcoes);
	}
	
	@Override
	public byte capturarOpcao() {
		
		byte opcao = super.capturarOpcao();
		
		switch (opcao) {
		
		case 2:
			listar(lista);
			break;

		case 3:
			adicionar();
			break;
			
		case 4:
			exibirDetalhes(buscar(capturarChave()));
			break;

		case 5:
			editar(capturarChave());
			break;

		case 6:
			deletar(capturarChave());
			break;
		}
		
		
		return opcao;
	}


	@Override
	public void listar(HashMap<String, Cliente> lista) {
		System.out.println("\n\t_____________| Lista de" +getTitulo()+ " |_____________\n");
		for (Cliente cliente : lista.values()) {
			System.out.println("\t Nome: " +cliente.getNome()+ "\n"
							  +"\t Endere�o de Email: " +cliente.getEmail()+ "\n"
							  +"\n\t____________________________________________________\n");
		}
		System.out.println("\n\t_____________ Armazenado | "+lista.size()+" |_____________");
	}

	@Override
	public void adicionar() {
		Cliente novo = capturarValores();
		if(buscar(novo)==null) {
			lista.put(novo.getNome(), novo);
		} else {
			System.out.println("\tCliente cadastrado com " +novo.getCpf()+ " inexistente");
		}
	}

	@Override
	public Cliente buscar(Cliente chave) {
		return lista.get(chave.getNome());
	}

	@Override
	public void editar(Cliente chave) {
		Cliente dadosBancario = buscar(chave);
		if(dadosBancario==null) {
			System.out.println("\tCliente " +chave.getNome()+ " inexistente.");
		} else {
			lista.put(chave.getNome(), capturarValores());
			System.out.println("\t-Dados Atualizados-");
		}
	}

	@Override
	public void deletar(Cliente chave) {
		Cliente dadosBancario = buscar(chave);
		if(dadosBancario==null) {
			System.out.println("\tCliente " +chave.getNome()+ " inexistente.");
		} else {
			lista.remove(chave.getNome());
			System.out.println("\t-Cliente Excluido-");
		}

	}

	@Override
	public Cliente capturarChave() {
		Cliente informacoes = new Cliente();
		System.out.print("\n\tInforme uma Pessoa CHAVE: ");
		informacoes.setNome(super.getInput().nextLine());
		informacoes.setNome(super.getInput().nextLine());
		return informacoes;
	}

	@Override
	public Cliente capturarValores() {
		Cliente informacoes = new Cliente();
		
		System.out.println("\n\t_____________| CADASTRAMENTO |_____________\n");
		
		System.out.print("\tInforme seu nome: "); 
		informacoes.setNome(super.getInput().nextLine());
		informacoes.setNome(super.getInput().nextLine());
		
		System.out.print("\tInforme CPF: ");
		informacoes.setCpf(super.getInput().nextLine());
		
		System.out.print("\tInforme RG: ");
		informacoes.setRg(super.getInput().nextLine());
		
		System.out.print("\tInforme data de nascimento: ");
		informacoes.setDataNascimento(super.getInput().nextLine());
		
		System.out.print("\tInforme o sexo: ");
		informacoes.setSexo(super.getInput().nextLine());
		
		System.out.print("\tInforme nome da m�e: ");
		informacoes.setNomeMae(super.getInput().nextLine());

		System.out.print("\tInforme nome do pai: ");
		informacoes.setNomePai(super.getInput().nextLine());
		
		System.out.print("\tInforme email: ");
		informacoes.setEmail(super.getInput().nextLine());
		
		System.out.print("\tInforme CEP: ");
		informacoes.setCep(super.getInput().nextLine());

		System.out.print("\tInforme o endere�o: ");
		informacoes.setEndereco(super.getInput().nextLine());
		
		System.out.print("\tInforme o numero: ");
		informacoes.setNumero(super.getInput().nextLine());
		
		System.out.print("\tInforme o bairro: ");
		informacoes.setBairro(super.getInput().nextLine());
		
		System.out.print("\tInforme a cidade: ");
		informacoes.setCidade(super.getInput().nextLine());
		
		System.out.print("\tInforme o estado: ");
		informacoes.setEstado(super.getInput().nextLine());
		
		System.out.print("\tInforme o telefone: ");
		informacoes.setTelefone(super.getInput().nextLine());
		
		LocalDate aberturaCliente = LocalDate.now();
		informacoes.setDataCadastro(aberturaCliente);
		
		System.out.println("\n\t_____________ | CADASTRAMENTO FINALIZADO |_____________\n");
	
		return informacoes;
	}

	@Override
	public void exibirDetalhes(Cliente completo) {
		if(completo==null) {
			System.out.println("\tCliente Inexistente");
		} else {
			System.out.println(completo.toString());
		}
		
	}

	
}
