package edu.alunos;

import java.time.LocalDate;

public class Aluno {
	private long id;
	private String nome;
	private String ra;
	private LocalDate nascimento;
	
	public long getId() { 
		 return this.id;
	}
	public void setId(long valor) { 
		this.id = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public void exibir() {
		System.out.println("Dados do aluno \n" + toString());
	}
	
	@Override
	public String toString() { 
		return "RA: " + this.getRa() + 
				"\tNome: " + this.getNome() + 
				"\tNascimento: " + this.getNascimento();
	}
}
