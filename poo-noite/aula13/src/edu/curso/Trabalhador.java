package edu.curso;

public class Trabalhador implements Assinante {
	private String nome;

	public Trabalhador(String nome) {
		this.nome = nome; 
	}
	
	@Override
	public void ler(String s) {
		System.out.println("Trabalhador " + this.nome + 
				" est� lendo " + s + " no p�tio da empresa");
	}
}
