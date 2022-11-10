package edu.curso;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Pessoa {

	private StringProperty nome = new SimpleStringProperty("");
	
	public String getNome() { 
		return nome.get();
	}
	
	public void setNome(String nome) { 
		this.nome.set(nome);
	}
	
	public StringProperty nomeProperty() { 
		return this.nome;
	}
}
