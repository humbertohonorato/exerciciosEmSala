package ExerciciosFixacao;


import javax.swing.JOptionPane;

public class Ex1 {
	public static void main (String args[]) {
		
		int i, somaImpar = 0;
		float valor;
		
		valor = Float.parseFloat(JOptionPane.showInputDialog("Digite uma nota"));
		
		for (i = 0; i <= valor; i++) {
			
			if (i % 3 == 0) {
				somaImpar = somaImpar + i;
			}
		}
		
		System.out.println("O valor da soma dos números impares é: " + somaImpar);
		
		
		
		
		
		
	}

}
