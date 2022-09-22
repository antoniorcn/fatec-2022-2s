package edu.curso;
public class Pessoa {
	private String nome;
	private int idade;
	private boolean descansada;
	public boolean isDescansada() { 
		return this.descansada;
	}
	
	public void setDescansada(boolean valor) { 
		this.descansada = valor;
	}
	
	public String getNome() { 
		return this.nome;
	}
	public void setNome(String valor) { 
		this.nome = valor;
	}
	public int getIdade() { 
		return this.idade;
	}
	public void setIdade(int valor) { 
		if (valor < 0) { 
			throw new RuntimeException("Idade invalida");
		}
		this.idade = valor;
	}
}
