package br.com.entra21.beckend.cadastro;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.entra21.beckend.Armazenar;
import br.com.entra21.beckend.Menu;
import br.com.entra21.beckend.modelos.Empresa;

public class ContaJuridicaCrud extends Menu implements ICrud<Empresa> {
	
	private HashMap<String, Empresa> lista = new Armazenar().empresas;
	
	public ContaJuridicaCrud() {
		super("EMPRESAS", opcoes);
		
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
	public void listar(HashMap<String, Empresa> lista) {
		System.out.println("\n\t################| Lista de" +getTitulo()+ " |################\n");
		for (Empresa empresa : lista.values()) {
			System.out.println("\t Empressa: " +empresa.getRazaoSocial()+ "\n"+
							   "\t Proprietário: " +empresa.getNome()+ "\n"
							  +"\n\t_____________________________________\n");
		}
		System.out.println("\n\t___________ Armazenado |"+lista.size()+" |___________");
	}

	@Override
	public void adicionar() {
		Empresa novo = capturarValores();
		if (novo == null) {
			lista.put(novo.getNome(), novo);
		} else {
			System.out.println("\tEmpresa cadastrada com " +novo.getCpf()+ " inexistente");
		}
	}

	@Override
	public Empresa buscar(Empresa chave) {
		return lista.get(chave.getNome());
	}

	@Override
	public void editar(Empresa chave) {
		Empresa dadosBancario = buscar(chave);
		if(dadosBancario == null) {
			System.out.println("\tEmpresa " +chave.getNome()+ " inexistente.");
		} else {
			lista.put(chave.getNome(), capturarValores());
			System.out.println("\t-Dados Atualizados-");
		}
	}

	@Override
	public void deletar(Empresa chave) {
		Empresa dadosBancario = buscar(chave);
		if(dadosBancario == null) {
			System.out.println("\tEmpresa " +chave.getNome()+ " inexistente.");
		} else {
			lista.remove(chave.getNome());
			System.out.println("\t-Empresa Excluida-");
		}
	}

	@Override
	public Empresa capturarChave() {
		Empresa informacoes = new Empresa();
		System.out.print("\n\tInforme uma Empresa CHAVE: ");
		informacoes.setNome(super.getInput().nextLine());
		informacoes.setNome(super.getInput().nextLine());
		return informacoes;

	}

	@Override
	public Empresa capturarValores() {
		Empresa informacoes = new Empresa();
		
		System.out.println("\n\t################| CADASTRAMENTO |################\n");
		
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
		
		System.out.print("\tInforme nome da mãe: ");
		informacoes.setNomeMae(super.getInput().nextLine());

		System.out.print("\tInforme nome do pai: ");
		informacoes.setNomePai(super.getInput().nextLine());
		
		System.out.print("\tInforme CEP: ");
		informacoes.setCep(super.getInput().nextLine());

		System.out.print("\tInforme o endereço: ");
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
		
		System.out.print("\tInforme a razão social: ");
		informacoes.setRazaoSocial(super.getInput().nextLine());
		
		System.out.print("\tInforme a razão social: ");
		informacoes.setRazaoSocial(super.getInput().nextLine());
		
		System.out.print("\tInforme CNPJ: ");
		informacoes.setCnpj(super.getInput().nextLine());
		
		LocalDate aberturaEmpresa = LocalDate.now();
		informacoes.setDataDeAbertura(aberturaEmpresa);
				
		System.out.println("\n\t_______________| CADASTRAMENTO FINALIZADO |_______________\n");

		return informacoes;
	}

	@Override
	public void exibirDetalhes(Empresa completo) {
		if(completo==null) {
			System.out.println("\tCliente Inexistente");
		} else {
			System.out.println(completo.toString());
		}
	}

}
