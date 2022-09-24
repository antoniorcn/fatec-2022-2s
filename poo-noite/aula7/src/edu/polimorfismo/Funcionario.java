package edu.polimorfismo;

public class Funcionario {
	double salario;
	
	public Funcionario(double valor) { 
		this.salario = valor;
	}
	
	public void recebePagamento(double valor) { 
		System.out.println("Eba recebi " + valor);
	}

}
