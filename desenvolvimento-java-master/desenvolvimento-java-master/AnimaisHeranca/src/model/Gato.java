package model;

public class Gato extends Mamifero {
	
	private boolean bigode;

	public boolean isBigode() {
		return bigode;
	}

	public void setBigode(boolean bigode) {
		this.bigode = bigode;
	}
	
	public void miar() {
		System.out.println("O gato " + getNome() + " está miando!");
	}

}
