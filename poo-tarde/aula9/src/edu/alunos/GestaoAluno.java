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
	
	public void excluir() { 
		System.out.println("Informe o RA do aluno(a): ");
		String ra = scan.nextLine();
		for (int i = 0; i < this.alunos.length; i++) { 
			Aluno obj = this.alunos[i];
			if (obj != null && obj.getRa().equals(ra)) { 
				this.alunos[i] = null;
				System.out.println("Aluno excluido com sucesso");
			}
		}
		System.out.println("Tecler <ENTER> para continuar");
		scan.nextLine();
	}
	
	public void listarTodos() { 
		for (Aluno a : this.alunos) { 
			if (a != null) {
				a.exibir();
			}
		}
		System.out.println("Tecler <ENTER> para continuar");
		scan.nextLine();
	}
	
	public void atualizar() { 
		System.out.println("Informe o RA do aluno(a): ");
		String ra = scan.nextLine();
		for (Aluno a : this.alunos) { 
			if (a != null && a.getRa().equals(ra)) {
				System.out.println("Dados atuais do aluno");
				a.exibir();
				System.out.println("Digite o novo RA deste aluno: ");
				a.setRa(scan.nextLine());
				System.out.println("Digite o novo NOME deste aluno: ");
				a.setNome(scan.nextLine());
				System.out.println("Aluno atualizado com sucesso");
				break;
			}
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
			System.out.println("(A)tualizar\t(L)istar todos\t(S)air");
			String textoMaiusculo = scan.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
			if (letra == 'C') { 
				criar();
			} else if (letra == 'E') { 
				exibir();
			} else if (letra == 'R') { 
				excluir();
			} else if (letra == 'A') { 
				atualizar();
			} else if (letra == 'L') { 
				listarTodos();
			} else if (letra == 'S') { 
				System.out.println("Tchau !!!");
				System.exit(0);
			}
		} 
	}
}
