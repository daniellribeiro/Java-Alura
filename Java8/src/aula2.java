import java.util.ArrayList;

public class aula2 {
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList();
		palavras.add("zebra");
		palavras.add("Daniel");
		palavras.add("arvore");
		palavras.add("teste");

		//palavras.sort((s1, s2) -> s1.compareTo(s2));
		
		//palavras.sort(String::compareTo);
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(s -> System.out.println(s));

		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		
	}

}
