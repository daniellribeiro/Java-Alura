import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teste3 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("JavaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));
		
		//cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		
		List<Curso> cursoFiltrado;
		
		  cursoFiltrado = cursos.stream()
				.filter(c -> c.getAlunos() > 50).collect(Collectors.toList());

			cursoFiltrado.stream().forEach(c -> System.out.println(c.getNome()));
			

			OptionalDouble cursoMedia = cursos.stream().mapToInt(Curso::getAlunos).average();
			
			System.out.println(cursoMedia.getAsDouble());
	}
	
}
