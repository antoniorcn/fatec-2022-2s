package edu.composicao;

public class TestePessoa {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Maria");
		Celular c1 = new Celular();
		Celular c2 = new Celular();
		p1.setCelular(c1);
		p2.setCelular(c2);
		
		
		Pessoa p3 = new Pessoa("Alberto");
		Celular c3 = p1.getCelular();
		p1 = null;
		
		p3.setCelular(c3);
		
		
	}

}
