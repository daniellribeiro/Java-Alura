package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daniel");
		cliente.setProfissao("Dev");
		cliente.setCpf("12345678911");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente2 = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente2.getCpf());
	}
}
