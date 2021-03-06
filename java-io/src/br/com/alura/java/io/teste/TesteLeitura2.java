package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws FileNotFoundException  {
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");
		
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			//System.out.println(linha);
			

			Scanner scannerLinha = new Scanner(linha);
			
			scannerLinha.useDelimiter(",");
			scannerLinha.useLocale(Locale.US);
			
			String tipoConta  = scannerLinha.next();
            Integer agencia   = scannerLinha.nextInt();
            Integer numero    = scannerLinha.nextInt();
            String titular    = scannerLinha.next();
            Double saldo      = scannerLinha.nextDouble();
            
            System.out.format(new Locale("pt","BR"),"TipoConta: %s Conta: %04d/%08d ,Titular: %20s => Saldo: %.2f %n", tipoConta,agencia,numero,titular,saldo);

    		scannerLinha.close();
		}
		scanner.close();

	}
}
