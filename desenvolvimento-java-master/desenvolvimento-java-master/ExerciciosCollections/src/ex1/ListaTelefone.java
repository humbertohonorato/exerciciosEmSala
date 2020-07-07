package ex1;

import java.util.*;

public class ListaTelefone {

	public static void main(String[] args) {
		
		List<Telefone> lista = new ArrayList<Telefone>();
		
		Telefone ligacao1 = new Telefone("12345678", 0);
		Telefone ligacao2 = new Telefone("987654321", 2);
		Telefone ligacao3 = new Telefone("123456789", 1);
		
		lista.add(ligacao1);
		lista.add(ligacao2);
		lista.add(ligacao3);
		
		
		Telefone dispositivo;
		Iterator<Telefone> coluna = lista.iterator();
		while(coluna.hasNext()) {
			dispositivo = coluna.next();
			System.out.println(dispositivo.getNrTelefone());
		}
			
	}

}
