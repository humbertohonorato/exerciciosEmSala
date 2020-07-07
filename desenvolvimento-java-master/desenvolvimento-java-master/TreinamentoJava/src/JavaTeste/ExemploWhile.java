package JavaTeste;

import java.util.Scanner;

public class ExemploWhile {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com um valor Inicial:");
		int numeroInicial = entrada.nextInt();
		System.out.println("Entre com um valor Final:");
		int numeroFinal = entrada.nextInt();
		int numeroAtual = numeroInicial;
		while(numeroAtual <= numeroFinal)
		{
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
	}
}
