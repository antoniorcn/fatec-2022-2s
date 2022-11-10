package edu.curso;

import java.util.Scanner;

public class TesteScan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite a peso: ");
		float peso = scan.nextFloat();
		scan.nextLine();
		
		System.out.println("Digite o nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Nome: " + nome);
	}
}
