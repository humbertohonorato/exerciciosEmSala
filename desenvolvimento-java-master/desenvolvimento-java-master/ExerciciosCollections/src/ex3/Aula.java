package ex3;

// Criação de uma classe Pública
public class Aula {
	
	// Atribuindo propriedadas à classe.
	private String titulo;
	private int tempo;
	
	// Criando o construtor da classe.
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	// Bloco de Getters e Setters das propriedades da classe.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
}
