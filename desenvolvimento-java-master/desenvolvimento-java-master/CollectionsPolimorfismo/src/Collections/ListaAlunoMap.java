package Collections;

import java.util.*;

public class ListaAlunoMap {

	public static void main(String[] args) {
		
		//O primeiro refere-se à chave e o segundo ao valor
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>(); //garante que as chaves estarão em ordem ascendente.
		
		Aluno a = new Aluno("Carlos Ferreira", "Java Básico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("José Guerreiro", "MySQL", 0);
		Aluno f = new Aluno("Ana", "MySQL", 0);
		
		
		mapa.put("Carlos Ferreira",a); //Método para inserir na estrutura
		mapa.put("Maria Souza",b);
		mapa.put("Carla Silva",c);
		mapa.put("José Guerreiro",d);
		mapa.put("Ana",f);
		
		System.out.println(mapa);
		System.out.println("O valor a ser recuperado é: " + mapa.get("José Guerreiro")); //recupera um valor em específico.
		
		Collection<Aluno> alunos = mapa.values(); //retorna um *Collection* com os valores associados às chaves
		
		for(Aluno e : alunos) {
			System.out.println(e);
		}
		
	}

}

//O MAP ORDENA POR ORDEM ALFABÉTICA, ENTRETANTO DE FORMA COMPARATIVA, JÁ Q SUA CHAVE TEM Q TER O MESMO NOME DE SEU VALOR.
//O .GET SERVE PARA RETORNAR UM VALOE ESPECÍFICO, ENTÃO O VALOR A SER PROCURANDO TEM SER INFORMADO IGUAL ELE EXISTE DENTRO DO ARRAY. CASO SEJA INFORMADO ERRADO OU NÃO EXISTA, ELE RETORNARÁ NULL.
