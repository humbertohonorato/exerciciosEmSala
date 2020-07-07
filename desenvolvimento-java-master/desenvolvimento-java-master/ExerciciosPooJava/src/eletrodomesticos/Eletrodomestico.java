package eletrodomesticos;

public class Eletrodomestico {

	private String cor;
	private Number custo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Number getCusto() {
		return custo;
	}
	public void setCusto(Number custo) {
		this.custo = custo;
	}
	
	
	public void listaCompra() {
		System.out.println("Ir na loja e comprar uma vassoura na cor " + this.getCor() + " que custa " + this.getCusto());
	}
	
	public void compra() {
		System.out.println("Ir na loja e comprar uma vassoura na cor " + this.getCor() + " que custa " + this.getCusto());
	}
}
