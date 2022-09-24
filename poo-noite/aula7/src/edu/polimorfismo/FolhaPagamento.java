package edu.polimorfismo;

public class FolhaPagamento {
	
	
	public Funcionario contratar() { 
		return new Funcionario(2000);
	}
	
	public void fazerPagamento(Funcionario f) { 
		double valor = f.salario * 1.10f;
		f.recebePagamento(valor);
	}

}
