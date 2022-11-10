package edu.curso;

public class Teste {

	public static void main(String[] args) {
		Contador c1 = Contador.getInstance();
		System.out.println("Instancia 1: " + c1);
		Contador c2 = Contador.getInstance();
		System.out.println("Instancia 2: " + c2);
		Contador c3 = Contador.getInstance();
		System.out.println("Instancia 3: " + c3);
	}
	
}
