package edu.curso;

public class Caixa {
	
	public double saldo;
	
	public double venda(double valorProduto) { 
		this.saldo += valorProduto;
		return this.saldo;
	}

}
