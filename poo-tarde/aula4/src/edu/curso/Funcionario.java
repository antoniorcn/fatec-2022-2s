package edu.curso;

public class Funcionario {

	public double salario;
	
	public Funcionario(double valorInicial) { 
		this.salario = valorInicial;
	}
	
	public Funcionario() { 
		this.salario = 1200.00;
	}
	
	public void receberPagamento(double valor) { 
		System.out.println("Eba recebi " + valor);
	}
	
	
}
