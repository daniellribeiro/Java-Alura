package curso1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private int tempoTotal;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    @Override
    public String toString(){
    	return "Curso: " + this.nome + ", tempo total: " + this.tempoTotal + "\n" 
    			+ "Aulas: " + this.getAulas();
    }
    
    public void adiciona(Aula aula){
    	this.aulas.add(aula);
    	tempoTotal += aula.getTempo();
    }
    
    public List<Aula> ordemAlfabetica(){
    	Collections.sort(this.aulas);
    	return this.aulas;
    }
    
    public int getTempoTotal(){
    	return tempoTotal;
    }
}
