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

	public static void gerarMassaTeste() {
		
		gerarClientes();
		gerarEmpresas();
		
	}
	
	public static void gerarClientes() {

		LocalDate dataCadastro = LocalDate.now();

		clientes.put("611.770.469-03",
				new Cliente("Maya Yasmin Analu Fogaça", "611.770.469-03", "18.290.249-3", "17/02/1973", "Feminino",
						"Fernanda Nair Elisa", "Guilherme Edson Luiz Fogaça", "maya_yasmin_fogaca@hotmail.fr",
						"69900-354", "Rua Marechal Deodoro", "423", "Ipase", "Rio Branco", "AC", "(68) 3794-9009",
						dataCadastro, dataCadastro, new ArrayList<String>(Arrays.asList("Equipe super atenciosa!")),
						"Arthur", 0, "1202644-1", "7160"));

		clientes.put("696.481.582-15",
				new Cliente("Nelson Gael Filipe da Silva", "696.481.582-15", "48.859.461-3", "07/04/1943", "Masculino",
						"Marina Marina Liz", "Martin Paulo Nicolas da Silva", "nelson-dasilva98@htmail.com",
						"79906-750", "Rua Vicente Azambuja", "247", "Jardim Marambaia", "Ponta Porã", "MS",
						"(67) 3680-6528", dataCadastro, dataCadastro,
						new ArrayList<String>(Arrays.asList("Atendeu meus requisitos.")), "Arthur", 0, "1202644-1", "7160"));

		clientes.put("604.550.601-42",
				new Cliente("Severino Elias Kevin Teixeira", "604.550.601-42", "28.729.501-1", "17/02/1949",
						"Masculino", "Bruna Laís Betina", "Márcio Eduardo Renato Teixeira",
						"severino_teixeira@kascher.com.br", "67130-710", "Rua do Fio", "428", "Cidade Nova",
						"Ananindeua", "PA", "(91) 3885-3138", dataCadastro, dataCadastro,
						new ArrayList<String>(Arrays.asList("Tive alguns problemas.")), "Arthur", 0, "1202644-1", "7160"));

		clientes.put("626.710.312-97",
				new Cliente("Enrico Carlos Marcos Rezende", "626.710.312-97", "44.136.868-2", "12/05/1963", "Masculino",
						"Laura Evelyn Isabella", "Ryan Jorge Rezende", "enrico_rezende@delfrateinfo.com.br",
						"68908-006", "Avenida Cid Borges de Santana", "296", "Infraero", "Macapá", "AP",
						"(96) 3966-6575", dataCadastro, dataCadastro,
						new ArrayList<String>(Arrays.asList("Ótimo banco!")), "Arthur", 0, "1202644-1", "7160"));

		clientes.put("224.065.248-92", new Cliente("Isadora Luana da Silva", "224.065.248-92", "15.287.453-7", "14/06/1945",
				"Feminino", "Flávia Ana Malu", "Marcos Ricardo Pietro da Silva", "isadora-dasilva79@icloud.com",
				"74594-087", "Rua VF 15", "896", "Setor Alto do Vale", "Goiânia", "GO", "(62) 2551-2421", dataCadastro,
				dataCadastro, new ArrayList<String>(Arrays.asList("Atendentes muito atenciosos.")), "Arthur", 0, "1202644-1", "7160"));

	}

	public static void gerarEmpresas() {

		LocalDate calebeBernardoInformáticaME = LocalDate.of(2017, 7, 23);

		LocalDate joseMarliPaesDocesLtda = LocalDate.of(2005, 8, 11);

		LocalDate sergioManoelTelecomunicacoesME = LocalDate.of(2015, 5, 15);

		LocalDate vitoriaBeneditaLimpezaME = LocalDate.of(2020, 1, 27);
		
		LocalDate joseCarlosEduardoMarketingME = LocalDate.of(2003, 04, 13);
		
	
		empresas.put("92.845.777/0001-75",
				new Empresa("Sebastião Nathan Brito", "640.229.647-31", "22.244.255-4", "26/05/2004", "Masculino",
						"Cláudia Jaqueline Débora", "Thomas Cláudio Diego Brito", "brito@hotmail.com.br", "09442-150",
						"Rua Jacauna", "200", "Itrapoá", "Ribeirão Pires", "SP", "(11) 3820-8827",
						"Calebe e Bernardo Informática ME", "92.845.777/0001-75", "238.172.352.142",
						calebeBernardoInformáticaME, "Arthur", 0, "1202644-1", "7160"));

		empresas.put("87.264.331/0001-17",
				new Empresa("Nicole Eliane Isabelly Campos", "849.710.362-96", "17.254.762-3", "24/03/1991", "Feminino",
						"Carolina Silvana", "Eduardo Pietro Campos", "nicole_campos@leandroreis.com", "30270-190",
						"Rua Doutor Micaeli", "111", "Paraíso", "Belo Horizonte", "MG", "(31) 3525-2621",
						"José e Marli Pães e Doces Ltda", "87.264.331/0001-17", "677.632.099.360",
						joseMarliPaesDocesLtda, "Arthur", 0, "1202644-1", "7160"));

		empresas.put("74.011.080/0001-17",
				new Empresa("Diogo Anthony Nathan Lima", "209.886.646-15", "34.339.762-6", "02/04/1996", "Masculino",
						"Maya Allana Maria", "Elias Alexandre Davi Lima", "diogo_lima@dillon.com.br", "68903-220",
						"Rua Agenor Ferreira Pinto", "873", "Zerão", "Macapá", "AP", "(96) 2773-4069",
						"Sérgio e Manoel Telecomunicações ME", "74.011.080/0001-17", "503.576.361.782",
						sergioManoelTelecomunicacoesME, "Arthur", 0, "1202644-1", "7160"));

		empresas.put("88.406.097/0001-88",
				new Empresa("Hugo André Dias", "989.515.179-93", "15.441.318-5", "25/02/1990", "Masculino",
						"Sandra Sueli Malu", "Gael César Dias", "hugo-dias73@policiapenal.com", "39401-448",
						"Rua Henriqueta Batista", "488", "Esplanada", "Montes Claros", "MG", "(38) 3592-1619",
						"Vitória e Benedita Limpeza ME", "88.406.097/0001-88", "654.177.483.571",
						vitoriaBeneditaLimpezaME, "Arthur", 0, "1202644-1", "7160"));

		empresas.put("89.299.008/0001-04",
				new Empresa("Oliver Rodrigo Pedro Assis", "107.660.482-09", "16.680.050-8", "10/03/1952", "Masculino",
						"Elaine Marina Nicole", "Marcelo Hugo Marcelo Assis", "oliverrodrigoassis@vieiradarocha.adv.br",
						"74990-785", "Rua dos Palmitos", "446", "Retiro do Bosque", "Aparecida de Goiânia", "GO",
						"(62) 3538-8860", "José e Carlos Eduardo Marketing ME", "89.299.008/0001-04", "535.073.996.445",
						joseCarlosEduardoMarketingME, "Arthur", 0, "1202644-1", "7160"));

	}	

}
