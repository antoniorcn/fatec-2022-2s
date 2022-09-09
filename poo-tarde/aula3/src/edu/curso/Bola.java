package edu.curso;

public class Bola {
	float tamanho;
	String cor;
	String material;
	float peso;
	String formato;
	boolean cheia = false;
	
	public void quicar() { 
		if (cheia == true) { 
			System.out.println("Bola quicando...");
		} else { 
			System.out.println("Bola não quica porque esta murcha");
		}
	}
	
	public void voar() {
		System.out.println("Bola voando....");
	}

	public void murchar() {
		System.out.println("Bola murchando....");
		cheia = false;
	}
	
	public void encher() { 
		System.out.println("Enchendo a bola");
		cheia = true;
	}
}
