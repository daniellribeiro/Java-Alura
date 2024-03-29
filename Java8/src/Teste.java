import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class Teste {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new Imprime();
        ComparePorTamanho c = new ComparePorTamanho();
        
		palavras.sort(c);
		palavras.forEach(consumidor);
	}
	
}
	class Imprime implements Consumer<String>{
	
		@Override
		public void accept(String s) {
			System.out.println(s);
		}
	}
	
    class ComparePorTamanho implements Comparator<String>{
		@Override
		public int compare(String a, String b) {
			return a.length() - b.length();
		}
		
    }
	

