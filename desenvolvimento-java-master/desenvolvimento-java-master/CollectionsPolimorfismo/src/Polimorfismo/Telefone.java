package Polimorfismo;

public abstract class Telefone {
	
	private String tipo;
	
	// Construtor
	public Telefone (String tipo) { 
		this.tipo = tipo;
		
	}
	
	// Método abstrato para uso em polimorfismo
	abstract public void disca (String numero);
	
	// Método abstrato para uso em polimorfismo
	abstract public void toca (int numToques);
	
}

// Trabalhar com MÉTODOS ABSTRATOS nos OBRIGA a ter q construir os métodos no lado da classe filha.