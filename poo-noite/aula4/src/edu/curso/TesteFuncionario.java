package edu.curso;

public class TesteFuncionario {
	
	public static void main(String args[]) {
		
		Funcionario michael = new Funcionario("Michael", "Silva");
		michael.recebeSalario(4200, 200, 500);
		
		Funcionario taina = new Funcionario("Taina", "Souza");
		//  taina.nome = "Taina";
		taina.recebeSalario(4700, 300, 600, 600, 700, 100, 200, 500);
		
	}

}
