package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
	public static void main(String[] args) {
//	ContaCorrente contaCC = new ContaCorrente(111, 111);
//	contaCC.deposita(100.0);
//
//	ContaPoupanca cp = new ContaPoupanca(222, 222);
//	cp.deposita(100.0);
//	
//    contaCC.transfere(10.0, cp);
//	System.out.println("CC: " + contaCC.getSaldo());
//	System.out.println("CP: " + cp.getSaldo());
//	
	Object cc = new ContaCorrente(22, 33);
    Object cp = new ContaPoupanca(33, 22);

    System.out.println(cc);
    System.out.println(cp);
	}
}
