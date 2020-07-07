package veiculos;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Moto moto = new Moto();
		
		carro.setCor("Verde");
		carro.setDono("Pedrinho");
		carro.setMarca("Audi");
		carro.setMotor(true);
		carro.setPortas(4);
		carro.setTipo("4x4");
		carro.setVelocidadeMax(200);
		carro.setVelocidade(0);
		
		moto.setCor("Vermelha");
		moto.setDono("Zezinho");
		moto.setEstilo("Bobber");
		moto.setMarca("Triumph");
		moto.setPortas(0);
		moto.setVelocidadeMax(150);
		moto.setVelocidade(0);
		
		carro.compra();
		moto.vender();
		
		carro.decisao();
		moto.curva();
		
		
		
	}

}
