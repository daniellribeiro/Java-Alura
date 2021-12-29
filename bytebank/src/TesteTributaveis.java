
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1234,123456);
		cc.deposita(1000.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
	
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
	}

}
