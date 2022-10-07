package edu.refeicoes;

import java.util.Scanner;

public class GestaoCardapio {
	private Item[] cardapio = new Item[50];
	private int indice = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void criar() { 
		Item i = new Item();
		System.out.println("Criando novo Item no cardápio");
		System.out.println("Digite o CODIGO para este item: ");
		i.setCodigo(scan.nextLine());
		System.out.println("Digite o NOME para este item: ");
		i.setNome(scan.nextLine());
		System.out.println("Digite o PRECO para este item: ");
		i.setPreco(Double.parseDouble(scan.nextLine()));
		this.cardapio[this.indice] = i;
		this.indice ++;
		System.out.println("Item criado com sucesso");
		System.out.println("Tecle <ENTER> para continuar");
		scan.nextLine();
//		i.setPreco(scan.nextDouble());
//		scan.nextLine();
	}
	
	public void exibir() { 
		for (int i = 0; i < cardapio.length; i++) { 
			Item item = cardapio[i];
			if (item != null) { 
				System.out.println(item);
			}
		}
		
	}
	
	public void menu() { 
		while (true) {
			System.out.println("*** RESTAURANTE - ADS PARA 4 ***");
			System.out.println("*G E S T Ã O  C A R D A P I O *");
			System.out.println("************ MENU **************");
			System.out.println("(C)riar\t(E)xibir\t(S)air");
			System.out.println("Escolha sua opção:");
			
			char opcao = scan.nextLine().toUpperCase().charAt(0);
			
			if ('C' == opcao) {
				criar();
			} else if ('E' == opcao) { 
				exibir();
			} else if ('S' == opcao) { 
				System.exit(0);
			}
		}
		// scan.close();
	}

}
