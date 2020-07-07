package JavaTeste;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String args[])
	{
		Scanner leitor = new Scanner (System.in);
		int i, somaPar = 0, somaImpar = 0, valor;
		System.out.println("Entre com um valor: ");
		valor = leitor.nextInt();
		
		for(i = 0; i <= valor; i++) 
		{
			if (i % 2==0) 
				somaPar = somaPar + i;
			else 
				somaImpar = somaImpar + i;
		}
		
		System.out.println("Soma de pares: " + somaPar + "|" + "Soma de impares: " + somaImpar);
		
	}
}
