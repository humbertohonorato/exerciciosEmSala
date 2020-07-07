package Collections;

import java.util.*;

public class ListaAlunoSet {

	public static void main(String[] args) {
		
		Set<Aluno> conjunto = new HashSet<Aluno>();
		
		Aluno a = new Aluno("Carlos Ferreira", "Java Básico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("Maria Souza", "Python", 0);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		System.out.println(conjunto);
		
		for(Aluno aluno : conjunto) {
			System.out.println(aluno);
		}
		
	}

}

// O SET NÃO SE IMPORTA COM ORDEM ALFABÉTICA OU ALGO PARECIDO, ENTRETANTO SE IMPORTA EM AGRUPAR E NOS MOSTRAR DADOS REPETIDOS.
