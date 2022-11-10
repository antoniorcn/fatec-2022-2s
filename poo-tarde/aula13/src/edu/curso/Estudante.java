package edu.curso;

public class Estudante implements Assinante {
	private String nome;
	public Estudante(String nome) { 
		this.nome = nome;
	}
	
	@Override
	public void receberNoticia(String noticia) {
		System.out.println(this.nome + " esta lendo " + 
	noticia + " na faculdade.");
	}
}
