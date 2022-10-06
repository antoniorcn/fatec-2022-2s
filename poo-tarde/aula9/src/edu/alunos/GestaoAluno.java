package edu.alunos;

import java.time.LocalDate;
import java.util.Scanner;

public class GestaoAluno {
	private Aluno[] alunos = new Aluno[50];
	private int indice = 0;
	Scanner scan = new Scanner(System.in);

	public void criar() {
		Aluno a = new Aluno();
		System.out.println("Informe os dados do aluno: ");
		a.setId(0);
		System.out.println("Digite o RA: ");
		a.setRa(scan.nextLine());
		System.out.println("Digite o Nome: ");
		a.setNome(scan.nextLine());
		a.setNascimento(LocalDate.now());
		this.alunos[this.indice] = a;
		this.indice += 1;
		System.out.println("Aluno criado com sucesso");
		System.out.println("Tecler <ENTER> para continuar");
		scan.nextLine();
	}

	public void exibir() { 
		System.out.println("Informe o RA do aluno(a): ");
		String ra = scan.nextLine();

		int i = 0;
		while (i < alunos.length) { 
			Aluno objAluno = alunos[i];
			if (objAluno != null && objAluno.getRa().contains(ra)) { 
				objAluno.exibir();
			}
			i += 1;
		}
		
		System.out.println("Tecler <ENTER> para continuar");
		scan.nextLine();
	}


	public void menu() { 
		while(true) {
			// Limpar a console
			for (int i = 0; i < 50; ++i) System.out.println();
			
			System.out.println("M E N U  P R I N C I P A L");
			System.out.println("**** GESTÃO DE ALUNOS ****");
			System.out.println("Escolha uma opção: ");
			System.out.println("(C)riar\t\t(E)xibir\t(R)emover");
			System.out.println("(A)tualizar\t(S)air");
			String textoMaiusculo = scan.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
			if (letra == 'C') { 
				criar();
			} else if (letra == 'E') { 
				exibir();
			} else if (letra == 'R') { 
			} else if (letra == 'A') { 
			} else if (letra == 'S') { 
				System.out.println("Tchau !!!");
				System.exit(0);
			}
		} 
	}
}
