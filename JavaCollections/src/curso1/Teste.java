package curso1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        
        List<Funcionario> funcionarios2 = new ArrayList<>();
        
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        
        funcionarios2.add(f1);
        funcionarios2.add(f2);
        funcionarios2.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
        System.out.println("###########");
        Iterator<Funcionario> iterador2 = funcionarios2.iterator();

        while (iterador2.hasNext()) {
            System.out.println(iterador2.next().getNome());
        } 
        
    }
}
