package Polimorfismo;

public class TelefoneCelular extends Telefone {
	
	// construtor
	public TelefoneCelular() {
		super("Celular");
	}
	
	public void toca (int codigoToque) {
		
		switch(codigoToque) {
		case 1:
			System.out.println("Roque, Roque, Roque...");
			break;
			
		case 2:
			System.out.println("Blim, Blim, Blim...");
			break;
			
		default: System.out.println("Trim, Trim, Trim...");
		break;
		}	
	}
	
	public void disca(String numero) {
		System.out.println("O n�mero: " + numero + " � um celular");
	}

	
	
	
}
