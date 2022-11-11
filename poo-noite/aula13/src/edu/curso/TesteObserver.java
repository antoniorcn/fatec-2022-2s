package edu.curso;

public class TesteObserver {
	
	public static void main(String[] args) {
		Jornal folha = new Jornal("Folha");
		Jornal nyt = new Jornal("NYT");
		
		Trabalhador paulo = new Trabalhador("Paulo");
		
		Estudante joao = new Estudante("Joao");
		Estudante maria = new Estudante("Maria");
		
		folha.adicionar(maria);
		folha.adicionar(joao);
		
		nyt.adicionar(maria);
		nyt.adicionar(paulo);
		
		folha.publicar("alta do dolar");
		nyt.publicar("No more red wave");
	}

}
