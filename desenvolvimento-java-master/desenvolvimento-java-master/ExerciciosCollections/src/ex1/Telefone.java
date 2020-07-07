package ex1;

public class Telefone {
	private String nrTelefone;
	private int tipoTelefone;
	
	public Telefone(String telefone, int tipo) {
		this.nrTelefone = telefone;
		this.tipoTelefone = tipo;
	}
	
	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public int getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}


}