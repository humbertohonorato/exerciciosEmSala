package Polimorfismo;

public abstract class Telefone {
	
	private String tipo;
	
	// Construtor
	public Telefone (String tipo) { 
		this.tipo = tipo;
		
	}
	
	// M�todo abstrato para uso em polimorfismo
	abstract public void disca (String numero);
	
	// M�todo abstrato para uso em polimorfismo
	abstract public void toca (int numToques);
	
}

// Trabalhar com M�TODOS ABSTRATOS nos OBRIGA a ter q construir os m�todos no lado da classe filha.