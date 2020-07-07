package ClassesAbstratas;

public class Principal {

	public static void main(String[] args) {
		Fisica pessoa1 = new Fisica("Daniel");
		System.out.println(pessoa1.getNome()); //Daniel
		System.out.println(pessoa1.getCPF()); //nulo
		
		Juridica pessoa2 = new Juridica();
		System.out.println(pessoa2.getNome()); //sem nome
		System.out.println(pessoa2.getCNPJ()); //nulo

	}

}

//O SUPER faz referência e respeita o CONSTRUTOR da classe PAI.
