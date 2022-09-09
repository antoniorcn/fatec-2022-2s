package edu.curso;
import java.util.Scanner;

public class TesteFolhaPagamento2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FolhaPagamento folha = new FolhaPagamento();
		System.out.println("Cadastro de funcionarios");
		
		System.out.println("Digite o salario do funcionário");
		// Funcionario f = new Funcionario(scan.nextDouble());
		Funcionario f = new Funcionario();
		f.salario = scan.nextDouble();
		
//		System.out.println("Informe quantos beneficios este funcioario vai receber");
//		int qtdBeneficios = scan.nextInt();
		
		System.out.println("Digite o valor do beneficio 1");
		double ben1 = scan.nextDouble();
		
		System.out.println("Digite o valor do beneficio 2");
		double ben2 = scan.nextDouble();
		
		folha.fazPagamento(f, ben1, ben2);
		
		scan.close();
	}

}
