package main;

import model.Cachorro;

public class main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Lulu");
		cachorro.setCorPelo("Preto");
		cachorro.setMama(true);
		cachorro.setFocinho(true);
		cachorro.setPorte("Grande");
		cachorro.setTipo("Dom�stico");
		
		cachorro.andar();
		cachorro.latir();
		cachorro.fazerBarulho();
		
	}

}
