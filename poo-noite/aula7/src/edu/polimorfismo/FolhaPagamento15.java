package edu.polimorfismo;

public class FolhaPagamento15 
				extends FolhaPagamento {
	@Override
	public FuncionarioRemoto contratar() { 
		return new FuncionarioRemoto(2500);
	}
	
	@Override
	public void fazerPagamento(Funcionario f) { 
		double valor = f.salario * 1.15;
		f.recebePagamento(valor);
	}

}
