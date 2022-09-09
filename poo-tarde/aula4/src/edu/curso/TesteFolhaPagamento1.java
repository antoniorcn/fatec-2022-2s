package edu.curso;

public class TesteFolhaPagamento1 {
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.salario = 5000.0;
		
		Funcionario maria = new Funcionario();
		maria.salario = 5000.0;
		
		Funcionario alberto = new Funcionario();
		alberto.salario = 2000.0;
		
		FolhaPagamento folha = new FolhaPagamento();
		// folha.fazPagamento(joao, new double[] {200.0, 500.0, 400.0});
		// folha.fazPagamento(maria, new double[] {500.0, 500.0, 100.0});
		folha.fazPagamento(joao, 200.0, 500.0, 400.0, 150.0);
		folha.fazPagamento(maria, 500.0, 500.0, 100.0, 150.0);
		folha.fazPagamento(alberto);
		
	}
}
