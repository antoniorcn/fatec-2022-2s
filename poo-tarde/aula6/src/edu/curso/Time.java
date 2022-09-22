package edu.curso;

public class Time {
	String nome;
	Jogador[] jogadores = new Jogador[2];
	
	Time(String nome) { 
		this.nome = nome;
	}
	
	public void treinar() { 
		System.out.println("Treinando os jogadores");
	}
	
	public void jogar() { 
		System.out.println("Time " + this.nome + " Jogando");
		this.jogadores[0].jogar();
		this.jogadores[1].jogar();
	}

}
