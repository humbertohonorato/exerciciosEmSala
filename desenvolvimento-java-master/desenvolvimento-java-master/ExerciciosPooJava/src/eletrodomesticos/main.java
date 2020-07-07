package eletrodomesticos;

public class main {

	public static void main(String[] args) {
		
		Eletrodomestico vassoura = new Eletrodomestico();
		Eletrodomestico forno = new Eletrodomestico();
		
		vassoura.setCor("Vermelha");
		vassoura.setCusto(10.00);
		
		forno.setCor("Branco");
		forno.setCusto(1500.00);
		
		vassoura.listaCompra();
		forno.compra();

	}

}
