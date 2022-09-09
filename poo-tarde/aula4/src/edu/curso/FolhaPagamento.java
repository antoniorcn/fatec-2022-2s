package edu.curso;

public class FolhaPagamento {
	
	// double fazPagamento(Funcionario f, double[] beneficios){
	double fazPagamento(Funcionario f, double ... beneficios){	
		double valorTotal = f.salario;
		for (int i = 0; i < beneficios.length; i++) {
			valorTotal += beneficios[i];
		}
		f.receberPagamento(valorTotal);
		return valorTotal;
	}

}
