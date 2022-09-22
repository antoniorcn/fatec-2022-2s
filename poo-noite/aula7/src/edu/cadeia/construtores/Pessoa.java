package edu.cadeia.construtores;

public class Pessoa {
	String nome;
	
	public Pessoa() { 
		this("Anonimo");
	}
	
	public Pessoa(String n) {
		this.nome = n;
		System.out.println("Instanciando uma pessoa " + this.nome);
	}

}
