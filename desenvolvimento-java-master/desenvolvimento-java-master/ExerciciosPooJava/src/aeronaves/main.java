package aeronaves;

public class main {

	public static void main(String[] args) {
		
		Aeronave aviao1 = new Aeronave();
		Aeronave aviao2 = new Aeronave();
		
		aviao1.setAsa(true);
		aviao1.setCompanhia("Aviaum");
		aviao1.setNomePiloto("Zezinho");
		aviao1.setVoar(true);
		
		aviao2.setAsa(false);
		aviao2.setCompanhia("Avianzão");
		aviao2.setNomePiloto("Toninho");
		aviao2.setVoar(false);
		
		aviao1.levantarVoo();
		aviao2.naoLevantarVoo();

	}

}
