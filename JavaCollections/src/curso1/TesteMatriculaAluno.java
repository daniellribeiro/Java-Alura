package curso1;

import java.util.Set;

public class TesteMatriculaAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Curso 1","Daniel");
		
		Aluno aluno1 = new Aluno("Aluno 1",1);
		Aluno aluno2 = new Aluno("Aluno 2",2);
		Aluno aluno3 = new Aluno("Aluno 3",3);
		Aluno aluno4 = new Aluno("Aluno 4",4);
		
		curso.matricula(aluno1);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		curso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Set<Aluno> alunos = curso.getAlunos();
		
		//alunos.add(aluno4);
		
		System.out.println(curso.estaMatriculado(aluno4));
	}
	
}
