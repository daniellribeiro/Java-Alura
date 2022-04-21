package curso1;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
	        Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico");    

//	     for(String aluno : alunos){
//	    	 System.out.println(aluno);
//	     }
	     
	      //1) adicione alguns alunos
	       System.out.println(alunos.add("Daniel"));
	       alunos.add("Evandro");
	       alunos.add("Jose");

	       //2) imprima o tamanho da colecao
           System.out.println(alunos.size());
           
	       //3) tente adicionar um aluno que existe
           System.out.println(alunos.add("Daniel"));
           
	        //4) imprima novamente o tamanho da colecao
           System.out.println(alunos.size());
	    }

}
