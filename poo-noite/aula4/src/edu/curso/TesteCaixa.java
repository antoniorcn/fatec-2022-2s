package edu.curso;
import java.util.Scanner;

public class TesteCaixa {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Caixa c = new Caixa();
		
		while (true) {
			System.out.println("Informe o valor da venda, e -1 para encerrar");
			double valor = scan.nextDouble();
			if (valor < 0) { 
				break;
			}
			c.venda(valor);
		}
		
		System.out.println(c.saldo);
		
		scan.close();
	}

}
