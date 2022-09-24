package edu.scanner;

import java.io.IOException;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws IOException {
		System.out.println("Digite algo e tecle enter:");
//		for (int i = 0; i < 5; i++) { 
//			int tecla = System.in.read();
//			System.out.println(tecla);
//		}
		
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt()) { 
			int num = input.nextInt();
			System.out.println("Digitou: " + num);
		} else { 
		 	System.out.println("Você não digitou um numero inteiro");
		 }
		
		input.close();
	}

}
