package veiculos;

import java.util.Scanner;

public class Veiculos {

	private String cor;
	private String marca;
	private int portas;
	private String dono;
	private float velocidadeMax;
	private float velocidade;
	
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public float getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getPortas() {
		return portas;
	}
	
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	public String getDono() {
		return dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void compra() {
		System.out.println(this.getDono() + " quer comprar um carro da marca " + this.getMarca() + " com " + this.getPortas() + " portas");
	}
	
	public void vender() {
		System.out.println(this.getDono() + " quer vender a sua moto da marca " + this.getMarca());
	}
	
	public void decisao() {
		Scanner valor = new Scanner(System.in);
		System.out.println("Informe a sua velocidade atual.");
		int velocidadeAtual = valor.nextInt();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Aperte 0 para acelerar ou 1 para frear.");
		
		
		if(entrada.nextInt() == 0) {
			while(velocidadeAtual <= velocidadeMax) {
				velocidadeAtual += 10;
				System.out.println(velocidadeAtual + "km/h");
				System.out.println("E subindo!");
				
				
				Scanner escolha = new Scanner(System.in);
				System.out.println("ATENÇÃO!!! Tem certeza que quer continuar acelerando? Se sim, APERTE 1 e caso NÃO queira mais, APERTE QUALQUER TECLA");
				
				if(escolha.nextInt() == 1) {
					System.out.println("Tenho!");
				}
				
				else {
					System.out.println("Ihhhhhhhhh ARREGOU TANTO, que o carro morreu... Aperta CTRl + F11 e bora.");
					break;
				}	
			}
		}
		
		else {
			while(velocidadeAtual <= velocidadeMax) {
				velocidadeAtual -= 15;
				System.out.println(velocidadeAtual + "km/h");
				System.out.println("E descendo!");
				
				
				Scanner escolha = new Scanner(System.in);
				System.out.println("ATENÇÃO!!! Tem certeza que quer continuar desacelerando? Se sim, APERTE 1 e caso NÃO queira mais, APERTE QUALQUER TECLA");
				
				if(escolha.nextInt() == 1) {
					System.out.println("Tenho!");
				}
				
				else {
					System.out.println("Vamo meu fi, Aceleraaa... Aperta CTRl + F11 e bora.");
					break;
					
				}	
			}
		}
	}
	
	
	public void curva() {
		int velocidadeMaxima = 70;
		
		if(velocidade == 0) {
			while(velocidade <= velocidadeMaxima) {
				System.out.println(velocidade + "km/h");
				System.out.println("Acelerando... CUIDADO!");
				velocidade+= 5;
			}
			System.out.println("RISCO EMINENTE DE CAPOTAMENTO, CUIDADO!");
		}
	}
	
	
	
}
