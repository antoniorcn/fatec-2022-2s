package edu.curso;

public class Funcionario {
	
	String nome;
	String sobreNome;
	
	public Funcionario(String nome, String valorSobreNome) { 
		this.nome = nome;
		this.sobreNome = valorSobreNome;
	}
	
	public Funcionario() {
		
	}
	
	public void recebeSalario(double salario, 
			double ... beneficios) { 
		double soma = salario;
		for (int i = 0; i < beneficios.length; i++) { 
			soma += beneficios[i];
		}
		System.out.println("Eba o " + this.nome + " recebeu " + soma);
	}

}
