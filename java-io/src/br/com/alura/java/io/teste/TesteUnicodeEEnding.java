package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "casa";
		converterUnicode(s);

		
		System.out.println(setByte(s,Charset.defaultCharset()));
		
		System.out.println(setByte(s,StandardCharsets.UTF_16));
		
		System.out.println(setByte(s,StandardCharsets.US_ASCII));
		
		
	}
	public static String setByte(String palavra, Charset encoding) throws UnsupportedEncodingException{
        
		byte[] bytes = palavra.getBytes(encoding);
	
		String palavraNova = new String(bytes,encoding);
		
		//System.out.println(palavraNova);
		
		return bytes.length + " " + encoding + " " + palavraNova;
	}
	
	public static void converterUnicode(String palavra){
		for(int i=0; i < palavra.length() ; i++){
			System.out.println(palavra.charAt(i) + " = " + palavra.codePointAt(i));
		}
	}
}
