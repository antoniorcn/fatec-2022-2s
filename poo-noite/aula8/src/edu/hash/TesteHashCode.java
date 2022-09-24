package edu.hash;

public class TesteHashCode {
	public static void main(String[] args) {
		Celular c1 = new Celular();
		c1.marca = "LG";
		c1.modelo = "K10";
		System.out.println("Celular 1: " + c1.hashCode());
		
		Celular c2 = new Celular();
		c2.marca = "LG";
		c2.modelo = "K10";
		System.out.println("Celular 2: " + c2.hashCode());
		
		System.out.println("São Iguais: " + c1.equals(c2));
	}
}
