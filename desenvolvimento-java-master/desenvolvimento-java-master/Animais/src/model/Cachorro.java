package model;

public class Cachorro {
	
	private String nome;
	private String corPelo;
	private boolean mama;
	private boolean focinho;
	private String porte;
	private String tipo;
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
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void andar() {
		System.out.println("O cachorro " + this.nome + " est� andando!");
	}
	
	public void fazerBarulho() {
		System.out.println("O cachorro " + this.nome + " est� fazendo barulho");
	}
	
	public void latir() {
		System.out.println("O cachorro " + this.nome + " est� latindo");
	}

	
}
