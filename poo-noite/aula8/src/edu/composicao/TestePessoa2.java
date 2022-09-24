package edu.composicao;

public class TestePessoa2 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João");
//		p1.idade = 18;
//		p1.idade = -14;
		
		p1.setIdade(18);
		System.out.println("Idade: " + p1.getIdade());
		
		p1.setIdade(-14);
		System.out.println("Idade: " + p1.getIdade());
	}
}
