package model;

public class Mamifero {
	
	private String nome;
	private String corPelo;
	private boolean mama;
	private boolean focinho;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	public boolean isMama() {
		return mama;
	}
	public void setMama(boolean mama) {
		this.mama = mama;
	}
	public boolean isFocinho() {
		return focinho;
	}
	public void setFocinho(boolean focinho) {
		this.focinho = focinho;
	}
	
	public void andar() {
		System.out.println("O animal " + this.nome + " est� andando!");
	}
	

	public void fazerBarulho() {
		System.out.println("O animal " + this.nome + " est� fazendo barulho!");
	}
	

}
