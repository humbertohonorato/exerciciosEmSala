package ex3;

//Bloco de importa��o das Collections.
import java.util.List;
import java.util.ArrayList;

//Inicia��o do main da aplica��o.
public class TestandoListas {

	public static void main(String[] args) {
		
		// Variav�is
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		// Instancia��o de uma v�riavel do Tipo String, de modo a se torna um array List que receber� argumentos do tipo String.
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		System.out.println(aulas.size());
		
		// la�o de repeti��o que est� percorrendo o tamanho do Arraylist enquanto imprime em tela os valores dos vetores.
		for(int i = 0; i <= aulas.size(); i++) {
			System.out.println("Aulas: " + aulas.get(i));
		}

	}

}
