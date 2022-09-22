package edu.polimorfismo;
public class Gerente extends Funcionario {
	// Sobreescrita
	@Override
	public void trabalhar() { 
		System.out.println("Trabalhando em cargo de confiança");
	}
}
