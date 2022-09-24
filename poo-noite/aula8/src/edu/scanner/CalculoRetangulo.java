package edu.scanner;

import java.util.Scanner;

public class CalculoRetangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculo de area de retangulo");
		System.out.println("Digite a base do retangulo: ");
		if (input.hasNextInt() && input.hasNextInt()) { 
			int base = input.nextInt();
		
			System.out.println("Digite a altura do retangulo: ");
			int altura = input.nextInt();
			
			int area = base * altura;
			System.out.println("Area :" + area);
		}
		
		
		input.close();
	}
}
