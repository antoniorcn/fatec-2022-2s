package edu.curso;

public class Pessoa {
	String nome;
	int idade;
	String cpf;
	String endereco;
	String cor;
	int peso;
	
	void dormir() { 
		System.out.println("Pessoa dormindo");
	}
	
	void trabalhar() { 
		System.out.println("Pessoa trabalhando");
	}
	
	void comer() {
		System.out.println("Comendo um pastel na - Casa do pastel");
		peso = peso + 1;
	}

}
