package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	    public static void main(String[] args) throws IOException {
	    	BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
	    	bw.write("texto123321");
			bw.newLine();
			bw.newLine();
			bw.write("texto123321");
			bw.close();
	    }

}
