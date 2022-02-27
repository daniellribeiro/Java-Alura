package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta{
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero);
	}
	

	@Override
	public void deposita(double valor){
		saldo = super.getSaldo() + valor;
	}
	
	@Override
	public String toString(){
		return "ContaCorrente " + super.toString();
	}
}
