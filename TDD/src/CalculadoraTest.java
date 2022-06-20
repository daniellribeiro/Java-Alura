import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void somarDoisValoresPositivos() {
		Calculadora c = new Calculadora();
		
		Assertions.assertEquals(7,c.somar(4,3));
	}
	
	@Test
	public void somarDoisValoresNegativos() {
		Calculadora c = new Calculadora();
		
		Assertions.assertEquals(-7,c.somar(-4,-3));
	}
	
	@Test
	public void somarUmValorPositivoEOutroNegativo() {
		Calculadora c = new Calculadora();
		
		Assertions.assertEquals(9,-3,12);
	}
	
	@Test
	public void somarDoisValoresZero() {
		Calculadora c = new Calculadora();
		
		Assertions.assertEquals(0,c.somar(0,0));
	}

}
