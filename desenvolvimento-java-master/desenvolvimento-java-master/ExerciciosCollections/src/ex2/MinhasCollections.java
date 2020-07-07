package ex2;

// Bloco de importa��o das Collections.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Inicia��o do main da aplica��o.
public class MinhasCollections {
	public static void main(String[] args) {
		
		// Instancia��o de uma v�riavel do Tipo inteiro, de modo a se torna um array List que receber� argumentos do tipo inteiro.
		List<Integer> minhaLista = new ArrayList<Integer>();
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(2);
				
		// la�o de repeti��o que est� atribuindo cada argumento do array minhaLista para a vari�vel listaElementos e imprimindo em tela.
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		
		// Instancia��o de uma v�riavel do Tipo inteiro, de modo a se torna um array Set que receber� argumentos do tipo inteiro.		
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		
		// la�o de repeti��o que est� listando todos os vetorres que existem dentro do array de modo a agrupar os vetores que t�m o valor igual.
		Iterator<Integer> iMeuSet = meuSet.iterator();
			while(iMeuSet.hasNext()) {
				System.out.println(iMeuSet.next());
		}
	}
}
		


