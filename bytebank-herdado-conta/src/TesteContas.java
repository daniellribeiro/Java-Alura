public class TesteContas {
	public static void main(String[] args) {
	ContaCorrente contaCC = new ContaCorrente(111, 111);
	contaCC.deposita(100.0);

	ContaPoupanca cp = new ContaPoupanca(222, 222);
	cp.deposita(100.0);
	
    contaCC.transfere(10.0, cp);
	System.out.println("CC: " + contaCC.getSaldo());
	System.out.println("CP: " + cp.getSaldo());
	}
}
