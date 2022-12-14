package edu.curso;

import java.time.LocalDate;

public class Pet {
	private static int COUNTER = 1;
	private long id;
	private String nome;
	private LocalDate nascimento = LocalDate.now();
	
	public Pet() { 
		setId(Pet.COUNTER);
		Pet.COUNTER++;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
}
