package edu.composicao;

public class TestePessoa3 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jo�o");
		
//		p1.celular.marca = "Samsung";
//		p1.nome = "Jo�o Silva";
		
		Celular c1 = new Celular();
		
		p1.celular = c1;
		c1.dono = p1;
		
	}
}
