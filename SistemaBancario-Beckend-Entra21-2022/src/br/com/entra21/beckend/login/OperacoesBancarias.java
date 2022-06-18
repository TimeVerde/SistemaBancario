package br.com.entra21.beckend.login;

public interface OperacoesBancarias {
	
	public void dadosBancario();
	
	public void deposito(double pValor);
	
	public void sacar(double pValor);
	
	public void transferencia(double pValor);
	
	public void investimento(double pValor);
	
	public void saldo();
	
	public double capturandoValor();

}
