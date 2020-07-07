package main;

import model.Cachorro;
import model.Gato;

public class main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Lulu");
		cachorro.setMama(false);
		cachorro.setFocinho(true);
		cachorro.setPorte("Médio");
		
		cachorro.andar();
		cachorro.latir();
		cachorro.fazerBarulho();
		
		System.out.println("\n-------------------------------------\n");
		
		Gato gato = new Gato();
		
		gato.setNome("Mingal");
		gato.setMama(true);
		gato.setBigode(true);
		gato.setFocinho(true);
		
		gato.andar();
		gato.miar();
		gato.fazerBarulho();
	}

}
