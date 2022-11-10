package edu.curso;

public class Trabalhador implements Assinante {
	private String nome;
	public Trabalhador(String nome) {
		this.nome = nome; 
	}
	
	@Override
	public void receberNoticia(String noticia) {
		System.out.println("Funcionario " + this.nome + 
				" esta lendo " + noticia + " na empresa");
	}

}
