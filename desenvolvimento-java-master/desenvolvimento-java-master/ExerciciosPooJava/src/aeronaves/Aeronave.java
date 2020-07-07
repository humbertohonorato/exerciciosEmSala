package aeronaves;

public class Aeronave {
	
	private boolean voar;
	private boolean asa;
	private String nomePiloto;
	private String companhia;
	public boolean isVoar() {
		return voar;
	}
	public void setVoar(boolean voar) {
		this.voar = voar;
	}
	public boolean isAsa() {
		return asa;
	}
	public void setAsa(boolean asa) {
		this.asa = asa;
	}
	public String getNomePiloto() {
		return nomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public void levantarVoo() {
		System.out.println("O piloto " + this.getNomePiloto() + " est� pilotando um avi�o da companhia " + this.getCompanhia());
	}
	
	public void naoLevantarVoo () {
		System.out.println("O piloto " + this.getNomePiloto() + " n�o pode levantar voo com o avi�o da companhia " + this.getCompanhia());
	}
	
}
