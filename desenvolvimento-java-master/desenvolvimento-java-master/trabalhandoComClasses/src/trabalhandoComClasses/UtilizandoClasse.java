package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		//vari�veis que ser�o par�metros do m�todo construtor
		String cor = "n�o sei";
		String marca = "n�o sei tamb�m";
		
		//Ins�nciando a classe Carro
		//criando o objeto meucarro
		Carro meucarro = new Carro(cor, marca);
		
		//executando o m�todo.
		meucarro.mostraMarcaCor();
		
		
		//Trocando a cor do carro
		meucarro.setCor("vermelho");
		meucarro.setMarca("Carr�o");
		meucarro.mostraMarca();
		
		//executando o m�todo.
		meucarro.mostraMarcaCor();
		
		marca = "Fiat";
		meucarro.setMarca(marca);
		meucarro.mostraMarcaCor();
		
		
		

	}

}
