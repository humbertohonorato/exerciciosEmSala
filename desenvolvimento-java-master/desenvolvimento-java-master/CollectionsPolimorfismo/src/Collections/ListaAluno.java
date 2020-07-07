package Collections;

import java.util.*;

public class ListaAluno {

	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("Carlos Ferreira", "Java B�sico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("Jos� Guerreiro", "MySQL", 0);
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		System.out.println(lista);
		
		Aluno aluno;
		Iterator<Aluno> itr = lista.iterator();       //Interator serve para comparar, de modo a apresentar desde o primeiro ind�ce at� o ultimo, entretanto de forma corrida (Em coluna).
			while (itr.hasNext()) {                   //O hasNext() serve para percorrer todo o tamanho do vetor e trazer os dados, enquanto n�o termina ele continua varrendo, ao concluir ele adere ao valor null e para de executar, de modo a entendermos q ele varreu tudo.
				aluno = itr.next();                   //O next() serve para pegar as pr�ximas inser��es do array.
				System.out.println(aluno.getNome());
			}
	}

}

//O LIST N�O SE IMPORTA COM ORDEM ALFAB�TICA OU ALGO PARECIDO, SOMENTE COM A ORDEM DE IND�CES.
