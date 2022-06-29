import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    

	Calculadora c = new Calculadora();
	
	@BeforeAll
	public static void inicializarTudo() {
		System.out.println("inicializar tudo");
	}
	
	@BeforeEach
	public void inicializarMetodo() {
		System.out.println("inicializar metodo");
	}
	
	@AfterAll
	public static void finalizarTudo() {
		System.out.println("finalizar tudo");
	}
	
	@AfterEach
	public void finalizarMetodo() {
		System.out.println("finalizar metodo");
	}
	
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
