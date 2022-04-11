package curso1;

import java.util.ArrayList;
import java.util.Collections;

//public class TestandoListas {
//	public static void main(String[] args) {
//		String cursoA = "curso A";
//		String cursoB = "curso B";
//		String cursoC = "curso C";
//		
//		ArrayList<String> cursos = new ArrayList<>();
//		
//		cursos.add(cursoA);
//		cursos.add(cursoB);
//		cursos.add(cursoC);
//		
//		System.out.println(cursos);
//		
//		cursos.remove(cursoB);
//		
//		System.out.println(cursos);
//		
//		System.out.println(cursos.get(0));
//	}
//}
	
	public class TestandoListas {

	    public static void main(String[] args) {

	        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
	        String curso2 = "Apache Camel";
	        String curso3 = "Certificacao Java SE 8 Programmer I";

	        ArrayList<String> cursos = new ArrayList<>();
	        cursos.add(curso1);
	        cursos.add(curso2);
	        cursos.add(curso3);        
            
	        Collections.sort(cursos);
	        
	        for (int i = 0; i < cursos.size(); i++) {
	            System.out.println("Aula : " + cursos.get(i));
	        }
	    }
	}
