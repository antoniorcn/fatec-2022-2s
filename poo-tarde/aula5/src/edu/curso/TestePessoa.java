package edu.curso;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
//		p.nome = "Antonio";
//		p.idade = -10;
		p.setNome("Antonio");
		p.setIdade(45);
		System.out.println("Idade : " + p.getIdade());
		p.setIdade(-20);
		System.out.println("Idade : " + p.getIdade());
	}
}
