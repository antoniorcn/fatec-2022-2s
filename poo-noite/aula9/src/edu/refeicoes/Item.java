package edu.refeicoes;

public class Item {
	private String codigo;
	private String nome;
	private double preco;
	
	public String getCodigo() { 
		return this.codigo;
	}
	public void setCodigo(String valor) { 
		this.codigo = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() { 
		return this.codigo + " - " + this.nome +
				"............ R$ " + this.preco;
	}
}
