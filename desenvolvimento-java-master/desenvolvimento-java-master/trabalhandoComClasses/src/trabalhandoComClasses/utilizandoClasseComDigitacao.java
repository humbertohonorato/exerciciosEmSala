package trabalhandoComClasses;

import java.util.Scanner;

public class utilizandoClasseComDigitacao {

	public static void main(String[] args) {
		String cor = "";
		String marca = "";
		
		//instanciar a classe Carro
		//criar o objeto carroaluno

		Carro carroaluno = new Carro("", "");
		
		//Instanciando a classe Scanner
		Scanner entrada = new Scanner (System.in);
		
		//Recebendo a digitação do usuário.
		System.out.print("Informe a cor: ");
		cor = entrada.nextLine();
		carroaluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = entrada.nextLine();
		carroaluno.setMarca(marca);
		
		//Mostrando os resultados
		carroaluno.mostraMarcaCor();
		
		
	}

}
