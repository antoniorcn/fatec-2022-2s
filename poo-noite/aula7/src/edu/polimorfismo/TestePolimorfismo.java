package edu.polimorfismo;

public class TestePolimorfismo {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(2000);
		Funcionario f2 = new Funcionario(2400);
		

		FolhaPagamento15 fp = new FolhaPagamento15();
		fp.fazerPagamento(f1);
		fp.fazerPagamento(f2);
	}
}
