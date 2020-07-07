package Collections;

import java.util.*;

public class ListaAlunoMap {

	public static void main(String[] args) {
		
		//O primeiro refere-se � chave e o segundo ao valor
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>(); //garante que as chaves estar�o em ordem ascendente.
		
		Aluno a = new Aluno("Carlos Ferreira", "Java B�sico", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("Jos� Guerreiro", "MySQL", 0);
		Aluno f = new Aluno("Ana", "MySQL", 0);
		
		
		mapa.put("Carlos Ferreira",a); //M�todo para inserir na estrutura
		mapa.put("Maria Souza",b);
		mapa.put("Carla Silva",c);
		mapa.put("Jos� Guerreiro",d);
		mapa.put("Ana",f);
		
		System.out.println(mapa);
		System.out.println("O valor a ser recuperado �: " + mapa.get("Jos� Guerreiro")); //recupera um valor em espec�fico.
		
		Collection<Aluno> alunos = mapa.values(); //retorna um *Collection* com os valores associados �s chaves
		
		for(Aluno e : alunos) {
			System.out.println(e);
		}
		
	}

}

//O MAP ORDENA POR ORDEM ALFAB�TICA, ENTRETANTO DE FORMA COMPARATIVA, J� Q SUA CHAVE TEM Q TER O MESMO NOME DE SEU VALOR.
//O .GET SERVE PARA RETORNAR UM VALOE ESPEC�FICO, ENT�O O VALOR A SER PROCURANDO TEM SER INFORMADO IGUAL ELE EXISTE DENTRO DO ARRAY. CASO SEJA INFORMADO ERRADO OU N�O EXISTA, ELE RETORNAR� NULL.
