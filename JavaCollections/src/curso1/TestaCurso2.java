package curso1;


public class TestaCurso2 {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso1","professor1");
        
        curso.adiciona(new Aula("Aula1",11));
        

        curso.adiciona(new Aula("ZAula2",21));
        

        curso.adiciona(new Aula("Aula3",32));
        
        System.out.println(curso);
        
        curso.ordemAlfabetica();
        
        System.out.println(curso);
        
    }
}