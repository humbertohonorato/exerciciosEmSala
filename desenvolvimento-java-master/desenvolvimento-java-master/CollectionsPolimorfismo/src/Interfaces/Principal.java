package Interfaces;

public class Principal {

	public static void main(String[] args) {
		
		ParticipanteForum participante = new ParticipanteForum(); //instanciado
		Leitor leitor = participante; //upcast para Leitor
		System.out.println("O participante está lendo " + leitor.lendo());
		
		Programador programador = participante; //upcast para Programador
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E programando " + programador.digitando());
		
	}

}
