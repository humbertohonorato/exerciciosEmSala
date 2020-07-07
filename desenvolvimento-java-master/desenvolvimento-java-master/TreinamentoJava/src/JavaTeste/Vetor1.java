package JavaTeste;

import java.util.Scanner;

public class Vetor1 {
	public static void main (String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 4, 6, 2, 10};
		int[] arrayDois = {1, 2, 3, 4, 5, 6, 7, 8};
		float[] nota = new float[5];
		
		//Tamanho do array
		if (arrayDois.length > 8) {
			System.out.println("Tamanho do arrayDois é maior que 8!");
		}
		else {
			System.out.println("Tamanho do arrayDois é menor que 8!");
		}
		System.out.println("\nTamanho do arrayUm = " + arrayUm.length);
		System.out.println("-----------------------------------------");
		
		//Utilização do for-each
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for (String i : cars) { //Essa é a estrutura do for-each no Java
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = entrada.nextFloat();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Nota " + (i + 1) + " = " + nota[i]);
		}
		
	}
}