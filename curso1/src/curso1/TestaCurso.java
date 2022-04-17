package curso1;


public class TestaCurso {

    public static void main(String[] args) {
        Curso curso = new Curso("Curso1","professor1");
        
        curso.adiciona(new Aula("Aula1",11));
        

        curso.adiciona(new Aula("Aula2",21));
        

        curso.adiciona(new Aula("Aula3",31));
        
        System.out.println(curso);
    }
}