package curso1;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo){
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo(){
		return this.tempo;
	}
	
	@Override
	public String toString(){
		return "\n Aula: " + this.titulo + ", tempo: " + this.tempo;
	}


	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
}
