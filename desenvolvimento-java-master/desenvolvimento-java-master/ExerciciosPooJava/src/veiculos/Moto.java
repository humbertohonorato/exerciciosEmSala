package veiculos;

public class Moto extends Veiculos {

	private String estilo;

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public void gosto() {
		System.out.println("Marcelo gosta de motos no estilo " + this.getEstilo() + " e na cor " + this.getCor());
	}
	
}
