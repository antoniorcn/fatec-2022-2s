package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudante implements Assinante {
	private StringProperty nome = 
			new SimpleStringProperty("");
	
	public Estudante(String nome) {
		this.nome.set(nome); 
	}
	
	@Override
	public void ler(String s) {
		System.out.println("Estudante " + 
	this.nome.get() + " esta lendo " + s );
	}
	
	public StringProperty nomeProperty() { 
		return this.nome;
	}
}
