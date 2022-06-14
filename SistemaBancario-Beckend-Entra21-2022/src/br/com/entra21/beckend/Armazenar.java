package br.com.entra21.beckend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.beckend.modelos.Cliente;
import br.com.entra21.beckend.modelos.Empresa;

public class Armazenar {

	public static HashMap<String, Cliente> clientes = new HashMap();
	public static HashMap<String, Empresa> empresas = new HashMap();

	public static void gerarClientes() {

		LocalDate dataCadastro = LocalDate.now();

		clientes.put("611.770.469-03",
				new Cliente("Maya Yasmin Analu Fogaça", "611.770.469-03", "18.290.249-3", "17/02/1973", "Feminino",
						"Fernanda Nair Elisa", "Guilherme Edson Luiz Fogaça", "maya_yasmin_fogaca@hotmail.fr",
						"69900-354", "Rua Marechal Deodoro", "423", "Ipase", "Rio Branco", "AC", "(68) 3794-9009",
						dataCadastro, dataCadastro, new ArrayList<String>(Arrays.asList("Equipe super atenciosa!")), "Arthur"));

		clientes.put("696.481.582-15",
				new Cliente("Nelson Gael Filipe da Silva", "696.481.582-15", "48.859.461-3", "07/04/1943", "Masculino",
						"Marina Marina Liz", "Martin Paulo Nicolas da Silva", "nelson-dasilva98@htmail.com",
						"79906-750", "Rua Vicente Azambuja", "247", "Jardim Marambaia", "Ponta Porã", "MS",
						"(67) 3680-6528", dataCadastro, dataCadastro,
						new ArrayList<String>(Arrays.asList("Atendeu meus requisitos.")), "Arthur"));

		clientes.put("604.550.601-42",
				new Cliente("Severino Elias Kevin Teixeira", "604.550.601-42", "28.729.501-1", "17/02/1949",
						"Masculino", "Bruna Laís Betina", "Márcio Eduardo Renato Teixeira",
						"severino_teixeira@kascher.com.br", "67130-710", "Rua do Fio", "428", "Cidade Nova",
						"Ananindeua", "PA", "(91) 3885-3138", dataCadastro, dataCadastro,
						new ArrayList<String>(Arrays.asList("Tive alguns problemas.")), "Arthur"));

	}

	public static void gerarEmpresas() {

		LocalDate dataCadastro = LocalDate.now();

		empresas.put("Calebe e Bernardo Informática ME",
				new Empresa("Sebastião Nathan Brito", "640.229.647-31", "22.244.255-4", "26/05/2004", "Masculino",
						"Cláudia Jaqueline Débora", "Thomas Cláudio Diego Brito", "brito@hotmail.com.br", "09442-150",
						"Rua Jacauna", "200", "Itrapoá", "Ribeirão Pires", "SP", "(11) 3820-8827",
						"Calebe e Bernardo Informática ME", "92.845.777/0001-75", "238.172.352.142", dataCadastro));

	}
	
}
