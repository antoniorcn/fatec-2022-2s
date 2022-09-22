package edu.curso;

public class Jogador {
	String nome;
	int posicao;
	int stamina;
	int energia;
	
	public Jogador(String nome, int energia) { 
		this.nome = nome;
		this.energia = energia;
	}
	
	public void jogar() { 
		System.out.println("Jogador " + this.nome + " está jogando");
	}
}
