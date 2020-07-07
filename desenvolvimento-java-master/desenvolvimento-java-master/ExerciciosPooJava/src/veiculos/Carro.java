package veiculos;

public class Carro extends Veiculos {

	private String tipo;
	private boolean motor;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public void categoria () {
		System.out.println("Joãozinho que um carro da categoria " + this.getTipo() + " e da marca " + this.getMarca());
	}
	
	
}
