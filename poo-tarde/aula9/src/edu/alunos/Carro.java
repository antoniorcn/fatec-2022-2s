package edu.alunos;

public class Carro extends Automovel implements Transportavel {
//	int consumo = 12;
	public void transportar() { 
		System.out.println("Transportando de carro consumindo " + 
	consumo + " km/litro");
	}
	
	public void ligar() { 
		System.out.println("Ligando o carro");
	}
	
	public void desligar() { 
		System.out.println("Desligando o carro");
	}
	
	public static void main(String[] args) {
		Carro c = new Carro();
		Transportavel t = c;
		c.transportar();
		
	}

}
