package br.com.entra21.beckend;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.entra21.beckend.cadastro.Cadastros;
import br.com.entra21.beckend.login.Login;

public class Principal {
	
	public static void login() {
		new Login("LOGIN ", new ArrayList<String>(Arrays.asList("| ENTRAR CONTA PF |", "| ENTRAR CONTA PJ |"))).executarMenu();
	}

	public static void cadastrar() {

		new Cadastros("CADASTRO ", new ArrayList<String>(Arrays.asList("| CADASTRAR CONTA PF |", "| CADASTRAR CONTA PJ |")))
				.executarMenu();
	}

//	public static void alterarSenha() {
//		new MenuPrincipalPF("Alteração", new ArrayList<String>(Arrays.asList("Alterar Senha"))).executarMenu();
//		;
//	}
//

}
