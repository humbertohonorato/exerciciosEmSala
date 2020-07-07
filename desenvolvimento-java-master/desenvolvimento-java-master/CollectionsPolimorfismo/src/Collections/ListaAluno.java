package Collections;

import java.util.*;

public class ListaAluno {

	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("Carlos Ferreira", "Java Básico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("José Guerreiro", "MySQL", 0);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		System.out.println(lista);
		
		Aluno aluno;
		Iterator<Aluno> itr = lista.iterator();       //Interator serve para comparar, de modo a apresentar desde o primeiro indíce até o ultimo, entretanto de forma corrida (Em coluna).
			while (itr.hasNext()) {                   //O hasNext() serve para percorrer todo o tamanho do vetor e trazer os dados, enquanto não termina ele continua varrendo, ao concluir ele adere ao valor null e para de executar, de modo a entendermos q ele varreu tudo.
				aluno = itr.next();                   //O next() serve para pegar as próximas inserções do array.
				System.out.println(aluno.getNome());
			}
	}

}

//O LIST NÃO SE IMPORTA COM ORDEM ALFABÉTICA OU ALGO PARECIDO, SOMENTE COM A ORDEM DE INDÍCES.
