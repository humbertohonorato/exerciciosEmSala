package ex2;

// Bloco de importação das Collections.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Iniciação do main da aplicação.
public class MinhasCollections {
	public static void main(String[] args) {
		
		// Instanciação de uma váriavel do Tipo inteiro, de modo a se torna um array List que receberá argumentos do tipo inteiro.
		List<Integer> minhaLista = new ArrayList<Integer>();
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(2);
				
		// laço de repetição que está atribuindo cada argumento do array minhaLista para a variável listaElementos e imprimindo em tela.
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}
		
		
		// Instanciação de uma váriavel do Tipo inteiro, de modo a se torna um array Set que receberá argumentos do tipo inteiro.		
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		
		// laço de repetição que está listando todos os vetorres que existem dentro do array de modo a agrupar os vetores que têm o valor igual.
		Iterator<Integer> iMeuSet = meuSet.iterator();
			while(iMeuSet.hasNext()) {
				System.out.println(iMeuSet.next());
		}
	}
}
		


