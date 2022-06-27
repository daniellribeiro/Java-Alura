import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    

	Calculadora c = new Calculadora();
	
	@Test
	public void somarDoisValoresPositivos() {
		
		Assertions.assertEquals(7,c.somar(4,3));
	}
	
	@Test
	public void somarDoisValoresNegativos() {
		Assertions.assertEquals(-7,c.somar(-4,-3));
	}
	
	@Test
	public void somarUmValorPositivoEOutroNegativo() {
		Assertions.assertEquals(9,-3,12);
	}
	
	@Test
	public void somarDoisValoresZero() {
		
		Assertions.assertEquals(0,c.somar(0,0));
	}

}
