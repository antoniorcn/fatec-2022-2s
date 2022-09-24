package edu.composicao;

public class Pessoa {
	public String nome;
	public String cpf;
	private int idade;
	public Celular celular;
	
	private Coracao coracao = new Coracao();
	
	public Pessoa(String n) { 
		this.nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Celular getCelular() {
		return celular;
	}
	public void setCelular(Celular celular) {
		this.celular = celular;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade > 0) { 
			this.idade = idade;
		}
	}
}
