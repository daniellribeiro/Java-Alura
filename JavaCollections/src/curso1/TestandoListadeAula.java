package curso1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListadeAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Aula1",100);

		Aula aula2 = new Aula("Aula2",20);

		Aula aula3 = new Aula("Aula3",30);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula2);
		aulas.add(aula1);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}	
}
