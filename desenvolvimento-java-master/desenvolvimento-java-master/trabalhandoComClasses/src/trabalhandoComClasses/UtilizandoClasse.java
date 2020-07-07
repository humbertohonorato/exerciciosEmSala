package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		//variáveis que serão parâmetros do método construtor
		String cor = "não sei";
		String marca = "não sei também";
		
		//Insânciando a classe Carro
		//criando o objeto meucarro
		Carro meucarro = new Carro(cor, marca);
		
		//executando o método.
		meucarro.mostraMarcaCor();
		
		
		//Trocando a cor do carro
		meucarro.setCor("vermelho");
		meucarro.setMarca("Carrão");
		meucarro.mostraMarca();
		
		//executando o método.
		meucarro.mostraMarcaCor();
		
		marca = "Fiat";
		meucarro.setMarca(marca);
		meucarro.mostraMarcaCor();
		
		
		

	}

}
