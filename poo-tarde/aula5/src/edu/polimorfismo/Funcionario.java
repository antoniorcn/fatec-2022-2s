package edu.polimorfismo;
public class Funcionario {
	// Sobrecarga
	public void trabalhar() { 
		System.out.println("Estou trabalhando");
	}
	
	// Sobrecarga
	public void trabalhar(int horas) { 
		System.out.println("Trabalhando " + horas + " horas");
	}

}
