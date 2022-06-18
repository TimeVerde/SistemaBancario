package br.com.entra21.beckend.cadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public interface ICrud<T> {
	
	ArrayList<String> opcoes = new ArrayList<String>(
			Arrays.asList("| LISTAR", "| ADICIONAR", "| BUSCAR", "| EDITAR", "| DELETAR"));
	
	public void listar(HashMap<String,T> lista);

	public void adicionar();

	public T buscar(T chave);

	public void editar(T chave);

	public void deletar(T chave);

	public T capturarChave();

	public T capturarValores();
	
	public void exibirDetalhes(T completo);

}
