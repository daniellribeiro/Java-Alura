package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaOrubtStreamPrintWriter {
	    public static void main(String[] args) throws IOException {
	    	PrintStream bw = new PrintStream("lorem3.txt");
	    	bw.println("texto123321");
			bw.println();
			bw.println();
			bw.println("texto123321");
			bw.println("texto123321");
			bw.close();
	    }

}
