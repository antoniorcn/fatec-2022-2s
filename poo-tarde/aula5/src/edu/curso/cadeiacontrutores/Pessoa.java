package edu.curso.cadeiacontrutores;
public class Pessoa {
	private String nome;
	public Pessoa(String valor) {
		this.nome = valor;
		System.out.println("Instanciando Pessoa " + this.nome);
	}
	public Pessoa() { 
		
	}
	public String getNome() { 
		return this.nome;
	}
	public void setNome(String valor) { 
		this.nome = valor;
	}

}
