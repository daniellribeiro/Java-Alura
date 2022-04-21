package curso1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numerosList = new ArrayList<Integer>();
        Collection<Integer> numerosHash = new HashSet<Integer>();
        
        System.out.println("Incio ArrayList");
        long inicioList = System.currentTimeMillis();
        
        for (int i = 1; i <= 500000; i++) {
            numerosList.add(i);
        }
        System.out.println("Adicionado elementos na lista: " + calcularTempo(inicioList));
        
       
        for (Integer numero : numerosList) {
            numerosList.contains(numero);
        }
        System.out.println("Lendo elementos da lista: " + calcularTempo(inicioList));

        System.out.println("Tempo gasto na lista: " + calcularTempo(inicioList));
        
        //
        
        System.out.println("Incio HashSet");
        long inicioHash = System.currentTimeMillis();
        
        for (int i = 1; i <= 500000; i++) {
            numerosHash.add(i);
        }
        System.out.println("Adicionado elementos na lista: " + calcularTempo(inicioHash));
        
       
        for (Integer numero : numerosHash) {
        	numerosHash.contains(numero);
        }
        System.out.println("Lendo elementos da lista: " + calcularTempo(inicioHash));

        System.out.println("Tempo gasto na lista: " + calcularTempo(inicioHash));

    }
    
    public static long calcularTempo(long inicio){
    	return System.currentTimeMillis() - inicio;
    }
    

}