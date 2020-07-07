package JavaTeste;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main (String args[])
	{
		Scanner entrada = new Scanner (System.in);
		int x = 0;
		double num1, num2, resultado = 0;
		
		do {
			
			System.out.println(" 1) Somar ");
			System.out.println(" 2) Subtrair ");
			System.out.println(" 3) Multiplicar ");
			System.out.println(" 4) Dividir ");
			System.out.println(" 0) Sair ");
			
			System.out.println("Digite o código da operação desejada: ");
			x = entrada.nextInt();
			
			if (x != 0) {
				System.out.println("Digite o primeiro número: ");
				num1 = entrada.nextInt();
				
				System.out.println("Digite o segundo número: ");
				num2 = entrada.nextInt();
				
				if (x == 1) {
					resultado = num1 + num2;
				}
				else {
					if (x == 2) {
						resultado = num1 - num2;
					}
					else {
						if (x == 3) {
							resultado = num1 * num2;
						}
						else {
							if (x == 4) {
								resultado = num1 / num2;
							}
						}
					}
				}
				System.out.println();
				System.out.println("O resultado é: " + resultado);
				System.out.println();
			}
			else {
				resultado = 0;
			}
		}
		while (x != 0);
		
		
		
	}
}
