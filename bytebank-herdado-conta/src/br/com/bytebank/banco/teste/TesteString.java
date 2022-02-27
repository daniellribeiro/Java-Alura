package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Daniel";
		
		ContaCorrente conta = new ContaCorrente(123,123);
		
		nome = nome.replace("D", "e");
		System.out.println(nome);
		
		System.out.println(conta);
		
	}

}
