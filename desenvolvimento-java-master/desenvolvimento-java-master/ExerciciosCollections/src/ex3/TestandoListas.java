package ex3;

//Bloco de importação das Collections.
import java.util.List;
import java.util.ArrayList;

//Iniciação do main da aplicação.
public class TestandoListas {

	public static void main(String[] args) {
		
		// Variavéis
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		// Instanciação de uma váriavel do Tipo String, de modo a se torna um array List que receberá argumentos do tipo String.
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		System.out.println(aulas.size());
		
		// laço de repetição que está percorrendo o tamanho do Arraylist enquanto imprime em tela os valores dos vetores.
		for(int i = 0; i <= aulas.size(); i++) {
			System.out.println("Aulas: " + aulas.get(i));
		}

	}

}
